package com.example.grpc.both;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: both_stream.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StreamGrpc {

  private StreamGrpc() {}

  public static final String SERVICE_NAME = "proto.Stream";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.both.BothStreamProto.SimpleRequest,
      com.example.grpc.both.BothStreamProto.SimpleResponse> getRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Route",
      requestType = com.example.grpc.both.BothStreamProto.SimpleRequest.class,
      responseType = com.example.grpc.both.BothStreamProto.SimpleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.both.BothStreamProto.SimpleRequest,
      com.example.grpc.both.BothStreamProto.SimpleResponse> getRouteMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.both.BothStreamProto.SimpleRequest, com.example.grpc.both.BothStreamProto.SimpleResponse> getRouteMethod;
    if ((getRouteMethod = StreamGrpc.getRouteMethod) == null) {
      synchronized (StreamGrpc.class) {
        if ((getRouteMethod = StreamGrpc.getRouteMethod) == null) {
          StreamGrpc.getRouteMethod = getRouteMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.both.BothStreamProto.SimpleRequest, com.example.grpc.both.BothStreamProto.SimpleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Route"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.both.BothStreamProto.SimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.both.BothStreamProto.SimpleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StreamMethodDescriptorSupplier("Route"))
              .build();
        }
      }
    }
    return getRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.both.BothStreamProto.StreamRequest,
      com.example.grpc.both.BothStreamProto.StreamResponse> getConversationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Conversations",
      requestType = com.example.grpc.both.BothStreamProto.StreamRequest.class,
      responseType = com.example.grpc.both.BothStreamProto.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.both.BothStreamProto.StreamRequest,
      com.example.grpc.both.BothStreamProto.StreamResponse> getConversationsMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.both.BothStreamProto.StreamRequest, com.example.grpc.both.BothStreamProto.StreamResponse> getConversationsMethod;
    if ((getConversationsMethod = StreamGrpc.getConversationsMethod) == null) {
      synchronized (StreamGrpc.class) {
        if ((getConversationsMethod = StreamGrpc.getConversationsMethod) == null) {
          StreamGrpc.getConversationsMethod = getConversationsMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.both.BothStreamProto.StreamRequest, com.example.grpc.both.BothStreamProto.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Conversations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.both.BothStreamProto.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.both.BothStreamProto.StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StreamMethodDescriptorSupplier("Conversations"))
              .build();
        }
      }
    }
    return getConversationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamStub>() {
        @java.lang.Override
        public StreamStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamStub(channel, callOptions);
        }
      };
    return StreamStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamBlockingStub>() {
        @java.lang.Override
        public StreamBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamBlockingStub(channel, callOptions);
        }
      };
    return StreamBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StreamFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamFutureStub>() {
        @java.lang.Override
        public StreamFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamFutureStub(channel, callOptions);
        }
      };
    return StreamFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static abstract class StreamImplBase implements io.grpc.BindableService {

    /**
     */
    public void route(com.example.grpc.both.BothStreamProto.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.both.BothStreamProto.SimpleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 双向流式rpc，同时在请求参数前和响应参数前加上stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.both.BothStreamProto.StreamRequest> conversations(
        io.grpc.stub.StreamObserver<com.example.grpc.both.BothStreamProto.StreamResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getConversationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.both.BothStreamProto.SimpleRequest,
                com.example.grpc.both.BothStreamProto.SimpleResponse>(
                  this, METHODID_ROUTE)))
          .addMethod(
            getConversationsMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.grpc.both.BothStreamProto.StreamRequest,
                com.example.grpc.both.BothStreamProto.StreamResponse>(
                  this, METHODID_CONVERSATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static final class StreamStub extends io.grpc.stub.AbstractAsyncStub<StreamStub> {
    private StreamStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamStub(channel, callOptions);
    }

    /**
     */
    public void route(com.example.grpc.both.BothStreamProto.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.both.BothStreamProto.SimpleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 双向流式rpc，同时在请求参数前和响应参数前加上stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.both.BothStreamProto.StreamRequest> conversations(
        io.grpc.stub.StreamObserver<com.example.grpc.both.BothStreamProto.StreamResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getConversationsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static final class StreamBlockingStub extends io.grpc.stub.AbstractBlockingStub<StreamBlockingStub> {
    private StreamBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.both.BothStreamProto.SimpleResponse route(com.example.grpc.both.BothStreamProto.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRouteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static final class StreamFutureStub extends io.grpc.stub.AbstractFutureStub<StreamFutureStub> {
    private StreamFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.both.BothStreamProto.SimpleResponse> route(
        com.example.grpc.both.BothStreamProto.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRouteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ROUTE = 0;
  private static final int METHODID_CONVERSATIONS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StreamImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ROUTE:
          serviceImpl.route((com.example.grpc.both.BothStreamProto.SimpleRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.both.BothStreamProto.SimpleResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERSATIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.conversations(
              (io.grpc.stub.StreamObserver<com.example.grpc.both.BothStreamProto.StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreamBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.both.BothStreamProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Stream");
    }
  }

  private static final class StreamFileDescriptorSupplier
      extends StreamBaseDescriptorSupplier {
    StreamFileDescriptorSupplier() {}
  }

  private static final class StreamMethodDescriptorSupplier
      extends StreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StreamMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StreamGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreamFileDescriptorSupplier())
              .addMethod(getRouteMethod())
              .addMethod(getConversationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
