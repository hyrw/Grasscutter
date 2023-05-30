// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSDeckUnlockNotify.proto

package emu.grasscutter.net.proto;

public final class GCGDSDeckUnlockNotifyOuterClass {
  private GCGDSDeckUnlockNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSDeckUnlockNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSDeckUnlockNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 deck_id = 8;</code>
     * @return The deckId.
     */
    int getDeckId();
  }
  /**
   * <pre>
   * CmdId: 7385
   * Obf: HHPIKGHBMEC
   * </pre>
   *
   * Protobuf type {@code GCGDSDeckUnlockNotify}
   */
  public static final class GCGDSDeckUnlockNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSDeckUnlockNotify)
      GCGDSDeckUnlockNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSDeckUnlockNotify.newBuilder() to construct.
    private GCGDSDeckUnlockNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSDeckUnlockNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSDeckUnlockNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSDeckUnlockNotify(
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
            case 64: {

              deckId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.internal_static_GCGDSDeckUnlockNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.internal_static_GCGDSDeckUnlockNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify.class, emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify.Builder.class);
    }

    public static final int DECK_ID_FIELD_NUMBER = 8;
    private int deckId_;
    /**
     * <code>uint32 deck_id = 8;</code>
     * @return The deckId.
     */
    @java.lang.Override
    public int getDeckId() {
      return deckId_;
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
      if (deckId_ != 0) {
        output.writeUInt32(8, deckId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (deckId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, deckId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify other = (emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify) obj;

      if (getDeckId()
          != other.getDeckId()) return false;
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
      hash = (37 * hash) + DECK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDeckId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify prototype) {
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
     * CmdId: 7385
     * Obf: HHPIKGHBMEC
     * </pre>
     *
     * Protobuf type {@code GCGDSDeckUnlockNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSDeckUnlockNotify)
        emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.internal_static_GCGDSDeckUnlockNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.internal_static_GCGDSDeckUnlockNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify.class, emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify.newBuilder()
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
        deckId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.internal_static_GCGDSDeckUnlockNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify build() {
        emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify buildPartial() {
        emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify result = new emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify(this);
        result.deckId_ = deckId_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify other) {
        if (other == emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify.getDefaultInstance()) return this;
        if (other.getDeckId() != 0) {
          setDeckId(other.getDeckId());
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
        emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int deckId_ ;
      /**
       * <code>uint32 deck_id = 8;</code>
       * @return The deckId.
       */
      @java.lang.Override
      public int getDeckId() {
        return deckId_;
      }
      /**
       * <code>uint32 deck_id = 8;</code>
       * @param value The deckId to set.
       * @return This builder for chaining.
       */
      public Builder setDeckId(int value) {
        
        deckId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 deck_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeckId() {
        
        deckId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGDSDeckUnlockNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGDSDeckUnlockNotify)
    private static final emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify();
    }

    public static emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSDeckUnlockNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSDeckUnlockNotify>() {
      @java.lang.Override
      public GCGDSDeckUnlockNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSDeckUnlockNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGDSDeckUnlockNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSDeckUnlockNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSDeckUnlockNotifyOuterClass.GCGDSDeckUnlockNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSDeckUnlockNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSDeckUnlockNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033GCGDSDeckUnlockNotify.proto\"(\n\025GCGDSDe" +
      "ckUnlockNotify\022\017\n\007deck_id\030\010 \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSDeckUnlockNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSDeckUnlockNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSDeckUnlockNotify_descriptor,
        new java.lang.String[] { "DeckId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
