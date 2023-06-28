/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: eventmesh-service.proto

package org.apache.eventmesh.common.protocol.grpc.cloudevents;

public final class EventMeshGrpcService {
  private EventMeshGrpcService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\027eventmesh-service.proto\022#org.apache.ev" +
      "entmesh.cloudevents.v1\032\033google/protobuf/" +
      "empty.proto\032\033eventmesh-cloudevents.proto" +
      "2\246\004\n\020PublisherService\022k\n\007publish\022/.org.a" +
      "pache.eventmesh.cloudevents.v1.CloudEven" +
      "t\032/.org.apache.eventmesh.cloudevents.v1." +
      "CloudEvent\022p\n\014publishReply\022/.org.apache." +
      "eventmesh.cloudevents.v1.CloudEvent\032/.or" +
      "g.apache.eventmesh.cloudevents.v1.CloudE" +
      "vent\022X\n\rpublishOneWay\022/.org.apache.event" +
      "mesh.cloudevents.v1.CloudEvent\032\026.google." +
      "protobuf.Empty\022u\n\014batchPublish\0224.org.apa" +
      "che.eventmesh.cloudevents.v1.CloudEventB" +
      "atch\032/.org.apache.eventmesh.cloudevents." +
      "v1.CloudEvent\022b\n\022batchPublishOneWay\0224.or" +
      "g.apache.eventmesh.cloudevents.v1.CloudE" +
      "ventBatch\032\026.google.protobuf.Empty2\352\002\n\017Co" +
      "nsumerService\022m\n\tsubscribe\022/.org.apache." +
      "eventmesh.cloudevents.v1.CloudEvent\032/.or" +
      "g.apache.eventmesh.cloudevents.v1.CloudE" +
      "vent\022w\n\017subscribeStream\022/.org.apache.eve" +
      "ntmesh.cloudevents.v1.CloudEvent\032/.org.a" +
      "pache.eventmesh.cloudevents.v1.CloudEven" +
      "t(\0010\001\022o\n\013unsubscribe\022/.org.apache.eventm" +
      "esh.cloudevents.v1.CloudEvent\032/.org.apac" +
      "he.eventmesh.cloudevents.v1.CloudEvent2\201" +
      "\001\n\020HeartbeatService\022m\n\theartbeat\022/.org.a" +
      "pache.eventmesh.cloudevents.v1.CloudEven" +
      "t\032/.org.apache.eventmesh.cloudevents.v1." +
      "CloudEventBO\n5org.apache.eventmesh.commo" +
      "n.protocol.grpc.cloudeventsB\024EventMeshGr" +
      "pcServiceP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          EventMeshCloudEvents.getDescriptor(),
        });
    com.google.protobuf.EmptyProto.getDescriptor();
    EventMeshCloudEvents.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
