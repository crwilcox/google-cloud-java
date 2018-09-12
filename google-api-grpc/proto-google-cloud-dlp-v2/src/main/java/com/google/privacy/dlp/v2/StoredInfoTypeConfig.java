// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Configuration for a StoredInfoType.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.StoredInfoTypeConfig}
 */
public  final class StoredInfoTypeConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.StoredInfoTypeConfig)
    StoredInfoTypeConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StoredInfoTypeConfig.newBuilder() to construct.
  private StoredInfoTypeConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StoredInfoTypeConfig() {
    displayName_ = "";
    description_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StoredInfoTypeConfig(
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
            java.lang.String s = input.readStringRequireUtf8();

            displayName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 26: {
            com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.Builder subBuilder = null;
            if (typeCase_ == 3) {
              subBuilder = ((com.google.privacy.dlp.v2.LargeCustomDictionaryConfig) type_).toBuilder();
            }
            type_ =
                input.readMessage(com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.privacy.dlp.v2.LargeCustomDictionaryConfig) type_);
              type_ = subBuilder.buildPartial();
            }
            typeCase_ = 3;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_StoredInfoTypeConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_StoredInfoTypeConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.StoredInfoTypeConfig.class, com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite {
    LARGE_CUSTOM_DICTIONARY(3),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 3: return LARGE_CUSTOM_DICTIONARY;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object displayName_;
  /**
   * <pre>
   * Display name of the StoredInfoType (max 256 characters).
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Display name of the StoredInfoType (max 256 characters).
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * Description of the StoredInfoType (max 256 characters).
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Description of the StoredInfoType (max 256 characters).
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LARGE_CUSTOM_DICTIONARY_FIELD_NUMBER = 3;
  /**
   * <pre>
   * StoredInfoType where findings are defined by a dictionary of phrases.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.LargeCustomDictionaryConfig large_custom_dictionary = 3;</code>
   */
  public boolean hasLargeCustomDictionary() {
    return typeCase_ == 3;
  }
  /**
   * <pre>
   * StoredInfoType where findings are defined by a dictionary of phrases.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.LargeCustomDictionaryConfig large_custom_dictionary = 3;</code>
   */
  public com.google.privacy.dlp.v2.LargeCustomDictionaryConfig getLargeCustomDictionary() {
    if (typeCase_ == 3) {
       return (com.google.privacy.dlp.v2.LargeCustomDictionaryConfig) type_;
    }
    return com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.getDefaultInstance();
  }
  /**
   * <pre>
   * StoredInfoType where findings are defined by a dictionary of phrases.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.LargeCustomDictionaryConfig large_custom_dictionary = 3;</code>
   */
  public com.google.privacy.dlp.v2.LargeCustomDictionaryConfigOrBuilder getLargeCustomDictionaryOrBuilder() {
    if (typeCase_ == 3) {
       return (com.google.privacy.dlp.v2.LargeCustomDictionaryConfig) type_;
    }
    return com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.getDefaultInstance();
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
    if (!getDisplayNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, displayName_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (typeCase_ == 3) {
      output.writeMessage(3, (com.google.privacy.dlp.v2.LargeCustomDictionaryConfig) type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDisplayNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, displayName_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (typeCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.google.privacy.dlp.v2.LargeCustomDictionaryConfig) type_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.StoredInfoTypeConfig)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.StoredInfoTypeConfig other = (com.google.privacy.dlp.v2.StoredInfoTypeConfig) obj;

    boolean result = true;
    result = result && getDisplayName()
        .equals(other.getDisplayName());
    result = result && getDescription()
        .equals(other.getDescription());
    result = result && getTypeCase().equals(
        other.getTypeCase());
    if (!result) return false;
    switch (typeCase_) {
      case 3:
        result = result && getLargeCustomDictionary()
            .equals(other.getLargeCustomDictionary());
        break;
      case 0:
      default:
    }
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
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    switch (typeCase_) {
      case 3:
        hash = (37 * hash) + LARGE_CUSTOM_DICTIONARY_FIELD_NUMBER;
        hash = (53 * hash) + getLargeCustomDictionary().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.StoredInfoTypeConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.StoredInfoTypeConfig parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.StoredInfoTypeConfig prototype) {
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
   * Configuration for a StoredInfoType.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.StoredInfoTypeConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.StoredInfoTypeConfig)
      com.google.privacy.dlp.v2.StoredInfoTypeConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_StoredInfoTypeConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_StoredInfoTypeConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.StoredInfoTypeConfig.class, com.google.privacy.dlp.v2.StoredInfoTypeConfig.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.StoredInfoTypeConfig.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      displayName_ = "";

      description_ = "";

      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_StoredInfoTypeConfig_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.StoredInfoTypeConfig getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.StoredInfoTypeConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.StoredInfoTypeConfig build() {
      com.google.privacy.dlp.v2.StoredInfoTypeConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.StoredInfoTypeConfig buildPartial() {
      com.google.privacy.dlp.v2.StoredInfoTypeConfig result = new com.google.privacy.dlp.v2.StoredInfoTypeConfig(this);
      result.displayName_ = displayName_;
      result.description_ = description_;
      if (typeCase_ == 3) {
        if (largeCustomDictionaryBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = largeCustomDictionaryBuilder_.build();
        }
      }
      result.typeCase_ = typeCase_;
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
      if (other instanceof com.google.privacy.dlp.v2.StoredInfoTypeConfig) {
        return mergeFrom((com.google.privacy.dlp.v2.StoredInfoTypeConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.StoredInfoTypeConfig other) {
      if (other == com.google.privacy.dlp.v2.StoredInfoTypeConfig.getDefaultInstance()) return this;
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      switch (other.getTypeCase()) {
        case LARGE_CUSTOM_DICTIONARY: {
          mergeLargeCustomDictionary(other.getLargeCustomDictionary());
          break;
        }
        case TYPE_NOT_SET: {
          break;
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
      com.google.privacy.dlp.v2.StoredInfoTypeConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.StoredInfoTypeConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object displayName_ = "";
    /**
     * <pre>
     * Display name of the StoredInfoType (max 256 characters).
     * </pre>
     *
     * <code>string display_name = 1;</code>
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Display name of the StoredInfoType (max 256 characters).
     * </pre>
     *
     * <code>string display_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Display name of the StoredInfoType (max 256 characters).
     * </pre>
     *
     * <code>string display_name = 1;</code>
     */
    public Builder setDisplayName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Display name of the StoredInfoType (max 256 characters).
     * </pre>
     *
     * <code>string display_name = 1;</code>
     */
    public Builder clearDisplayName() {
      
      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Display name of the StoredInfoType (max 256 characters).
     * </pre>
     *
     * <code>string display_name = 1;</code>
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      displayName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Description of the StoredInfoType (max 256 characters).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Description of the StoredInfoType (max 256 characters).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Description of the StoredInfoType (max 256 characters).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description of the StoredInfoType (max 256 characters).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description of the StoredInfoType (max 256 characters).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.LargeCustomDictionaryConfig, com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.Builder, com.google.privacy.dlp.v2.LargeCustomDictionaryConfigOrBuilder> largeCustomDictionaryBuilder_;
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryConfig large_custom_dictionary = 3;</code>
     */
    public boolean hasLargeCustomDictionary() {
      return typeCase_ == 3;
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryConfig large_custom_dictionary = 3;</code>
     */
    public com.google.privacy.dlp.v2.LargeCustomDictionaryConfig getLargeCustomDictionary() {
      if (largeCustomDictionaryBuilder_ == null) {
        if (typeCase_ == 3) {
          return (com.google.privacy.dlp.v2.LargeCustomDictionaryConfig) type_;
        }
        return com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.getDefaultInstance();
      } else {
        if (typeCase_ == 3) {
          return largeCustomDictionaryBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryConfig large_custom_dictionary = 3;</code>
     */
    public Builder setLargeCustomDictionary(com.google.privacy.dlp.v2.LargeCustomDictionaryConfig value) {
      if (largeCustomDictionaryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        largeCustomDictionaryBuilder_.setMessage(value);
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryConfig large_custom_dictionary = 3;</code>
     */
    public Builder setLargeCustomDictionary(
        com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.Builder builderForValue) {
      if (largeCustomDictionaryBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        largeCustomDictionaryBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryConfig large_custom_dictionary = 3;</code>
     */
    public Builder mergeLargeCustomDictionary(com.google.privacy.dlp.v2.LargeCustomDictionaryConfig value) {
      if (largeCustomDictionaryBuilder_ == null) {
        if (typeCase_ == 3 &&
            type_ != com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.getDefaultInstance()) {
          type_ = com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.newBuilder((com.google.privacy.dlp.v2.LargeCustomDictionaryConfig) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 3) {
          largeCustomDictionaryBuilder_.mergeFrom(value);
        }
        largeCustomDictionaryBuilder_.setMessage(value);
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryConfig large_custom_dictionary = 3;</code>
     */
    public Builder clearLargeCustomDictionary() {
      if (largeCustomDictionaryBuilder_ == null) {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
        }
        largeCustomDictionaryBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryConfig large_custom_dictionary = 3;</code>
     */
    public com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.Builder getLargeCustomDictionaryBuilder() {
      return getLargeCustomDictionaryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryConfig large_custom_dictionary = 3;</code>
     */
    public com.google.privacy.dlp.v2.LargeCustomDictionaryConfigOrBuilder getLargeCustomDictionaryOrBuilder() {
      if ((typeCase_ == 3) && (largeCustomDictionaryBuilder_ != null)) {
        return largeCustomDictionaryBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 3) {
          return (com.google.privacy.dlp.v2.LargeCustomDictionaryConfig) type_;
        }
        return com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.LargeCustomDictionaryConfig large_custom_dictionary = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.LargeCustomDictionaryConfig, com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.Builder, com.google.privacy.dlp.v2.LargeCustomDictionaryConfigOrBuilder> 
        getLargeCustomDictionaryFieldBuilder() {
      if (largeCustomDictionaryBuilder_ == null) {
        if (!(typeCase_ == 3)) {
          type_ = com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.getDefaultInstance();
        }
        largeCustomDictionaryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.LargeCustomDictionaryConfig, com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.Builder, com.google.privacy.dlp.v2.LargeCustomDictionaryConfigOrBuilder>(
                (com.google.privacy.dlp.v2.LargeCustomDictionaryConfig) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 3;
      onChanged();;
      return largeCustomDictionaryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.StoredInfoTypeConfig)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.StoredInfoTypeConfig)
  private static final com.google.privacy.dlp.v2.StoredInfoTypeConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.StoredInfoTypeConfig();
  }

  public static com.google.privacy.dlp.v2.StoredInfoTypeConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StoredInfoTypeConfig>
      PARSER = new com.google.protobuf.AbstractParser<StoredInfoTypeConfig>() {
    @java.lang.Override
    public StoredInfoTypeConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StoredInfoTypeConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StoredInfoTypeConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StoredInfoTypeConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.StoredInfoTypeConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

