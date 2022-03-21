package client;

import com.example.grpc.client.ClientStreamProto;
import com.example.grpc.client.StreamClientGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GrpcClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 8080)
                .usePlaintext()
                .build();
        StreamClientGrpc.StreamClientStub streamClientBlockingStub = StreamClientGrpc.newStub(channel);
        final CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<ClientStreamProto.SimpleResponse> responseObserver = new StreamObserver<ClientStreamProto.SimpleResponse>() {
            @Override
            public void onNext(ClientStreamProto.SimpleResponse simpleResponse) {
                System.out.println(simpleResponse.getValue());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(Status.fromThrowable(throwable));
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished onError");
                finishLatch.countDown();
            }
        };

        StreamObserver<ClientStreamProto.StreamRequest> requestStreamObserver = streamClientBlockingStub.routeList(responseObserver);
        try {
            for (int i = 1; i <= 100; i++) {
                ClientStreamProto.StreamRequest streamRequest = ClientStreamProto.StreamRequest.
                        newBuilder().
                        setStreamData(i + "").
                        build();
                requestStreamObserver.onNext(streamRequest);
                if (finishLatch.getCount() == 0) {
                    return;
                }
                //休眠100ms
                Thread.sleep(100);
            }
        } catch (RuntimeException e) {
            requestStreamObserver.onError(e);
            throw e;
        }
        requestStreamObserver.onCompleted();
        if (!finishLatch.await(1, TimeUnit.MINUTES)) {
            System.out.println("routeList can not finish within 1 minutes");
        }
    }
}
