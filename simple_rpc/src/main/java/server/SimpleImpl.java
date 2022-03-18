package server;

import com.example.grpc.simple.SimpleGrpc;
import com.example.grpc.simple.SimpleProto;
import io.grpc.stub.StreamObserver;

public class SimpleImpl  extends SimpleGrpc.SimpleImplBase {

    @Override
    public void route(
            SimpleProto.SimpleRequest request, StreamObserver<SimpleProto.SimpleResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);

        String greeting = new StringBuilder().append("Hello, ")
                .append(request.getData())
                .append(" ")
                .toString();

        SimpleProto.SimpleResponse response = SimpleProto.SimpleResponse.newBuilder()
                .setValue(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
