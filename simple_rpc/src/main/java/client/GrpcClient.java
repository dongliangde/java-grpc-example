package client;

import com.example.grpc.simple.SimpleGrpc;
import com.example.grpc.simple.SimpleProto;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
            .usePlaintext()
            .build();

        SimpleGrpc.SimpleBlockingStub stub = SimpleGrpc.newBlockingStub(channel);

        SimpleProto.SimpleResponse simpleResponse = stub.route(SimpleProto.SimpleRequest.newBuilder()
                .setData("test")
                .build());

        System.out.println("Response received from server:\n" + simpleResponse);

        channel.shutdown();
    }
}
