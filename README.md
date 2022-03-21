# java-grpc-example

##前言

gRPC 是一个高性能、开源和通用的 RPC 框架，面向移动和 HTTP/2 设计，带来诸如双向流、流控、头部压缩、单 TCP 连接上的多复用请求等特。这些特性使得其在移动设备上表现更好，更省电和节省空间占用。

在 gRPC 里客户端应用可以像调用本地对象一样直接调用另一台不同的机器上服务端应用的方法，使得您能够更容易地创建分布式应用和服务。

gRPC 默认使用 protocol buffers，这是 Google 开源的一套成熟的结构数据序列化机制，它的作用与 XML、json 类似，但它是二进制格式，性能好、效率高（缺点：可读性差）。

##gRPC主要有4种请求和响应模式
分别是简单模式(Simple RPC)、服务端流式（Server-side streaming RPC）、客户端流式（Client-side streaming RPC）、和双向流式（Bidirectional streaming RPC）。

- 简单模式(Simple RPC)：客户端发起请求并等待服务端响应。

- 服务端流式（Server-side streaming RPC）：客户端发送请求到服务器，拿到一个流去读取返回的消息序列。 客户端读取返回的流，直到里面没有任何消息。

- 客户端流式（Client-side streaming RPC）：与服务端数据流模式相反，这次是客户端源源不断的向服务端发送数据流，而在发送结束后，由服务端返回一个响应。

- 双向流式（Bidirectional streaming RPC）：双方使用读写流去发送一个消息序列，两个流独立操作，双方可以同时发送和同时接收。


##代码生成
###protoc
安装 protoc#
1.下载地址：https://github.com/protocolbuffers/protobuf/releases

根据自身电脑的操作系统，选择最新的releases版本下载

2.解压后在bin目录找到protoc.exe，然后把它复制到GOBIN目录下

一般操作是把protoc.exe所在的目录配到环境变量里，这里直接把protoc.exe复制到GOBIN目录下，前提是环境变量已经配置了GOBIN环境变量。

3.打开cmd，运行protoc --version

成功打印当前版本信息证明安装成功了。
###maven
添加Maven依赖

```
<dependency>
    <groupId>io.grpc</groupId>
    <artifactId>grpc-netty</artifactId>
    <version>1.16.1</version>
</dependency>
<dependency>
    <groupId>io.grpc</groupId>
    <artifactId>grpc-protobuf</artifactId>
    <version>1.16.1</version>
</dependency>
<dependency>
    <groupId>io.grpc</groupId>
    <artifactId>grpc-stub</artifactId>
    <version>1.16.1</version>
</dependency>
```

使用maven插件

```
<build>
  <extensions>
    <extension>
      <groupId>kr.motd.maven</groupId>
      <artifactId>os-maven-plugin</artifactId>
      <version>1.6.1</version>
    </extension>
  </extensions>
  <plugins>
    <plugin>
      <groupId>org.xolstice.maven.plugins</groupId>
      <artifactId>protobuf-maven-plugin</artifactId>
      <version>0.6.1</version>
      <configuration>
        <protocArtifact>
          com.google.protobuf:protoc:3.3.0:exe:${os.detected.classifier}
        </protocArtifact>
        <pluginId>grpc-java</pluginId>
        <pluginArtifact>
          io.grpc:protoc-gen-grpc-java:1.4.0:exe:${os.detected.classifier}
        </pluginArtifact>
      </configuration>
      <executions>
        <execution>
          <goals>
            <goal>compile</goal>
            <goal>compile-custom</goal>
          </goals>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```

