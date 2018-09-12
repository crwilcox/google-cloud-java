// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

package io.grafeas.v1beta1;

/**
 * <pre>
 * Response for creating occurrences in batch.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.BatchCreateOccurrencesResponse}
 */
public  final class BatchCreateOccurrencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.BatchCreateOccurrencesResponse)
    BatchCreateOccurrencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchCreateOccurrencesResponse.newBuilder() to construct.
  private BatchCreateOccurrencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchCreateOccurrencesResponse() {
    occurrences_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BatchCreateOccurrencesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              occurrences_ = new java.util.ArrayList<io.grafeas.v1beta1.Occurrence>();
              mutable_bitField0_ |= 0x00000001;
            }
            occurrences_.add(
                input.readMessage(io.grafeas.v1beta1.Occurrence.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        occurrences_ = java.util.Collections.unmodifiableList(occurrences_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_BatchCreateOccurrencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_BatchCreateOccurrencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.BatchCreateOccurrencesResponse.class, io.grafeas.v1beta1.BatchCreateOccurrencesResponse.Builder.class);
  }

  public static final int OCCURRENCES_FIELD_NUMBER = 1;
  private java.util.List<io.grafeas.v1beta1.Occurrence> occurrences_;
  /**
   * <pre>
   * The occurrences that were created.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
   */
  public java.util.List<io.grafeas.v1beta1.Occurrence> getOccurrencesList() {
    return occurrences_;
  }
  /**
   * <pre>
   * The occurrences that were created.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
   */
  public java.util.List<? extends io.grafeas.v1beta1.OccurrenceOrBuilder> 
      getOccurrencesOrBuilderList() {
    return occurrences_;
  }
  /**
   * <pre>
   * The occurrences that were created.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
   */
  public int getOccurrencesCount() {
    return occurrences_.size();
  }
  /**
   * <pre>
   * The occurrences that were created.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
   */
  public io.grafeas.v1beta1.Occurrence getOccurrences(int index) {
    return occurrences_.get(index);
  }
  /**
   * <pre>
   * The occurrences that were created.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
   */
  public io.grafeas.v1beta1.OccurrenceOrBuilder getOccurrencesOrBuilder(
      int index) {
    return occurrences_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < occurrences_.size(); i++) {
      output.writeMessage(1, occurrences_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < occurrences_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, occurrences_.get(i));
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
    if (!(obj instanceof io.grafeas.v1beta1.BatchCreateOccurrencesResponse)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.BatchCreateOccurrencesResponse other = (io.grafeas.v1beta1.BatchCreateOccurrencesResponse) obj;

    boolean result = true;
    result = result && getOccurrencesList()
        .equals(other.getOccurrencesList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getOccurrencesCount() > 0) {
      hash = (37 * hash) + OCCURRENCES_FIELD_NUMBER;
      hash = (53 * hash) + getOccurrencesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.BatchCreateOccurrencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.BatchCreateOccurrencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.BatchCreateOccurrencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.BatchCreateOccurrencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1beta1.BatchCreateOccurrencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1beta1.BatchCreateOccurrencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.BatchCreateOccurrencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.BatchCreateOccurrencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.BatchCreateOccurrencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1beta1.BatchCreateOccurrencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1beta1.BatchCreateOccurrencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grafeas.v1beta1.BatchCreateOccurrencesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response for creating occurrences in batch.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.BatchCreateOccurrencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.BatchCreateOccurrencesResponse)
      io.grafeas.v1beta1.BatchCreateOccurrencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_BatchCreateOccurrencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_BatchCreateOccurrencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.BatchCreateOccurrencesResponse.class, io.grafeas.v1beta1.BatchCreateOccurrencesResponse.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.BatchCreateOccurrencesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getOccurrencesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (occurrencesBuilder_ == null) {
        occurrences_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        occurrencesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1beta1.Grafeas.internal_static_grafeas_v1beta1_BatchCreateOccurrencesResponse_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.BatchCreateOccurrencesResponse getDefaultInstanceForType() {
      return io.grafeas.v1beta1.BatchCreateOccurrencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.BatchCreateOccurrencesResponse build() {
      io.grafeas.v1beta1.BatchCreateOccurrencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.BatchCreateOccurrencesResponse buildPartial() {
      io.grafeas.v1beta1.BatchCreateOccurrencesResponse result = new io.grafeas.v1beta1.BatchCreateOccurrencesResponse(this);
      int from_bitField0_ = bitField0_;
      if (occurrencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          occurrences_ = java.util.Collections.unmodifiableList(occurrences_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.occurrences_ = occurrences_;
      } else {
        result.occurrences_ = occurrencesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1beta1.BatchCreateOccurrencesResponse) {
        return mergeFrom((io.grafeas.v1beta1.BatchCreateOccurrencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.BatchCreateOccurrencesResponse other) {
      if (other == io.grafeas.v1beta1.BatchCreateOccurrencesResponse.getDefaultInstance()) return this;
      if (occurrencesBuilder_ == null) {
        if (!other.occurrences_.isEmpty()) {
          if (occurrences_.isEmpty()) {
            occurrences_ = other.occurrences_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOccurrencesIsMutable();
            occurrences_.addAll(other.occurrences_);
          }
          onChanged();
        }
      } else {
        if (!other.occurrences_.isEmpty()) {
          if (occurrencesBuilder_.isEmpty()) {
            occurrencesBuilder_.dispose();
            occurrencesBuilder_ = null;
            occurrences_ = other.occurrences_;
            bitField0_ = (bitField0_ & ~0x00000001);
            occurrencesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOccurrencesFieldBuilder() : null;
          } else {
            occurrencesBuilder_.addAllMessages(other.occurrences_);
          }
        }
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
      io.grafeas.v1beta1.BatchCreateOccurrencesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.BatchCreateOccurrencesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grafeas.v1beta1.Occurrence> occurrences_ =
      java.util.Collections.emptyList();
    private void ensureOccurrencesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        occurrences_ = new java.util.ArrayList<io.grafeas.v1beta1.Occurrence>(occurrences_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grafeas.v1beta1.Occurrence, io.grafeas.v1beta1.Occurrence.Builder, io.grafeas.v1beta1.OccurrenceOrBuilder> occurrencesBuilder_;

    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public java.util.List<io.grafeas.v1beta1.Occurrence> getOccurrencesList() {
      if (occurrencesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(occurrences_);
      } else {
        return occurrencesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public int getOccurrencesCount() {
      if (occurrencesBuilder_ == null) {
        return occurrences_.size();
      } else {
        return occurrencesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public io.grafeas.v1beta1.Occurrence getOccurrences(int index) {
      if (occurrencesBuilder_ == null) {
        return occurrences_.get(index);
      } else {
        return occurrencesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public Builder setOccurrences(
        int index, io.grafeas.v1beta1.Occurrence value) {
      if (occurrencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOccurrencesIsMutable();
        occurrences_.set(index, value);
        onChanged();
      } else {
        occurrencesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public Builder setOccurrences(
        int index, io.grafeas.v1beta1.Occurrence.Builder builderForValue) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        occurrences_.set(index, builderForValue.build());
        onChanged();
      } else {
        occurrencesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public Builder addOccurrences(io.grafeas.v1beta1.Occurrence value) {
      if (occurrencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOccurrencesIsMutable();
        occurrences_.add(value);
        onChanged();
      } else {
        occurrencesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public Builder addOccurrences(
        int index, io.grafeas.v1beta1.Occurrence value) {
      if (occurrencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOccurrencesIsMutable();
        occurrences_.add(index, value);
        onChanged();
      } else {
        occurrencesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public Builder addOccurrences(
        io.grafeas.v1beta1.Occurrence.Builder builderForValue) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        occurrences_.add(builderForValue.build());
        onChanged();
      } else {
        occurrencesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public Builder addOccurrences(
        int index, io.grafeas.v1beta1.Occurrence.Builder builderForValue) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        occurrences_.add(index, builderForValue.build());
        onChanged();
      } else {
        occurrencesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public Builder addAllOccurrences(
        java.lang.Iterable<? extends io.grafeas.v1beta1.Occurrence> values) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, occurrences_);
        onChanged();
      } else {
        occurrencesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public Builder clearOccurrences() {
      if (occurrencesBuilder_ == null) {
        occurrences_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        occurrencesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public Builder removeOccurrences(int index) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        occurrences_.remove(index);
        onChanged();
      } else {
        occurrencesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public io.grafeas.v1beta1.Occurrence.Builder getOccurrencesBuilder(
        int index) {
      return getOccurrencesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public io.grafeas.v1beta1.OccurrenceOrBuilder getOccurrencesOrBuilder(
        int index) {
      if (occurrencesBuilder_ == null) {
        return occurrences_.get(index);  } else {
        return occurrencesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public java.util.List<? extends io.grafeas.v1beta1.OccurrenceOrBuilder> 
         getOccurrencesOrBuilderList() {
      if (occurrencesBuilder_ != null) {
        return occurrencesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(occurrences_);
      }
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public io.grafeas.v1beta1.Occurrence.Builder addOccurrencesBuilder() {
      return getOccurrencesFieldBuilder().addBuilder(
          io.grafeas.v1beta1.Occurrence.getDefaultInstance());
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public io.grafeas.v1beta1.Occurrence.Builder addOccurrencesBuilder(
        int index) {
      return getOccurrencesFieldBuilder().addBuilder(
          index, io.grafeas.v1beta1.Occurrence.getDefaultInstance());
    }
    /**
     * <pre>
     * The occurrences that were created.
     * </pre>
     *
     * <code>repeated .grafeas.v1beta1.Occurrence occurrences = 1;</code>
     */
    public java.util.List<io.grafeas.v1beta1.Occurrence.Builder> 
         getOccurrencesBuilderList() {
      return getOccurrencesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grafeas.v1beta1.Occurrence, io.grafeas.v1beta1.Occurrence.Builder, io.grafeas.v1beta1.OccurrenceOrBuilder> 
        getOccurrencesFieldBuilder() {
      if (occurrencesBuilder_ == null) {
        occurrencesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1beta1.Occurrence, io.grafeas.v1beta1.Occurrence.Builder, io.grafeas.v1beta1.OccurrenceOrBuilder>(
                occurrences_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        occurrences_ = null;
      }
      return occurrencesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.BatchCreateOccurrencesResponse)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.BatchCreateOccurrencesResponse)
  private static final io.grafeas.v1beta1.BatchCreateOccurrencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.BatchCreateOccurrencesResponse();
  }

  public static io.grafeas.v1beta1.BatchCreateOccurrencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateOccurrencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<BatchCreateOccurrencesResponse>() {
    @java.lang.Override
    public BatchCreateOccurrencesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BatchCreateOccurrencesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BatchCreateOccurrencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateOccurrencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.BatchCreateOccurrencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

