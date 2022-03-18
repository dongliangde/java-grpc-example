package com.example.grpc.simple;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: simple.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SimpleGrpc {

  private SimpleGrpc() {}

  public static final String SERVICE_NAME = "proto.Simple";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.simple.SimpleProto.SimpleRequest,
      com.example.grpc.simple.SimpleProto.SimpleResponse> getRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Route",
      requestType = com.example.grpc.simple.SimpleProto.SimpleRequest.class,
      responseType = com.example.grpc.simple.SimpleProto.SimpleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.simple.SimpleProto.SimpleRequest,
      com.example.grpc.simple.SimpleProto.SimpleResponse> getRouteMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.simple.SimpleProto.SimpleRequest, com.example.grpc.simple.SimpleProto.SimpleResponse> getRouteMethod;
    if ((getRouteMethod = SimpleGrpc.getRouteMethod) == null) {
      synchronized (SimpleGrpc.class) {
        if ((getRouteMethod = SimpleGrpc.getRouteMethod) == null) {
          SimpleGrpc.getRouteMethod = getRouteMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.simple.SimpleProto.SimpleRequest, com.example.grpc.simple.SimpleProto.SimpleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Route"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.simple.SimpleProto.SimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.simple.SimpleProto.SimpleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SimpleMethodDescriptorSupplier("Route"))
              .build();
        }
      }
    }
    return getRouteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SimpleStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleStub>() {
        @java.lang.Override
        public SimpleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleStub(channel, callOptions);
        }
      };
    return SimpleStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SimpleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleBlockingStub>() {
        @java.lang.Override
        public SimpleBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleBlockingStub(channel, callOptions);
        }
      };
    return SimpleBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SimpleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SimpleFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SimpleFutureStub>() {
        @java.lang.Override
        public SimpleFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SimpleFutureStub(channel, callOptions);
        }
      };
    return SimpleFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static abstract class SimpleImplBase implements io.grpc.BindableService {

    /**
     */
    public void route(com.example.grpc.simple.SimpleProto.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.simple.SimpleProto.SimpleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRouteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.simple.SimpleProto.SimpleRequest,
                com.example.grpc.simple.SimpleProto.SimpleResponse>(
                  this, METHODID_ROUTE)))
          .build();
    }
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static final class SimpleStub extends io.grpc.stub.AbstractAsyncStub<SimpleStub> {
    private SimpleStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleStub(channel, callOptions);
    }

    /**
     */
    public void route(com.example.grpc.simple.SimpleProto.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.simple.SimpleProto.SimpleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRouteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static final class SimpleBlockingStub extends io.grpc.stub.AbstractBlockingStub<SimpleBlockingStub> {
    private SimpleBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.simple.SimpleProto.SimpleResponse route(com.example.grpc.simple.SimpleProto.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRouteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 定义我们的服务（可定义多个服务,每个服务可定义多个接口）
   * </pre>
   */
  public static final class SimpleFutureStub extends io.grpc.stub.AbstractFutureStub<SimpleFutureStub> {
    private SimpleFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SimpleFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.simple.SimpleProto.SimpleResponse> route(
        com.example.grpc.simple.SimpleProto.SimpleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRouteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ROUTE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SimpleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SimpleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ROUTE:
          serviceImpl.route((com.example.grpc.simple.SimpleProto.SimpleRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.simple.SimpleProto.SimpleResponse>) responseObserver);
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

  private static abstract class SimpleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SimpleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.simple.SimpleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Simple");
    }
  }

  private static final class SimpleFileDescriptorSupplier
      extends SimpleBaseDescriptorSupplier {
    SimpleFileDescriptorSupplier() {}
  }

  private static final class SimpleMethodDescriptorSupplier
      extends SimpleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SimpleMethodDescriptorSupplier(String methodName) {
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
      synchronized (SimpleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SimpleFileDescriptorSupplier())
              .addMethod(getRouteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
