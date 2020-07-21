/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1beta1/service.proto

package com.google.cloud.notebooks.v1beta1;

public interface IsInstanceUpgradeableResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If an instance is upgradeable.
   * </pre>
   *
   * <code>bool upgradeable = 1;</code>
   *
   * @return The upgradeable.
   */
  boolean getUpgradeable();

  /**
   *
   *
   * <pre>
   * The version this instance will be upgraded to if calling the upgrade
   * endpoint. This field will only be populated if field upgradeable is true.
   * </pre>
   *
   * <code>string upgrade_version = 2;</code>
   *
   * @return The upgradeVersion.
   */
  java.lang.String getUpgradeVersion();
  /**
   *
   *
   * <pre>
   * The version this instance will be upgraded to if calling the upgrade
   * endpoint. This field will only be populated if field upgradeable is true.
   * </pre>
   *
   * <code>string upgrade_version = 2;</code>
   *
   * @return The bytes for upgradeVersion.
   */
  com.google.protobuf.ByteString getUpgradeVersionBytes();
}
