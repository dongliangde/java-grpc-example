package com.example.grpc.stream;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: server_stream.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StreamServerGrpc {

  private StreamServerGrpc() {}

  public static final String SERVICE_NAME = "proto.StreamServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.stream.ServerStreamProto.SimpleRequest,
      com.example.grpc.stream.ServerStreamProto.SimpleResponse> getRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Route",
      requestType = com.example.grpc.stream.ServerStreamProto.SimpleRequest.class,
      responseType = com.example.grpc.stream.ServerStreamProto.SimpleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.stream.ServerStreamProto.SimpleRequest,
      com.example.grpc.stream.ServerStreamProto.SimpleResponse> getRouteMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.stream.ServerStreamProto.SimpleRequest, com.example.grpc.stream.ServerStreamProto.SimpleResponse> getRouteMethod;
    if ((getRouteMethod = StreamServerGrpc.getRouteMethod) == null) {
      synchronized (StreamServerGrpc.class) {
        if ((getRouteMethod = StreamServerGrpc.getRouteMethod) == null) {
          StreamServerGrpc.getRouteMethod = getRouteMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.stream.ServerStreamProto.SimpleRequest, com.example.grpc.stream.ServerStreamProto.SimpleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Route"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.stream.ServerStreamProto.SimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.stream.ServerStreamProto.SimpleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServerMethodDescriptorSupplier("Route"))
              .build();
        }
      }
    }
    return getRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.stream.ServerStreamProto.SimpleRequest,
      com.example.grpc.stream.ServerStreamProto.StreamResponse> getListValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListValue",
      requestType = com.example.grpc.stream.ServerStreamProto.SimpleRequest.class,
      responseType = com.example.grpc.stream.ServerStreamProto.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.stream.ServerStreamProto.SimpleRequest,
      com.example.grpc.stream.ServerStreamProto.StreamResponse> getListValueMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.stream.ServerStreamProto.SimpleRequest, com.example.grpc.stream.ServerStreamProto.StreamResponse> getListValueMethod;
    if ((getListValueMethod = StreamServerGrpc.getListValueMethod) == null) {
      synchronized (StreamServerGrpc.class) {
        if ((getListValueMethod = StreamServerGrpc.getListValueMethod) == null) {
          StreamServerGrpc.getListValueMethod = getListValueMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.stream.ServerStreamProto.SimpleRequest, com.example.grpc.stream.ServerStreamProto.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.stream.ServerStreamProto.SimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.stream.ServerStreamProto.StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StreamServerMethodDescriptorSupplier("ListValue"))
              .build();
        }
      }
    }
    return getListValueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamServerStub>() {
        @java.lang.Override
        public StreamServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamServerStub(channel, callOptions);
        }
      };
    return StreamServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamServerBlockingStub>() {
        @java.lang.Override
        public StreamServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamServerBlockingStub(channel, callOptions);
        }
      };
    return StreamServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StreamServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamServerFutureStub>() {
        @java.lang.Override
        public StreamServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamServerFutureStub(channel, callOptions);
        }
      };
    return StreamServerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static abstract class StreamServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void route(com.example.grpc.stream.ServerStreamProto.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.stream.ServerStreamProto.SimpleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 服务端流式rpc，在响应数据前添加stream
     * </pre>
     */
    public void listValue(com.example.grpc.stream.ServerStreamProto.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.stream.ServerStreamProto.StreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListValueMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.stream.ServerStreamProto.SimpleRequest,
                com.example.grpc.stream.ServerStreamProto.SimpleResponse>(
                  this, METHODID_ROUTE)))
          .addMethod(
            getListValueMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.example.grpc.stream.ServerStreamProto.SimpleRequest,
                com.example.grpc.stream.ServerStreamProto.StreamResponse>(
                  this, METHODID_LIST_VALUE)))
          .build();
    }
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static final class StreamServerStub extends io.grpc.stub.AbstractAsyncStub<StreamServerStub> {
    private StreamServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamServerStub(channel, callOptions);
    }

    /**
     */
    public void route(com.example.grpc.stream.ServerStreamProto.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.stream.ServerStreamProto.SimpleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 服务端流式rpc，在响应数据前添加stream
     * </pre>
     */
    public void listValue(com.example.grpc.stream.ServerStreamProto.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.stream.ServerStreamProto.StreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListValueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static final class StreamServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<StreamServerBlockingStub> {
    private StreamServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.stream.ServerStreamProto.SimpleResponse route(com.example.grpc.stream.ServerStreamProto.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 服务端流式rpc，在响应数据前添加stream
     * </pre>
     */
    public java.util.Iterator<com.example.grpc.stream.ServerStreamProto.StreamResponse> listValue(
        com.example.grpc.stream.ServerStreamProto.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListValueMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static final class StreamServerFutureStub extends io.grpc.stub.AbstractFutureStub<StreamServerFutureStub> {
    private StreamServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.stream.ServerStreamProto.SimpleResponse> route(
        com.example.grpc.stream.ServerStreamProto.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRouteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ROUTE = 0;
  private static final int METHODID_LIST_VALUE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StreamServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ROUTE:
          serviceImpl.route((com.example.grpc.stream.ServerStreamProto.SimpleRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.stream.ServerStreamProto.SimpleResponse>) responseObserver);
          break;
        case METHODID_LIST_VALUE:
          serviceImpl.listValue((com.example.grpc.stream.ServerStreamProto.SimpleRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.stream.ServerStreamProto.StreamResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StreamServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreamServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.stream.ServerStreamProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StreamServer");
    }
  }

  private static final class StreamServerFileDescriptorSupplier
      extends StreamServerBaseDescriptorSupplier {
    StreamServerFileDescriptorSupplier() {}
  }

  private static final class StreamServerMethodDescriptorSupplier
      extends StreamServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StreamServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (StreamServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreamServerFileDescriptorSupplier())
              .addMethod(getRouteMethod())
              .addMethod(getListValueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
