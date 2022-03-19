package server;

import com.example.grpc.stream.ServerStreamProto;
import com.example.grpc.stream.StreamServerGrpc;
import com.google.protobuf.ByteString;
import io.grpc.stub.StreamObserver;

public class ServerStreamImpl extends StreamServerGrpc.StreamServerImplBase {
    @Override
    public void route(
            ServerStreamProto.SimpleRequest request, StreamObserver<ServerStreamProto.SimpleResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);

        String greeting = new StringBuilder().append("Hello, ")
                .append(request.getData())
                .append(" ")
                .toString();

        ServerStreamProto.SimpleResponse response = ServerStreamProto.SimpleResponse.newBuilder()
                .setValue(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listValue(
            ServerStreamProto.SimpleRequest request, StreamObserver<ServerStreamProto.StreamResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);
        for (int i = 1; i <= 100; i++) {
            String greeting = new StringBuilder().append("Hello, " + i)
                    .append(request.getData())
                    .append(" ")
                    .toString();
            ServerStreamProto.StreamResponse response = ServerStreamProto.StreamResponse.newBuilder()
                    .setStreamValue(ByteString.copyFromUtf8(greeting))
                    .build();
            responseObserver.onNext(response);
            //休眠100ms
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        responseObserver.onCompleted();
    }
}
