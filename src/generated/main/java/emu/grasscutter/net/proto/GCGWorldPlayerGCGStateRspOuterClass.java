// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGWorldPlayerGCGStateRsp.proto

package emu.grasscutter.net.proto;

public final class GCGWorldPlayerGCGStateRspOuterClass {
  private GCGWorldPlayerGCGStateRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGWorldPlayerGCGStateRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGWorldPlayerGCGStateRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
     */
    java.util.List<emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState> 
        getPlayerStateList();
    /**
     * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
     */
    emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState getPlayerState(int index);
    /**
     * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
     */
    int getPlayerStateCount();
    /**
     * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGStateOrBuilder> 
        getPlayerStateOrBuilderList();
    /**
     * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
     */
    emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGStateOrBuilder getPlayerStateOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 7093
   * Obf: DOLLCIEKMJI
   * </pre>
   *
   * Protobuf type {@code GCGWorldPlayerGCGStateRsp}
   */
  public static final class GCGWorldPlayerGCGStateRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGWorldPlayerGCGStateRsp)
      GCGWorldPlayerGCGStateRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGWorldPlayerGCGStateRsp.newBuilder() to construct.
    private GCGWorldPlayerGCGStateRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGWorldPlayerGCGStateRsp() {
      playerState_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGWorldPlayerGCGStateRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGWorldPlayerGCGStateRsp(
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
            case 66: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                playerState_ = new java.util.ArrayList<emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState>();
                mutable_bitField0_ |= 0x00000001;
              }
              playerState_.add(
                  input.readMessage(emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.parser(), extensionRegistry));
              break;
            }
            case 104: {

              retcode_ = input.readInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          playerState_ = java.util.Collections.unmodifiableList(playerState_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.internal_static_GCGWorldPlayerGCGStateRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.internal_static_GCGWorldPlayerGCGStateRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp.class, emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp.Builder.class);
    }

    public static final int PLAYER_STATE_FIELD_NUMBER = 8;
    private java.util.List<emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState> playerState_;
    /**
     * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState> getPlayerStateList() {
      return playerState_;
    }
    /**
     * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGStateOrBuilder> 
        getPlayerStateOrBuilderList() {
      return playerState_;
    }
    /**
     * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
     */
    @java.lang.Override
    public int getPlayerStateCount() {
      return playerState_.size();
    }
    /**
     * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState getPlayerState(int index) {
      return playerState_.get(index);
    }
    /**
     * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGStateOrBuilder getPlayerStateOrBuilder(
        int index) {
      return playerState_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_;
    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      for (int i = 0; i < playerState_.size(); i++) {
        output.writeMessage(8, playerState_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < playerState_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, playerState_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp other = (emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp) obj;

      if (!getPlayerStateList()
          .equals(other.getPlayerStateList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getPlayerStateCount() > 0) {
        hash = (37 * hash) + PLAYER_STATE_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerStateList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp prototype) {
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
     * CmdId: 7093
     * Obf: DOLLCIEKMJI
     * </pre>
     *
     * Protobuf type {@code GCGWorldPlayerGCGStateRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGWorldPlayerGCGStateRsp)
        emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.internal_static_GCGWorldPlayerGCGStateRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.internal_static_GCGWorldPlayerGCGStateRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp.class, emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp.newBuilder()
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
          getPlayerStateFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (playerStateBuilder_ == null) {
          playerState_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          playerStateBuilder_.clear();
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.internal_static_GCGWorldPlayerGCGStateRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp build() {
        emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp buildPartial() {
        emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp result = new emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp(this);
        int from_bitField0_ = bitField0_;
        if (playerStateBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            playerState_ = java.util.Collections.unmodifiableList(playerState_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.playerState_ = playerState_;
        } else {
          result.playerState_ = playerStateBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp other) {
        if (other == emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp.getDefaultInstance()) return this;
        if (playerStateBuilder_ == null) {
          if (!other.playerState_.isEmpty()) {
            if (playerState_.isEmpty()) {
              playerState_ = other.playerState_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayerStateIsMutable();
              playerState_.addAll(other.playerState_);
            }
            onChanged();
          }
        } else {
          if (!other.playerState_.isEmpty()) {
            if (playerStateBuilder_.isEmpty()) {
              playerStateBuilder_.dispose();
              playerStateBuilder_ = null;
              playerState_ = other.playerState_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playerStateBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayerStateFieldBuilder() : null;
            } else {
              playerStateBuilder_.addAllMessages(other.playerState_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState> playerState_ =
        java.util.Collections.emptyList();
      private void ensurePlayerStateIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          playerState_ = new java.util.ArrayList<emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState>(playerState_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState, emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder, emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGStateOrBuilder> playerStateBuilder_;

      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState> getPlayerStateList() {
        if (playerStateBuilder_ == null) {
          return java.util.Collections.unmodifiableList(playerState_);
        } else {
          return playerStateBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public int getPlayerStateCount() {
        if (playerStateBuilder_ == null) {
          return playerState_.size();
        } else {
          return playerStateBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState getPlayerState(int index) {
        if (playerStateBuilder_ == null) {
          return playerState_.get(index);
        } else {
          return playerStateBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public Builder setPlayerState(
          int index, emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState value) {
        if (playerStateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerStateIsMutable();
          playerState_.set(index, value);
          onChanged();
        } else {
          playerStateBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public Builder setPlayerState(
          int index, emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder builderForValue) {
        if (playerStateBuilder_ == null) {
          ensurePlayerStateIsMutable();
          playerState_.set(index, builderForValue.build());
          onChanged();
        } else {
          playerStateBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public Builder addPlayerState(emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState value) {
        if (playerStateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerStateIsMutable();
          playerState_.add(value);
          onChanged();
        } else {
          playerStateBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public Builder addPlayerState(
          int index, emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState value) {
        if (playerStateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerStateIsMutable();
          playerState_.add(index, value);
          onChanged();
        } else {
          playerStateBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public Builder addPlayerState(
          emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder builderForValue) {
        if (playerStateBuilder_ == null) {
          ensurePlayerStateIsMutable();
          playerState_.add(builderForValue.build());
          onChanged();
        } else {
          playerStateBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public Builder addPlayerState(
          int index, emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder builderForValue) {
        if (playerStateBuilder_ == null) {
          ensurePlayerStateIsMutable();
          playerState_.add(index, builderForValue.build());
          onChanged();
        } else {
          playerStateBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public Builder addAllPlayerState(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState> values) {
        if (playerStateBuilder_ == null) {
          ensurePlayerStateIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, playerState_);
          onChanged();
        } else {
          playerStateBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public Builder clearPlayerState() {
        if (playerStateBuilder_ == null) {
          playerState_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playerStateBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public Builder removePlayerState(int index) {
        if (playerStateBuilder_ == null) {
          ensurePlayerStateIsMutable();
          playerState_.remove(index);
          onChanged();
        } else {
          playerStateBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder getPlayerStateBuilder(
          int index) {
        return getPlayerStateFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGStateOrBuilder getPlayerStateOrBuilder(
          int index) {
        if (playerStateBuilder_ == null) {
          return playerState_.get(index);  } else {
          return playerStateBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGStateOrBuilder> 
           getPlayerStateOrBuilderList() {
        if (playerStateBuilder_ != null) {
          return playerStateBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(playerState_);
        }
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder addPlayerStateBuilder() {
        return getPlayerStateFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.getDefaultInstance());
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder addPlayerStateBuilder(
          int index) {
        return getPlayerStateFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.getDefaultInstance());
      }
      /**
       * <code>repeated .GCGPlayerGCGState player_state = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder> 
           getPlayerStateBuilderList() {
        return getPlayerStateFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState, emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder, emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGStateOrBuilder> 
          getPlayerStateFieldBuilder() {
        if (playerStateBuilder_ == null) {
          playerStateBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState, emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder, emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGStateOrBuilder>(
                  playerState_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          playerState_ = null;
        }
        return playerStateBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGWorldPlayerGCGStateRsp)
    }

    // @@protoc_insertion_point(class_scope:GCGWorldPlayerGCGStateRsp)
    private static final emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp();
    }

    public static emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGWorldPlayerGCGStateRsp>
        PARSER = new com.google.protobuf.AbstractParser<GCGWorldPlayerGCGStateRsp>() {
      @java.lang.Override
      public GCGWorldPlayerGCGStateRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGWorldPlayerGCGStateRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGWorldPlayerGCGStateRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGWorldPlayerGCGStateRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGWorldPlayerGCGStateRspOuterClass.GCGWorldPlayerGCGStateRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGWorldPlayerGCGStateRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGWorldPlayerGCGStateRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037GCGWorldPlayerGCGStateRsp.proto\032\027GCGPl" +
      "ayerGCGState.proto\"V\n\031GCGWorldPlayerGCGS" +
      "tateRsp\022(\n\014player_state\030\010 \003(\0132\022.GCGPlaye" +
      "rGCGState\022\017\n\007retcode\030\r \001(\005B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.getDescriptor(),
        });
    internal_static_GCGWorldPlayerGCGStateRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGWorldPlayerGCGStateRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGWorldPlayerGCGStateRsp_descriptor,
        new java.lang.String[] { "PlayerState", "Retcode", });
    emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
