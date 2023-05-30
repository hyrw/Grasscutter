// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeRacingGallerySettleNotify.proto

package emu.grasscutter.net.proto;

public final class HomeRacingGallerySettleNotifyOuterClass {
  private HomeRacingGallerySettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeRacingGallerySettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeRacingGallerySettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.RacingGallerySettleInfo settle_info = 13;</code>
     * @return Whether the settleInfo field is set.
     */
    boolean hasSettleInfo();
    /**
     * <code>.RacingGallerySettleInfo settle_info = 13;</code>
     * @return The settleInfo.
     */
    emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo getSettleInfo();
    /**
     * <code>.RacingGallerySettleInfo settle_info = 13;</code>
     */
    emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfoOrBuilder getSettleInfoOrBuilder();

    /**
     * <code>uint32 rank = 3;</code>
     * @return The rank.
     */
    int getRank();

    /**
     * <code>uint32 gallery_id = 8;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>bool is_new_record = 9;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * <pre>
   * CmdId: 4545
   * Obf: ONOLLPOPKFC
   * </pre>
   *
   * Protobuf type {@code HomeRacingGallerySettleNotify}
   */
  public static final class HomeRacingGallerySettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeRacingGallerySettleNotify)
      HomeRacingGallerySettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeRacingGallerySettleNotify.newBuilder() to construct.
    private HomeRacingGallerySettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeRacingGallerySettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeRacingGallerySettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeRacingGallerySettleNotify(
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

              rank_ = input.readUInt32();
              break;
            }
            case 64: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 72: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 106: {
              emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo.Builder subBuilder = null;
              if (settleInfo_ != null) {
                subBuilder = settleInfo_.toBuilder();
              }
              settleInfo_ = input.readMessage(emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(settleInfo_);
                settleInfo_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.internal_static_HomeRacingGallerySettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.internal_static_HomeRacingGallerySettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify.class, emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify.Builder.class);
    }

    public static final int SETTLE_INFO_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo settleInfo_;
    /**
     * <code>.RacingGallerySettleInfo settle_info = 13;</code>
     * @return Whether the settleInfo field is set.
     */
    @java.lang.Override
    public boolean hasSettleInfo() {
      return settleInfo_ != null;
    }
    /**
     * <code>.RacingGallerySettleInfo settle_info = 13;</code>
     * @return The settleInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo getSettleInfo() {
      return settleInfo_ == null ? emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo.getDefaultInstance() : settleInfo_;
    }
    /**
     * <code>.RacingGallerySettleInfo settle_info = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfoOrBuilder getSettleInfoOrBuilder() {
      return getSettleInfo();
    }

    public static final int RANK_FIELD_NUMBER = 3;
    private int rank_;
    /**
     * <code>uint32 rank = 3;</code>
     * @return The rank.
     */
    @java.lang.Override
    public int getRank() {
      return rank_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 8;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 8;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 9;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 9;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
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
      if (rank_ != 0) {
        output.writeUInt32(3, rank_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(8, galleryId_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(9, isNewRecord_);
      }
      if (settleInfo_ != null) {
        output.writeMessage(13, getSettleInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rank_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, rank_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, galleryId_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isNewRecord_);
      }
      if (settleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getSettleInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify other = (emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify) obj;

      if (hasSettleInfo() != other.hasSettleInfo()) return false;
      if (hasSettleInfo()) {
        if (!getSettleInfo()
            .equals(other.getSettleInfo())) return false;
      }
      if (getRank()
          != other.getRank()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
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
      if (hasSettleInfo()) {
        hash = (37 * hash) + SETTLE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSettleInfo().hashCode();
      }
      hash = (37 * hash) + RANK_FIELD_NUMBER;
      hash = (53 * hash) + getRank();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify prototype) {
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
     * CmdId: 4545
     * Obf: ONOLLPOPKFC
     * </pre>
     *
     * Protobuf type {@code HomeRacingGallerySettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeRacingGallerySettleNotify)
        emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.internal_static_HomeRacingGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.internal_static_HomeRacingGallerySettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify.class, emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify.newBuilder()
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
        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }
        rank_ = 0;

        galleryId_ = 0;

        isNewRecord_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.internal_static_HomeRacingGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify build() {
        emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify buildPartial() {
        emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify result = new emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify(this);
        if (settleInfoBuilder_ == null) {
          result.settleInfo_ = settleInfo_;
        } else {
          result.settleInfo_ = settleInfoBuilder_.build();
        }
        result.rank_ = rank_;
        result.galleryId_ = galleryId_;
        result.isNewRecord_ = isNewRecord_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify other) {
        if (other == emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify.getDefaultInstance()) return this;
        if (other.hasSettleInfo()) {
          mergeSettleInfo(other.getSettleInfo());
        }
        if (other.getRank() != 0) {
          setRank(other.getRank());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
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
        emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo settleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo, emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo.Builder, emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfoOrBuilder> settleInfoBuilder_;
      /**
       * <code>.RacingGallerySettleInfo settle_info = 13;</code>
       * @return Whether the settleInfo field is set.
       */
      public boolean hasSettleInfo() {
        return settleInfoBuilder_ != null || settleInfo_ != null;
      }
      /**
       * <code>.RacingGallerySettleInfo settle_info = 13;</code>
       * @return The settleInfo.
       */
      public emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo getSettleInfo() {
        if (settleInfoBuilder_ == null) {
          return settleInfo_ == null ? emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo.getDefaultInstance() : settleInfo_;
        } else {
          return settleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.RacingGallerySettleInfo settle_info = 13;</code>
       */
      public Builder setSettleInfo(emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          settleInfo_ = value;
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.RacingGallerySettleInfo settle_info = 13;</code>
       */
      public Builder setSettleInfo(
          emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo.Builder builderForValue) {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = builderForValue.build();
          onChanged();
        } else {
          settleInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.RacingGallerySettleInfo settle_info = 13;</code>
       */
      public Builder mergeSettleInfo(emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (settleInfo_ != null) {
            settleInfo_ =
              emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo.newBuilder(settleInfo_).mergeFrom(value).buildPartial();
          } else {
            settleInfo_ = value;
          }
          onChanged();
        } else {
          settleInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.RacingGallerySettleInfo settle_info = 13;</code>
       */
      public Builder clearSettleInfo() {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = null;
          onChanged();
        } else {
          settleInfo_ = null;
          settleInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.RacingGallerySettleInfo settle_info = 13;</code>
       */
      public emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo.Builder getSettleInfoBuilder() {
        
        onChanged();
        return getSettleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.RacingGallerySettleInfo settle_info = 13;</code>
       */
      public emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfoOrBuilder getSettleInfoOrBuilder() {
        if (settleInfoBuilder_ != null) {
          return settleInfoBuilder_.getMessageOrBuilder();
        } else {
          return settleInfo_ == null ?
              emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo.getDefaultInstance() : settleInfo_;
        }
      }
      /**
       * <code>.RacingGallerySettleInfo settle_info = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo, emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo.Builder, emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfoOrBuilder> 
          getSettleInfoFieldBuilder() {
        if (settleInfoBuilder_ == null) {
          settleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo, emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfo.Builder, emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.RacingGallerySettleInfoOrBuilder>(
                  getSettleInfo(),
                  getParentForChildren(),
                  isClean());
          settleInfo_ = null;
        }
        return settleInfoBuilder_;
      }

      private int rank_ ;
      /**
       * <code>uint32 rank = 3;</code>
       * @return The rank.
       */
      @java.lang.Override
      public int getRank() {
        return rank_;
      }
      /**
       * <code>uint32 rank = 3;</code>
       * @param value The rank to set.
       * @return This builder for chaining.
       */
      public Builder setRank(int value) {
        
        rank_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rank = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRank() {
        
        rank_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 8;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 8;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 9;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 9;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
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


      // @@protoc_insertion_point(builder_scope:HomeRacingGallerySettleNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeRacingGallerySettleNotify)
    private static final emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify();
    }

    public static emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeRacingGallerySettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeRacingGallerySettleNotify>() {
      @java.lang.Override
      public HomeRacingGallerySettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeRacingGallerySettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeRacingGallerySettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeRacingGallerySettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeRacingGallerySettleNotifyOuterClass.HomeRacingGallerySettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeRacingGallerySettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeRacingGallerySettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#HomeRacingGallerySettleNotify.proto\032\035R" +
      "acingGallerySettleInfo.proto\"\207\001\n\035HomeRac" +
      "ingGallerySettleNotify\022-\n\013settle_info\030\r " +
      "\001(\0132\030.RacingGallerySettleInfo\022\014\n\004rank\030\003 " +
      "\001(\r\022\022\n\ngallery_id\030\010 \001(\r\022\025\n\ris_new_record" +
      "\030\t \001(\010B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeRacingGallerySettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeRacingGallerySettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeRacingGallerySettleNotify_descriptor,
        new java.lang.String[] { "SettleInfo", "Rank", "GalleryId", "IsNewRecord", });
    emu.grasscutter.net.proto.RacingGallerySettleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
