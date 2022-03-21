package client;

import com.example.grpc.both.BothStreamProto;
import com.example.grpc.both.StreamGrpc;
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
        StreamGrpc.StreamStub streamStub = StreamGrpc.newStub(channel);
        final CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<BothStreamProto.StreamResponse> responseObserver = new StreamObserver<BothStreamProto.StreamResponse>() {
            @Override
            public void onNext(BothStreamProto.StreamResponse simpleResponse) {
                System.out.println(simpleResponse.getAnswer());
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

        StreamObserver<BothStreamProto.StreamRequest> requestStreamObserver = streamStub.conversations(responseObserver);
        try {
            for (int i = 1; i <= 3; i++) {
                BothStreamProto.StreamRequest streamRequest = BothStreamProto.StreamRequest.
                        newBuilder().
                        setQuestion(i + "").
                        build();
                requestStreamObserver.onNext(streamRequest);
                if (finishLatch.getCount() == 0) {
                    return;
                }
                Thread.sleep(1000);
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
