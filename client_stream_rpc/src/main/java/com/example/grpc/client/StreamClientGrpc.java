package com.example.grpc.client;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: client_stream.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StreamClientGrpc {

  private StreamClientGrpc() {}

  public static final String SERVICE_NAME = "proto.StreamClient";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.client.ClientStreamProto.SimpleRequest,
      com.example.grpc.client.ClientStreamProto.SimpleResponse> getRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Route",
      requestType = com.example.grpc.client.ClientStreamProto.SimpleRequest.class,
      responseType = com.example.grpc.client.ClientStreamProto.SimpleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.client.ClientStreamProto.SimpleRequest,
      com.example.grpc.client.ClientStreamProto.SimpleResponse> getRouteMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.client.ClientStreamProto.SimpleRequest, com.example.grpc.client.ClientStreamProto.SimpleResponse> getRouteMethod;
    if ((getRouteMethod = StreamClientGrpc.getRouteMethod) == null) {
      synchronized (StreamClientGrpc.class) {
        if ((getRouteMethod = StreamClientGrpc.getRouteMethod) == null) {
          StreamClientGrpc.getRouteMethod = getRouteMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.client.ClientStreamProto.SimpleRequest, com.example.grpc.client.ClientStreamProto.SimpleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Route"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.client.ClientStreamProto.SimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.client.ClientStreamProto.SimpleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StreamClientMethodDescriptorSupplier("Route"))
              .build();
        }
      }
    }
    return getRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.client.ClientStreamProto.StreamRequest,
      com.example.grpc.client.ClientStreamProto.SimpleResponse> getRouteListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RouteList",
      requestType = com.example.grpc.client.ClientStreamProto.StreamRequest.class,
      responseType = com.example.grpc.client.ClientStreamProto.SimpleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.client.ClientStreamProto.StreamRequest,
      com.example.grpc.client.ClientStreamProto.SimpleResponse> getRouteListMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.client.ClientStreamProto.StreamRequest, com.example.grpc.client.ClientStreamProto.SimpleResponse> getRouteListMethod;
    if ((getRouteListMethod = StreamClientGrpc.getRouteListMethod) == null) {
      synchronized (StreamClientGrpc.class) {
        if ((getRouteListMethod = StreamClientGrpc.getRouteListMethod) == null) {
          StreamClientGrpc.getRouteListMethod = getRouteListMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.client.ClientStreamProto.StreamRequest, com.example.grpc.client.ClientStreamProto.SimpleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RouteList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.client.ClientStreamProto.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.client.ClientStreamProto.SimpleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StreamClientMethodDescriptorSupplier("RouteList"))
              .build();
        }
      }
    }
    return getRouteListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamClientStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamClientStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamClientStub>() {
        @java.lang.Override
        public StreamClientStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamClientStub(channel, callOptions);
        }
      };
    return StreamClientStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamClientBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamClientBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamClientBlockingStub>() {
        @java.lang.Override
        public StreamClientBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamClientBlockingStub(channel, callOptions);
        }
      };
    return StreamClientBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StreamClientFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamClientFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamClientFutureStub>() {
        @java.lang.Override
        public StreamClientFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamClientFutureStub(channel, callOptions);
        }
      };
    return StreamClientFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static abstract class StreamClientImplBase implements io.grpc.BindableService {

    /**
     */
    public void route(com.example.grpc.client.ClientStreamProto.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.client.ClientStreamProto.SimpleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 客户端流式rpc，在请求的参数前添加stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.client.ClientStreamProto.StreamRequest> routeList(
        io.grpc.stub.StreamObserver<com.example.grpc.client.ClientStreamProto.SimpleResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRouteListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.client.ClientStreamProto.SimpleRequest,
                com.example.grpc.client.ClientStreamProto.SimpleResponse>(
                  this, METHODID_ROUTE)))
          .addMethod(
            getRouteListMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.example.grpc.client.ClientStreamProto.StreamRequest,
                com.example.grpc.client.ClientStreamProto.SimpleResponse>(
                  this, METHODID_ROUTE_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static final class StreamClientStub extends io.grpc.stub.AbstractAsyncStub<StreamClientStub> {
    private StreamClientStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamClientStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamClientStub(channel, callOptions);
    }

    /**
     */
    public void route(com.example.grpc.client.ClientStreamProto.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.client.ClientStreamProto.SimpleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 客户端流式rpc，在请求的参数前添加stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.client.ClientStreamProto.StreamRequest> routeList(
        io.grpc.stub.StreamObserver<com.example.grpc.client.ClientStreamProto.SimpleResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getRouteListMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static final class StreamClientBlockingStub extends io.grpc.stub.AbstractBlockingStub<StreamClientBlockingStub> {
    private StreamClientBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamClientBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamClientBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.client.ClientStreamProto.SimpleResponse route(com.example.grpc.client.ClientStreamProto.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRouteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static final class StreamClientFutureStub extends io.grpc.stub.AbstractFutureStub<StreamClientFutureStub> {
    private StreamClientFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamClientFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamClientFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.client.ClientStreamProto.SimpleResponse> route(
        com.example.grpc.client.ClientStreamProto.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRouteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ROUTE = 0;
  private static final int METHODID_ROUTE_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamClientImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StreamClientImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ROUTE:
          serviceImpl.route((com.example.grpc.client.ClientStreamProto.SimpleRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.client.ClientStreamProto.SimpleResponse>) responseObserver);
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
        case METHODID_ROUTE_LIST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.routeList(
              (io.grpc.stub.StreamObserver<com.example.grpc.client.ClientStreamProto.SimpleResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StreamClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreamClientBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.client.ClientStreamProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StreamClient");
    }
  }

  private static final class StreamClientFileDescriptorSupplier
      extends StreamClientBaseDescriptorSupplier {
    StreamClientFileDescriptorSupplier() {}
  }

  private static final class StreamClientMethodDescriptorSupplier
      extends StreamClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StreamClientMethodDescriptorSupplier(String methodName) {
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
      synchronized (StreamClientGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreamClientFileDescriptorSupplier())
              .addMethod(getRouteMethod())
              .addMethod(getRouteListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
