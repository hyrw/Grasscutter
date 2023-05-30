// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGInviteGuestBattleRsp.proto

package emu.grasscutter.net.proto;

public final class GCGInviteGuestBattleRspOuterClass {
  private GCGInviteGuestBattleRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGInviteGuestBattleRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGInviteGuestBattleRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 OANEDGGOLIL = 4;</code>
     * @return The oANEDGGOLIL.
     */
    int getOANEDGGOLIL();

    /**
     * <code>uint32 confirm_end_time = 6;</code>
     * @return The confirmEndTime.
     */
    int getConfirmEndTime();

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 punish_end_time = 2;</code>
     * @return The punishEndTime.
     */
    int getPunishEndTime();

    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * CmdId: 7906
   * Obf: OEOMDOMDHLA
   * </pre>
   *
   * Protobuf type {@code GCGInviteGuestBattleRsp}
   */
  public static final class GCGInviteGuestBattleRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGInviteGuestBattleRsp)
      GCGInviteGuestBattleRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGInviteGuestBattleRsp.newBuilder() to construct.
    private GCGInviteGuestBattleRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGInviteGuestBattleRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGInviteGuestBattleRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGInviteGuestBattleRsp(
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
            case 16: {

              punishEndTime_ = input.readUInt32();
              break;
            }
            case 32: {

              oANEDGGOLIL_ = input.readUInt32();
              break;
            }
            case 48: {

              confirmEndTime_ = input.readUInt32();
              break;
            }
            case 56: {

              retcode_ = input.readInt32();
              break;
            }
            case 80: {

              uid_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.internal_static_GCGInviteGuestBattleRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.internal_static_GCGInviteGuestBattleRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp.class, emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp.Builder.class);
    }

    public static final int OANEDGGOLIL_FIELD_NUMBER = 4;
    private int oANEDGGOLIL_;
    /**
     * <code>uint32 OANEDGGOLIL = 4;</code>
     * @return The oANEDGGOLIL.
     */
    @java.lang.Override
    public int getOANEDGGOLIL() {
      return oANEDGGOLIL_;
    }

    public static final int CONFIRM_END_TIME_FIELD_NUMBER = 6;
    private int confirmEndTime_;
    /**
     * <code>uint32 confirm_end_time = 6;</code>
     * @return The confirmEndTime.
     */
    @java.lang.Override
    public int getConfirmEndTime() {
      return confirmEndTime_;
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int PUNISH_END_TIME_FIELD_NUMBER = 2;
    private int punishEndTime_;
    /**
     * <code>uint32 punish_end_time = 2;</code>
     * @return The punishEndTime.
     */
    @java.lang.Override
    public int getPunishEndTime() {
      return punishEndTime_;
    }

    public static final int UID_FIELD_NUMBER = 10;
    private int uid_;
    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      if (punishEndTime_ != 0) {
        output.writeUInt32(2, punishEndTime_);
      }
      if (oANEDGGOLIL_ != 0) {
        output.writeUInt32(4, oANEDGGOLIL_);
      }
      if (confirmEndTime_ != 0) {
        output.writeUInt32(6, confirmEndTime_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (uid_ != 0) {
        output.writeUInt32(10, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (punishEndTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, punishEndTime_);
      }
      if (oANEDGGOLIL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, oANEDGGOLIL_);
      }
      if (confirmEndTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, confirmEndTime_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp other = (emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp) obj;

      if (getOANEDGGOLIL()
          != other.getOANEDGGOLIL()) return false;
      if (getConfirmEndTime()
          != other.getConfirmEndTime()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getPunishEndTime()
          != other.getPunishEndTime()) return false;
      if (getUid()
          != other.getUid()) return false;
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
      hash = (37 * hash) + OANEDGGOLIL_FIELD_NUMBER;
      hash = (53 * hash) + getOANEDGGOLIL();
      hash = (37 * hash) + CONFIRM_END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getConfirmEndTime();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + PUNISH_END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPunishEndTime();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp prototype) {
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
     * CmdId: 7906
     * Obf: OEOMDOMDHLA
     * </pre>
     *
     * Protobuf type {@code GCGInviteGuestBattleRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGInviteGuestBattleRsp)
        emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.internal_static_GCGInviteGuestBattleRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.internal_static_GCGInviteGuestBattleRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp.class, emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp.newBuilder()
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
        oANEDGGOLIL_ = 0;

        confirmEndTime_ = 0;

        retcode_ = 0;

        punishEndTime_ = 0;

        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.internal_static_GCGInviteGuestBattleRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp build() {
        emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp buildPartial() {
        emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp result = new emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp(this);
        result.oANEDGGOLIL_ = oANEDGGOLIL_;
        result.confirmEndTime_ = confirmEndTime_;
        result.retcode_ = retcode_;
        result.punishEndTime_ = punishEndTime_;
        result.uid_ = uid_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp other) {
        if (other == emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp.getDefaultInstance()) return this;
        if (other.getOANEDGGOLIL() != 0) {
          setOANEDGGOLIL(other.getOANEDGGOLIL());
        }
        if (other.getConfirmEndTime() != 0) {
          setConfirmEndTime(other.getConfirmEndTime());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getPunishEndTime() != 0) {
          setPunishEndTime(other.getPunishEndTime());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
        emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int oANEDGGOLIL_ ;
      /**
       * <code>uint32 OANEDGGOLIL = 4;</code>
       * @return The oANEDGGOLIL.
       */
      @java.lang.Override
      public int getOANEDGGOLIL() {
        return oANEDGGOLIL_;
      }
      /**
       * <code>uint32 OANEDGGOLIL = 4;</code>
       * @param value The oANEDGGOLIL to set.
       * @return This builder for chaining.
       */
      public Builder setOANEDGGOLIL(int value) {
        
        oANEDGGOLIL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OANEDGGOLIL = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearOANEDGGOLIL() {
        
        oANEDGGOLIL_ = 0;
        onChanged();
        return this;
      }

      private int confirmEndTime_ ;
      /**
       * <code>uint32 confirm_end_time = 6;</code>
       * @return The confirmEndTime.
       */
      @java.lang.Override
      public int getConfirmEndTime() {
        return confirmEndTime_;
      }
      /**
       * <code>uint32 confirm_end_time = 6;</code>
       * @param value The confirmEndTime to set.
       * @return This builder for chaining.
       */
      public Builder setConfirmEndTime(int value) {
        
        confirmEndTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 confirm_end_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfirmEndTime() {
        
        confirmEndTime_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int punishEndTime_ ;
      /**
       * <code>uint32 punish_end_time = 2;</code>
       * @return The punishEndTime.
       */
      @java.lang.Override
      public int getPunishEndTime() {
        return punishEndTime_;
      }
      /**
       * <code>uint32 punish_end_time = 2;</code>
       * @param value The punishEndTime to set.
       * @return This builder for chaining.
       */
      public Builder setPunishEndTime(int value) {
        
        punishEndTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 punish_end_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPunishEndTime() {
        
        punishEndTime_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 10;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGInviteGuestBattleRsp)
    }

    // @@protoc_insertion_point(class_scope:GCGInviteGuestBattleRsp)
    private static final emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp();
    }

    public static emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGInviteGuestBattleRsp>
        PARSER = new com.google.protobuf.AbstractParser<GCGInviteGuestBattleRsp>() {
      @java.lang.Override
      public GCGInviteGuestBattleRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGInviteGuestBattleRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGInviteGuestBattleRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGInviteGuestBattleRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGInviteGuestBattleRspOuterClass.GCGInviteGuestBattleRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGInviteGuestBattleRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGInviteGuestBattleRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035GCGInviteGuestBattleRsp.proto\"\177\n\027GCGIn" +
      "viteGuestBattleRsp\022\023\n\013OANEDGGOLIL\030\004 \001(\r\022" +
      "\030\n\020confirm_end_time\030\006 \001(\r\022\017\n\007retcode\030\007 \001" +
      "(\005\022\027\n\017punish_end_time\030\002 \001(\r\022\013\n\003uid\030\n \001(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGInviteGuestBattleRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGInviteGuestBattleRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGInviteGuestBattleRsp_descriptor,
        new java.lang.String[] { "OANEDGGOLIL", "ConfirmEndTime", "Retcode", "PunishEndTime", "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
