// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampStageInfoChangeNotify.proto

package emu.grasscutter.net.proto;

public final class WinterCampStageInfoChangeNotifyOuterClass {
  private WinterCampStageInfoChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampStageInfoChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WinterCampStageInfoChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.WinterCampStageInfo battle_info = 8;</code>
     * @return Whether the battleInfo field is set.
     */
    boolean hasBattleInfo();
    /**
     * <code>.WinterCampStageInfo battle_info = 8;</code>
     * @return The battleInfo.
     */
    emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo getBattleInfo();
    /**
     * <code>.WinterCampStageInfo battle_info = 8;</code>
     */
    emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfoOrBuilder getBattleInfoOrBuilder();

    /**
     * <code>.WinterCampStageInfo explore_info = 4;</code>
     * @return Whether the exploreInfo field is set.
     */
    boolean hasExploreInfo();
    /**
     * <code>.WinterCampStageInfo explore_info = 4;</code>
     * @return The exploreInfo.
     */
    emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo getExploreInfo();
    /**
     * <code>.WinterCampStageInfo explore_info = 4;</code>
     */
    emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfoOrBuilder getExploreInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 8463
   * Obf: IHFPJIAKIEJ
   * </pre>
   *
   * Protobuf type {@code WinterCampStageInfoChangeNotify}
   */
  public static final class WinterCampStageInfoChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampStageInfoChangeNotify)
      WinterCampStageInfoChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WinterCampStageInfoChangeNotify.newBuilder() to construct.
    private WinterCampStageInfoChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WinterCampStageInfoChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WinterCampStageInfoChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WinterCampStageInfoChangeNotify(
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
            case 34: {
              emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.Builder subBuilder = null;
              if (exploreInfo_ != null) {
                subBuilder = exploreInfo_.toBuilder();
              }
              exploreInfo_ = input.readMessage(emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(exploreInfo_);
                exploreInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 66: {
              emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.Builder subBuilder = null;
              if (battleInfo_ != null) {
                subBuilder = battleInfo_.toBuilder();
              }
              battleInfo_ = input.readMessage(emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(battleInfo_);
                battleInfo_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.internal_static_WinterCampStageInfoChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.internal_static_WinterCampStageInfoChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify.class, emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify.Builder.class);
    }

    public static final int BATTLE_INFO_FIELD_NUMBER = 8;
    private emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo battleInfo_;
    /**
     * <code>.WinterCampStageInfo battle_info = 8;</code>
     * @return Whether the battleInfo field is set.
     */
    @java.lang.Override
    public boolean hasBattleInfo() {
      return battleInfo_ != null;
    }
    /**
     * <code>.WinterCampStageInfo battle_info = 8;</code>
     * @return The battleInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo getBattleInfo() {
      return battleInfo_ == null ? emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.getDefaultInstance() : battleInfo_;
    }
    /**
     * <code>.WinterCampStageInfo battle_info = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfoOrBuilder getBattleInfoOrBuilder() {
      return getBattleInfo();
    }

    public static final int EXPLORE_INFO_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo exploreInfo_;
    /**
     * <code>.WinterCampStageInfo explore_info = 4;</code>
     * @return Whether the exploreInfo field is set.
     */
    @java.lang.Override
    public boolean hasExploreInfo() {
      return exploreInfo_ != null;
    }
    /**
     * <code>.WinterCampStageInfo explore_info = 4;</code>
     * @return The exploreInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo getExploreInfo() {
      return exploreInfo_ == null ? emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.getDefaultInstance() : exploreInfo_;
    }
    /**
     * <code>.WinterCampStageInfo explore_info = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfoOrBuilder getExploreInfoOrBuilder() {
      return getExploreInfo();
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
      if (exploreInfo_ != null) {
        output.writeMessage(4, getExploreInfo());
      }
      if (battleInfo_ != null) {
        output.writeMessage(8, getBattleInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (exploreInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getExploreInfo());
      }
      if (battleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getBattleInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify other = (emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify) obj;

      if (hasBattleInfo() != other.hasBattleInfo()) return false;
      if (hasBattleInfo()) {
        if (!getBattleInfo()
            .equals(other.getBattleInfo())) return false;
      }
      if (hasExploreInfo() != other.hasExploreInfo()) return false;
      if (hasExploreInfo()) {
        if (!getExploreInfo()
            .equals(other.getExploreInfo())) return false;
      }
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
      if (hasBattleInfo()) {
        hash = (37 * hash) + BATTLE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getBattleInfo().hashCode();
      }
      if (hasExploreInfo()) {
        hash = (37 * hash) + EXPLORE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getExploreInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify prototype) {
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
     * CmdId: 8463
     * Obf: IHFPJIAKIEJ
     * </pre>
     *
     * Protobuf type {@code WinterCampStageInfoChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WinterCampStageInfoChangeNotify)
        emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.internal_static_WinterCampStageInfoChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.internal_static_WinterCampStageInfoChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify.class, emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify.newBuilder()
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
        if (battleInfoBuilder_ == null) {
          battleInfo_ = null;
        } else {
          battleInfo_ = null;
          battleInfoBuilder_ = null;
        }
        if (exploreInfoBuilder_ == null) {
          exploreInfo_ = null;
        } else {
          exploreInfo_ = null;
          exploreInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.internal_static_WinterCampStageInfoChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify build() {
        emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify buildPartial() {
        emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify result = new emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify(this);
        if (battleInfoBuilder_ == null) {
          result.battleInfo_ = battleInfo_;
        } else {
          result.battleInfo_ = battleInfoBuilder_.build();
        }
        if (exploreInfoBuilder_ == null) {
          result.exploreInfo_ = exploreInfo_;
        } else {
          result.exploreInfo_ = exploreInfoBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify other) {
        if (other == emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify.getDefaultInstance()) return this;
        if (other.hasBattleInfo()) {
          mergeBattleInfo(other.getBattleInfo());
        }
        if (other.hasExploreInfo()) {
          mergeExploreInfo(other.getExploreInfo());
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
        emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo battleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo, emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.Builder, emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfoOrBuilder> battleInfoBuilder_;
      /**
       * <code>.WinterCampStageInfo battle_info = 8;</code>
       * @return Whether the battleInfo field is set.
       */
      public boolean hasBattleInfo() {
        return battleInfoBuilder_ != null || battleInfo_ != null;
      }
      /**
       * <code>.WinterCampStageInfo battle_info = 8;</code>
       * @return The battleInfo.
       */
      public emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo getBattleInfo() {
        if (battleInfoBuilder_ == null) {
          return battleInfo_ == null ? emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.getDefaultInstance() : battleInfo_;
        } else {
          return battleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.WinterCampStageInfo battle_info = 8;</code>
       */
      public Builder setBattleInfo(emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo value) {
        if (battleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          battleInfo_ = value;
          onChanged();
        } else {
          battleInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.WinterCampStageInfo battle_info = 8;</code>
       */
      public Builder setBattleInfo(
          emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.Builder builderForValue) {
        if (battleInfoBuilder_ == null) {
          battleInfo_ = builderForValue.build();
          onChanged();
        } else {
          battleInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.WinterCampStageInfo battle_info = 8;</code>
       */
      public Builder mergeBattleInfo(emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo value) {
        if (battleInfoBuilder_ == null) {
          if (battleInfo_ != null) {
            battleInfo_ =
              emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.newBuilder(battleInfo_).mergeFrom(value).buildPartial();
          } else {
            battleInfo_ = value;
          }
          onChanged();
        } else {
          battleInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.WinterCampStageInfo battle_info = 8;</code>
       */
      public Builder clearBattleInfo() {
        if (battleInfoBuilder_ == null) {
          battleInfo_ = null;
          onChanged();
        } else {
          battleInfo_ = null;
          battleInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.WinterCampStageInfo battle_info = 8;</code>
       */
      public emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.Builder getBattleInfoBuilder() {
        
        onChanged();
        return getBattleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.WinterCampStageInfo battle_info = 8;</code>
       */
      public emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfoOrBuilder getBattleInfoOrBuilder() {
        if (battleInfoBuilder_ != null) {
          return battleInfoBuilder_.getMessageOrBuilder();
        } else {
          return battleInfo_ == null ?
              emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.getDefaultInstance() : battleInfo_;
        }
      }
      /**
       * <code>.WinterCampStageInfo battle_info = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo, emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.Builder, emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfoOrBuilder> 
          getBattleInfoFieldBuilder() {
        if (battleInfoBuilder_ == null) {
          battleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo, emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.Builder, emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfoOrBuilder>(
                  getBattleInfo(),
                  getParentForChildren(),
                  isClean());
          battleInfo_ = null;
        }
        return battleInfoBuilder_;
      }

      private emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo exploreInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo, emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.Builder, emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfoOrBuilder> exploreInfoBuilder_;
      /**
       * <code>.WinterCampStageInfo explore_info = 4;</code>
       * @return Whether the exploreInfo field is set.
       */
      public boolean hasExploreInfo() {
        return exploreInfoBuilder_ != null || exploreInfo_ != null;
      }
      /**
       * <code>.WinterCampStageInfo explore_info = 4;</code>
       * @return The exploreInfo.
       */
      public emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo getExploreInfo() {
        if (exploreInfoBuilder_ == null) {
          return exploreInfo_ == null ? emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.getDefaultInstance() : exploreInfo_;
        } else {
          return exploreInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.WinterCampStageInfo explore_info = 4;</code>
       */
      public Builder setExploreInfo(emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo value) {
        if (exploreInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          exploreInfo_ = value;
          onChanged();
        } else {
          exploreInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.WinterCampStageInfo explore_info = 4;</code>
       */
      public Builder setExploreInfo(
          emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.Builder builderForValue) {
        if (exploreInfoBuilder_ == null) {
          exploreInfo_ = builderForValue.build();
          onChanged();
        } else {
          exploreInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.WinterCampStageInfo explore_info = 4;</code>
       */
      public Builder mergeExploreInfo(emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo value) {
        if (exploreInfoBuilder_ == null) {
          if (exploreInfo_ != null) {
            exploreInfo_ =
              emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.newBuilder(exploreInfo_).mergeFrom(value).buildPartial();
          } else {
            exploreInfo_ = value;
          }
          onChanged();
        } else {
          exploreInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.WinterCampStageInfo explore_info = 4;</code>
       */
      public Builder clearExploreInfo() {
        if (exploreInfoBuilder_ == null) {
          exploreInfo_ = null;
          onChanged();
        } else {
          exploreInfo_ = null;
          exploreInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.WinterCampStageInfo explore_info = 4;</code>
       */
      public emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.Builder getExploreInfoBuilder() {
        
        onChanged();
        return getExploreInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.WinterCampStageInfo explore_info = 4;</code>
       */
      public emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfoOrBuilder getExploreInfoOrBuilder() {
        if (exploreInfoBuilder_ != null) {
          return exploreInfoBuilder_.getMessageOrBuilder();
        } else {
          return exploreInfo_ == null ?
              emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.getDefaultInstance() : exploreInfo_;
        }
      }
      /**
       * <code>.WinterCampStageInfo explore_info = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo, emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.Builder, emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfoOrBuilder> 
          getExploreInfoFieldBuilder() {
        if (exploreInfoBuilder_ == null) {
          exploreInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo, emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfo.Builder, emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.WinterCampStageInfoOrBuilder>(
                  getExploreInfo(),
                  getParentForChildren(),
                  isClean());
          exploreInfo_ = null;
        }
        return exploreInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WinterCampStageInfoChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:WinterCampStageInfoChangeNotify)
    private static final emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify();
    }

    public static emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WinterCampStageInfoChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampStageInfoChangeNotify>() {
      @java.lang.Override
      public WinterCampStageInfoChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WinterCampStageInfoChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WinterCampStageInfoChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampStageInfoChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampStageInfoChangeNotifyOuterClass.WinterCampStageInfoChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampStageInfoChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampStageInfoChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%WinterCampStageInfoChangeNotify.proto\032" +
      "\031WinterCampStageInfo.proto\"x\n\037WinterCamp" +
      "StageInfoChangeNotify\022)\n\013battle_info\030\010 \001" +
      "(\0132\024.WinterCampStageInfo\022*\n\014explore_info" +
      "\030\004 \001(\0132\024.WinterCampStageInfoB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.getDescriptor(),
        });
    internal_static_WinterCampStageInfoChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampStageInfoChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WinterCampStageInfoChangeNotify_descriptor,
        new java.lang.String[] { "BattleInfo", "ExploreInfo", });
    emu.grasscutter.net.proto.WinterCampStageInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
