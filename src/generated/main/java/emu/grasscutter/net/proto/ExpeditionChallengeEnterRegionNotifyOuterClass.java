// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExpeditionChallengeEnterRegionNotify.proto

package emu.grasscutter.net.proto;

public final class ExpeditionChallengeEnterRegionNotifyOuterClass {
  private ExpeditionChallengeEnterRegionNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExpeditionChallengeEnterRegionNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExpeditionChallengeEnterRegionNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_puzzle_finished = 11;</code>
     * @return The isPuzzleFinished.
     */
    boolean getIsPuzzleFinished();

    /**
     * <code>uint32 id = 8;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * CmdId: 2188
   * Obf: CFOKBBGKOKA
   * </pre>
   *
   * Protobuf type {@code ExpeditionChallengeEnterRegionNotify}
   */
  public static final class ExpeditionChallengeEnterRegionNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExpeditionChallengeEnterRegionNotify)
      ExpeditionChallengeEnterRegionNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExpeditionChallengeEnterRegionNotify.newBuilder() to construct.
    private ExpeditionChallengeEnterRegionNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExpeditionChallengeEnterRegionNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExpeditionChallengeEnterRegionNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ExpeditionChallengeEnterRegionNotify(
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

              id_ = input.readUInt32();
              break;
            }
            case 88: {

              isPuzzleFinished_ = input.readBool();
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
      return emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.internal_static_ExpeditionChallengeEnterRegionNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.internal_static_ExpeditionChallengeEnterRegionNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify.class, emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify.Builder.class);
    }

    public static final int IS_PUZZLE_FINISHED_FIELD_NUMBER = 11;
    private boolean isPuzzleFinished_;
    /**
     * <code>bool is_puzzle_finished = 11;</code>
     * @return The isPuzzleFinished.
     */
    @java.lang.Override
    public boolean getIsPuzzleFinished() {
      return isPuzzleFinished_;
    }

    public static final int ID_FIELD_NUMBER = 8;
    private int id_;
    /**
     * <code>uint32 id = 8;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (id_ != 0) {
        output.writeUInt32(8, id_);
      }
      if (isPuzzleFinished_ != false) {
        output.writeBool(11, isPuzzleFinished_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, id_);
      }
      if (isPuzzleFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isPuzzleFinished_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify other = (emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify) obj;

      if (getIsPuzzleFinished()
          != other.getIsPuzzleFinished()) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + IS_PUZZLE_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsPuzzleFinished());
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify prototype) {
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
     * CmdId: 2188
     * Obf: CFOKBBGKOKA
     * </pre>
     *
     * Protobuf type {@code ExpeditionChallengeEnterRegionNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExpeditionChallengeEnterRegionNotify)
        emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.internal_static_ExpeditionChallengeEnterRegionNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.internal_static_ExpeditionChallengeEnterRegionNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify.class, emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify.newBuilder()
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
        isPuzzleFinished_ = false;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.internal_static_ExpeditionChallengeEnterRegionNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify build() {
        emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify buildPartial() {
        emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify result = new emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify(this);
        result.isPuzzleFinished_ = isPuzzleFinished_;
        result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify other) {
        if (other == emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify.getDefaultInstance()) return this;
        if (other.getIsPuzzleFinished() != false) {
          setIsPuzzleFinished(other.getIsPuzzleFinished());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
        emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isPuzzleFinished_ ;
      /**
       * <code>bool is_puzzle_finished = 11;</code>
       * @return The isPuzzleFinished.
       */
      @java.lang.Override
      public boolean getIsPuzzleFinished() {
        return isPuzzleFinished_;
      }
      /**
       * <code>bool is_puzzle_finished = 11;</code>
       * @param value The isPuzzleFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsPuzzleFinished(boolean value) {
        
        isPuzzleFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_puzzle_finished = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsPuzzleFinished() {
        
        isPuzzleFinished_ = false;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 8;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 8;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ExpeditionChallengeEnterRegionNotify)
    }

    // @@protoc_insertion_point(class_scope:ExpeditionChallengeEnterRegionNotify)
    private static final emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify();
    }

    public static emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExpeditionChallengeEnterRegionNotify>
        PARSER = new com.google.protobuf.AbstractParser<ExpeditionChallengeEnterRegionNotify>() {
      @java.lang.Override
      public ExpeditionChallengeEnterRegionNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExpeditionChallengeEnterRegionNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ExpeditionChallengeEnterRegionNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExpeditionChallengeEnterRegionNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ExpeditionChallengeEnterRegionNotifyOuterClass.ExpeditionChallengeEnterRegionNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExpeditionChallengeEnterRegionNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExpeditionChallengeEnterRegionNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*ExpeditionChallengeEnterRegionNotify.p" +
      "roto\"N\n$ExpeditionChallengeEnterRegionNo" +
      "tify\022\032\n\022is_puzzle_finished\030\013 \001(\010\022\n\n\002id\030\010" +
      " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ExpeditionChallengeEnterRegionNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExpeditionChallengeEnterRegionNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExpeditionChallengeEnterRegionNotify_descriptor,
        new java.lang.String[] { "IsPuzzleFinished", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
