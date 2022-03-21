package server;

import com.example.grpc.both.BothStreamProto;
import com.example.grpc.both.StreamGrpc;
import io.grpc.stub.StreamObserver;

public class BothStreamImpl extends StreamGrpc.StreamImplBase {
    @Override
    public void route(
            BothStreamProto.SimpleRequest request, StreamObserver<BothStreamProto.SimpleResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);

        String greeting = new StringBuilder().append("Hello, ")
                .append(request.getData())
                .append(" ")
                .toString();

        BothStreamProto.SimpleResponse response = BothStreamProto.SimpleResponse.newBuilder()
                .setValue(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<BothStreamProto.StreamRequest> conversations(StreamObserver<BothStreamProto.StreamResponse> responseObserver) {
        return new StreamObserver<BothStreamProto.StreamRequest>() {
            @Override
            public void onNext(BothStreamProto.StreamRequest streamRequest) {
                for (int i = 1; i <= 10; i++) {
                    BothStreamProto.StreamResponse stockQuote = BothStreamProto.StreamResponse.newBuilder()
                            .setAnswer(i + "")
                            .build();
                    System.out.println(i);
                    responseObserver.onNext(stockQuote);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
