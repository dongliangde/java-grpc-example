package server;


import com.example.grpc.client.ClientStreamProto;
import com.example.grpc.client.StreamClientGrpc;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.ThreadLocalRandom;

public class ClientStreamImpl extends StreamClientGrpc.StreamClientImplBase {
    @Override
    public void route(
            ClientStreamProto.SimpleRequest request, StreamObserver<ClientStreamProto.SimpleResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);

        String greeting = new StringBuilder().append("Hello, ")
                .append(request.getData())
                .append(" ")
                .toString();

        ClientStreamProto.SimpleResponse response = ClientStreamProto.SimpleResponse.newBuilder()
                .setValue(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<ClientStreamProto.StreamRequest> routeList(StreamObserver<ClientStreamProto.SimpleResponse> responseObserver) {
        return new StreamObserver<ClientStreamProto.StreamRequest>() {
            int count;

            @Override
            public void onNext(ClientStreamProto.StreamRequest stream) {
                System.out.println(stream);
                count++;
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(ClientStreamProto.SimpleResponse.newBuilder()
                        .setValue(count + "")
                        .build());
                responseObserver.onCompleted();
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }
        };
    }
}
