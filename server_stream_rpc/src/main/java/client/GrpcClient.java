package client;

import com.example.grpc.stream.ServerStreamProto;
import com.example.grpc.stream.StreamServerGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

public class GrpcClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
            .usePlaintext()
            .build();

        StreamServerGrpc.StreamServerBlockingStub serverBlockingStub = StreamServerGrpc.newBlockingStub(channel);
        Iterator<ServerStreamProto.StreamResponse> responseIterator = serverBlockingStub.listValue(ServerStreamProto.SimpleRequest.newBuilder()
                .setData("test")
                .build());
        for (int i = 1; responseIterator.hasNext(); i++) {
            ServerStreamProto.StreamResponse streamResponse = responseIterator.next();
            System.out.println("RESPONSE - Price #" + i + ": {}"+streamResponse.getStreamValue());
        }
        channel.shutdown();
    }
}
