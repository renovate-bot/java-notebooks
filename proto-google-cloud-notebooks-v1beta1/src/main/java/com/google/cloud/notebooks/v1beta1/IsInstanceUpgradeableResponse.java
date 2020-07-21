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

/**
 *
 *
 * <pre>
 * Response for checking if a notebook instance is upgradeable.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse}
 */
public final class IsInstanceUpgradeableResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse)
    IsInstanceUpgradeableResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IsInstanceUpgradeableResponse.newBuilder() to construct.
  private IsInstanceUpgradeableResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IsInstanceUpgradeableResponse() {
    upgradeVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IsInstanceUpgradeableResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private IsInstanceUpgradeableResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              upgradeable_ = input.readBool();
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              upgradeVersion_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.notebooks.v1beta1.NotebooksProto
        .internal_static_google_cloud_notebooks_v1beta1_IsInstanceUpgradeableResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1beta1.NotebooksProto
        .internal_static_google_cloud_notebooks_v1beta1_IsInstanceUpgradeableResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse.class,
            com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse.Builder.class);
  }

  public static final int UPGRADEABLE_FIELD_NUMBER = 1;
  private boolean upgradeable_;
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
  @java.lang.Override
  public boolean getUpgradeable() {
    return upgradeable_;
  }

  public static final int UPGRADE_VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object upgradeVersion_;
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
  @java.lang.Override
  public java.lang.String getUpgradeVersion() {
    java.lang.Object ref = upgradeVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      upgradeVersion_ = s;
      return s;
    }
  }
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
  @java.lang.Override
  public com.google.protobuf.ByteString getUpgradeVersionBytes() {
    java.lang.Object ref = upgradeVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      upgradeVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (upgradeable_ != false) {
      output.writeBool(1, upgradeable_);
    }
    if (!getUpgradeVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, upgradeVersion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (upgradeable_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, upgradeable_);
    }
    if (!getUpgradeVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, upgradeVersion_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse other =
        (com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse) obj;

    if (getUpgradeable() != other.getUpgradeable()) return false;
    if (!getUpgradeVersion().equals(other.getUpgradeVersion())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UPGRADEABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getUpgradeable());
    hash = (37 * hash) + UPGRADE_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getUpgradeVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response for checking if a notebook instance is upgradeable.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse)
      com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1beta1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1beta1_IsInstanceUpgradeableResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1beta1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1beta1_IsInstanceUpgradeableResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse.class,
              com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      upgradeable_ = false;

      upgradeVersion_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1beta1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1beta1_IsInstanceUpgradeableResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse
        getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse build() {
      com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse buildPartial() {
      com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse result =
          new com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse(this);
      result.upgradeable_ = upgradeable_;
      result.upgradeVersion_ = upgradeVersion_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse) {
        return mergeFrom((com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse other) {
      if (other
          == com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse.getDefaultInstance())
        return this;
      if (other.getUpgradeable() != false) {
        setUpgradeable(other.getUpgradeable());
      }
      if (!other.getUpgradeVersion().isEmpty()) {
        upgradeVersion_ = other.upgradeVersion_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean upgradeable_;
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
    @java.lang.Override
    public boolean getUpgradeable() {
      return upgradeable_;
    }
    /**
     *
     *
     * <pre>
     * If an instance is upgradeable.
     * </pre>
     *
     * <code>bool upgradeable = 1;</code>
     *
     * @param value The upgradeable to set.
     * @return This builder for chaining.
     */
    public Builder setUpgradeable(boolean value) {

      upgradeable_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If an instance is upgradeable.
     * </pre>
     *
     * <code>bool upgradeable = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUpgradeable() {

      upgradeable_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object upgradeVersion_ = "";
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
    public java.lang.String getUpgradeVersion() {
      java.lang.Object ref = upgradeVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        upgradeVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
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
    public com.google.protobuf.ByteString getUpgradeVersionBytes() {
      java.lang.Object ref = upgradeVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        upgradeVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
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
     * @param value The upgradeVersion to set.
     * @return This builder for chaining.
     */
    public Builder setUpgradeVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      upgradeVersion_ = value;
      onChanged();
      return this;
    }
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
     * @return This builder for chaining.
     */
    public Builder clearUpgradeVersion() {

      upgradeVersion_ = getDefaultInstance().getUpgradeVersion();
      onChanged();
      return this;
    }
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
     * @param value The bytes for upgradeVersion to set.
     * @return This builder for chaining.
     */
    public Builder setUpgradeVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      upgradeVersion_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse)
  private static final com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse();
  }

  public static com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IsInstanceUpgradeableResponse> PARSER =
      new com.google.protobuf.AbstractParser<IsInstanceUpgradeableResponse>() {
        @java.lang.Override
        public IsInstanceUpgradeableResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new IsInstanceUpgradeableResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<IsInstanceUpgradeableResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IsInstanceUpgradeableResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
