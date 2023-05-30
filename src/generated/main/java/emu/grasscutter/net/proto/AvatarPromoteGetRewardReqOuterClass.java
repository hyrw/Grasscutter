// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarPromoteGetRewardReq.proto

package emu.grasscutter.net.proto;

public final class AvatarPromoteGetRewardReqOuterClass {
  private AvatarPromoteGetRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarPromoteGetRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarPromoteGetRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 promote_level = 3;</code>
     * @return The promoteLevel.
     */
    int getPromoteLevel();

    /**
     * <code>uint64 avatar_guid = 8;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * <pre>
   * CmdId: 1667
   * Obf: JLJCBJGAHMH
   * </pre>
   *
   * Protobuf type {@code AvatarPromoteGetRewardReq}
   */
  public static final class AvatarPromoteGetRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarPromoteGetRewardReq)
      AvatarPromoteGetRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarPromoteGetRewardReq.newBuilder() to construct.
    private AvatarPromoteGetRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarPromoteGetRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarPromoteGetRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarPromoteGetRewardReq(
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
            case 24: {

              promoteLevel_ = input.readUInt32();
              break;
            }
            case 64: {

              avatarGuid_ = input.readUInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.internal_static_AvatarPromoteGetRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.internal_static_AvatarPromoteGetRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq.class, emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq.Builder.class);
    }

    public static final int PROMOTE_LEVEL_FIELD_NUMBER = 3;
    private int promoteLevel_;
    /**
     * <code>uint32 promote_level = 3;</code>
     * @return The promoteLevel.
     */
    @java.lang.Override
    public int getPromoteLevel() {
      return promoteLevel_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 8;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 8;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
      if (promoteLevel_ != 0) {
        output.writeUInt32(3, promoteLevel_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(8, avatarGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (promoteLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, promoteLevel_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, avatarGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq other = (emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq) obj;

      if (getPromoteLevel()
          != other.getPromoteLevel()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
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
      hash = (37 * hash) + PROMOTE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getPromoteLevel();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq prototype) {
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
     * CmdId: 1667
     * Obf: JLJCBJGAHMH
     * </pre>
     *
     * Protobuf type {@code AvatarPromoteGetRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarPromoteGetRewardReq)
        emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.internal_static_AvatarPromoteGetRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.internal_static_AvatarPromoteGetRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq.class, emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq.newBuilder()
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
        promoteLevel_ = 0;

        avatarGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.internal_static_AvatarPromoteGetRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq build() {
        emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq buildPartial() {
        emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq result = new emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq(this);
        result.promoteLevel_ = promoteLevel_;
        result.avatarGuid_ = avatarGuid_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq other) {
        if (other == emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq.getDefaultInstance()) return this;
        if (other.getPromoteLevel() != 0) {
          setPromoteLevel(other.getPromoteLevel());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
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
        emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int promoteLevel_ ;
      /**
       * <code>uint32 promote_level = 3;</code>
       * @return The promoteLevel.
       */
      @java.lang.Override
      public int getPromoteLevel() {
        return promoteLevel_;
      }
      /**
       * <code>uint32 promote_level = 3;</code>
       * @param value The promoteLevel to set.
       * @return This builder for chaining.
       */
      public Builder setPromoteLevel(int value) {
        
        promoteLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 promote_level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPromoteLevel() {
        
        promoteLevel_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 8;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 8;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:AvatarPromoteGetRewardReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarPromoteGetRewardReq)
    private static final emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq();
    }

    public static emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarPromoteGetRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarPromoteGetRewardReq>() {
      @java.lang.Override
      public AvatarPromoteGetRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarPromoteGetRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarPromoteGetRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarPromoteGetRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarPromoteGetRewardReqOuterClass.AvatarPromoteGetRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarPromoteGetRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarPromoteGetRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037AvatarPromoteGetRewardReq.proto\"G\n\031Ava" +
      "tarPromoteGetRewardReq\022\025\n\rpromote_level\030" +
      "\003 \001(\r\022\023\n\013avatar_guid\030\010 \001(\004B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarPromoteGetRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarPromoteGetRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarPromoteGetRewardReq_descriptor,
        new java.lang.String[] { "PromoteLevel", "AvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
