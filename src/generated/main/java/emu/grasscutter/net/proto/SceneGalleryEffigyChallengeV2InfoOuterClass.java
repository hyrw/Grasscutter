// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryEffigyChallengeV2Info.proto

package emu.grasscutter.net.proto;

public final class SceneGalleryEffigyChallengeV2InfoOuterClass {
  private SceneGalleryEffigyChallengeV2InfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryEffigyChallengeV2InfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryEffigyChallengeV2Info)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 MLKMBDPMGCN = 10;</code>
     * @return The mLKMBDPMGCN.
     */
    int getMLKMBDPMGCN();

    /**
     * <code>uint32 ALCIMMHBFGF = 7;</code>
     * @return The aLCIMMHBFGF.
     */
    int getALCIMMHBFGF();

    /**
     * <code>uint32 NBNBNNMHBIF = 4;</code>
     * @return The nBNBNNMHBIF.
     */
    int getNBNBNNMHBIF();

    /**
     * <code>uint32 LMBEBNHDECJ = 11;</code>
     * @return The lMBEBNHDECJ.
     */
    int getLMBEBNHDECJ();

    /**
     * <code>uint32 KEPEDKKHGIO = 2;</code>
     * @return The kEPEDKKHGIO.
     */
    int getKEPEDKKHGIO();
  }
  /**
   * <pre>
   * Obf: EBGFIMFDOMH
   * </pre>
   *
   * Protobuf type {@code SceneGalleryEffigyChallengeV2Info}
   */
  public static final class SceneGalleryEffigyChallengeV2Info extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryEffigyChallengeV2Info)
      SceneGalleryEffigyChallengeV2InfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryEffigyChallengeV2Info.newBuilder() to construct.
    private SceneGalleryEffigyChallengeV2Info(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryEffigyChallengeV2Info() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryEffigyChallengeV2Info();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryEffigyChallengeV2Info(
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

              kEPEDKKHGIO_ = input.readUInt32();
              break;
            }
            case 32: {

              nBNBNNMHBIF_ = input.readUInt32();
              break;
            }
            case 56: {

              aLCIMMHBFGF_ = input.readUInt32();
              break;
            }
            case 80: {

              mLKMBDPMGCN_ = input.readUInt32();
              break;
            }
            case 88: {

              lMBEBNHDECJ_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.internal_static_SceneGalleryEffigyChallengeV2Info_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.internal_static_SceneGalleryEffigyChallengeV2Info_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.class, emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.Builder.class);
    }

    public static final int MLKMBDPMGCN_FIELD_NUMBER = 10;
    private int mLKMBDPMGCN_;
    /**
     * <code>uint32 MLKMBDPMGCN = 10;</code>
     * @return The mLKMBDPMGCN.
     */
    @java.lang.Override
    public int getMLKMBDPMGCN() {
      return mLKMBDPMGCN_;
    }

    public static final int ALCIMMHBFGF_FIELD_NUMBER = 7;
    private int aLCIMMHBFGF_;
    /**
     * <code>uint32 ALCIMMHBFGF = 7;</code>
     * @return The aLCIMMHBFGF.
     */
    @java.lang.Override
    public int getALCIMMHBFGF() {
      return aLCIMMHBFGF_;
    }

    public static final int NBNBNNMHBIF_FIELD_NUMBER = 4;
    private int nBNBNNMHBIF_;
    /**
     * <code>uint32 NBNBNNMHBIF = 4;</code>
     * @return The nBNBNNMHBIF.
     */
    @java.lang.Override
    public int getNBNBNNMHBIF() {
      return nBNBNNMHBIF_;
    }

    public static final int LMBEBNHDECJ_FIELD_NUMBER = 11;
    private int lMBEBNHDECJ_;
    /**
     * <code>uint32 LMBEBNHDECJ = 11;</code>
     * @return The lMBEBNHDECJ.
     */
    @java.lang.Override
    public int getLMBEBNHDECJ() {
      return lMBEBNHDECJ_;
    }

    public static final int KEPEDKKHGIO_FIELD_NUMBER = 2;
    private int kEPEDKKHGIO_;
    /**
     * <code>uint32 KEPEDKKHGIO = 2;</code>
     * @return The kEPEDKKHGIO.
     */
    @java.lang.Override
    public int getKEPEDKKHGIO() {
      return kEPEDKKHGIO_;
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
      if (kEPEDKKHGIO_ != 0) {
        output.writeUInt32(2, kEPEDKKHGIO_);
      }
      if (nBNBNNMHBIF_ != 0) {
        output.writeUInt32(4, nBNBNNMHBIF_);
      }
      if (aLCIMMHBFGF_ != 0) {
        output.writeUInt32(7, aLCIMMHBFGF_);
      }
      if (mLKMBDPMGCN_ != 0) {
        output.writeUInt32(10, mLKMBDPMGCN_);
      }
      if (lMBEBNHDECJ_ != 0) {
        output.writeUInt32(11, lMBEBNHDECJ_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (kEPEDKKHGIO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, kEPEDKKHGIO_);
      }
      if (nBNBNNMHBIF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, nBNBNNMHBIF_);
      }
      if (aLCIMMHBFGF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, aLCIMMHBFGF_);
      }
      if (mLKMBDPMGCN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, mLKMBDPMGCN_);
      }
      if (lMBEBNHDECJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, lMBEBNHDECJ_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info other = (emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info) obj;

      if (getMLKMBDPMGCN()
          != other.getMLKMBDPMGCN()) return false;
      if (getALCIMMHBFGF()
          != other.getALCIMMHBFGF()) return false;
      if (getNBNBNNMHBIF()
          != other.getNBNBNNMHBIF()) return false;
      if (getLMBEBNHDECJ()
          != other.getLMBEBNHDECJ()) return false;
      if (getKEPEDKKHGIO()
          != other.getKEPEDKKHGIO()) return false;
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
      hash = (37 * hash) + MLKMBDPMGCN_FIELD_NUMBER;
      hash = (53 * hash) + getMLKMBDPMGCN();
      hash = (37 * hash) + ALCIMMHBFGF_FIELD_NUMBER;
      hash = (53 * hash) + getALCIMMHBFGF();
      hash = (37 * hash) + NBNBNNMHBIF_FIELD_NUMBER;
      hash = (53 * hash) + getNBNBNNMHBIF();
      hash = (37 * hash) + LMBEBNHDECJ_FIELD_NUMBER;
      hash = (53 * hash) + getLMBEBNHDECJ();
      hash = (37 * hash) + KEPEDKKHGIO_FIELD_NUMBER;
      hash = (53 * hash) + getKEPEDKKHGIO();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info prototype) {
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
     * Obf: EBGFIMFDOMH
     * </pre>
     *
     * Protobuf type {@code SceneGalleryEffigyChallengeV2Info}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryEffigyChallengeV2Info)
        emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2InfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.internal_static_SceneGalleryEffigyChallengeV2Info_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.internal_static_SceneGalleryEffigyChallengeV2Info_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.class, emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.newBuilder()
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
        mLKMBDPMGCN_ = 0;

        aLCIMMHBFGF_ = 0;

        nBNBNNMHBIF_ = 0;

        lMBEBNHDECJ_ = 0;

        kEPEDKKHGIO_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.internal_static_SceneGalleryEffigyChallengeV2Info_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info build() {
        emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info buildPartial() {
        emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info result = new emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info(this);
        result.mLKMBDPMGCN_ = mLKMBDPMGCN_;
        result.aLCIMMHBFGF_ = aLCIMMHBFGF_;
        result.nBNBNNMHBIF_ = nBNBNNMHBIF_;
        result.lMBEBNHDECJ_ = lMBEBNHDECJ_;
        result.kEPEDKKHGIO_ = kEPEDKKHGIO_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info) {
          return mergeFrom((emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info other) {
        if (other == emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info.getDefaultInstance()) return this;
        if (other.getMLKMBDPMGCN() != 0) {
          setMLKMBDPMGCN(other.getMLKMBDPMGCN());
        }
        if (other.getALCIMMHBFGF() != 0) {
          setALCIMMHBFGF(other.getALCIMMHBFGF());
        }
        if (other.getNBNBNNMHBIF() != 0) {
          setNBNBNNMHBIF(other.getNBNBNNMHBIF());
        }
        if (other.getLMBEBNHDECJ() != 0) {
          setLMBEBNHDECJ(other.getLMBEBNHDECJ());
        }
        if (other.getKEPEDKKHGIO() != 0) {
          setKEPEDKKHGIO(other.getKEPEDKKHGIO());
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
        emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int mLKMBDPMGCN_ ;
      /**
       * <code>uint32 MLKMBDPMGCN = 10;</code>
       * @return The mLKMBDPMGCN.
       */
      @java.lang.Override
      public int getMLKMBDPMGCN() {
        return mLKMBDPMGCN_;
      }
      /**
       * <code>uint32 MLKMBDPMGCN = 10;</code>
       * @param value The mLKMBDPMGCN to set.
       * @return This builder for chaining.
       */
      public Builder setMLKMBDPMGCN(int value) {
        
        mLKMBDPMGCN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MLKMBDPMGCN = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMLKMBDPMGCN() {
        
        mLKMBDPMGCN_ = 0;
        onChanged();
        return this;
      }

      private int aLCIMMHBFGF_ ;
      /**
       * <code>uint32 ALCIMMHBFGF = 7;</code>
       * @return The aLCIMMHBFGF.
       */
      @java.lang.Override
      public int getALCIMMHBFGF() {
        return aLCIMMHBFGF_;
      }
      /**
       * <code>uint32 ALCIMMHBFGF = 7;</code>
       * @param value The aLCIMMHBFGF to set.
       * @return This builder for chaining.
       */
      public Builder setALCIMMHBFGF(int value) {
        
        aLCIMMHBFGF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ALCIMMHBFGF = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearALCIMMHBFGF() {
        
        aLCIMMHBFGF_ = 0;
        onChanged();
        return this;
      }

      private int nBNBNNMHBIF_ ;
      /**
       * <code>uint32 NBNBNNMHBIF = 4;</code>
       * @return The nBNBNNMHBIF.
       */
      @java.lang.Override
      public int getNBNBNNMHBIF() {
        return nBNBNNMHBIF_;
      }
      /**
       * <code>uint32 NBNBNNMHBIF = 4;</code>
       * @param value The nBNBNNMHBIF to set.
       * @return This builder for chaining.
       */
      public Builder setNBNBNNMHBIF(int value) {
        
        nBNBNNMHBIF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NBNBNNMHBIF = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearNBNBNNMHBIF() {
        
        nBNBNNMHBIF_ = 0;
        onChanged();
        return this;
      }

      private int lMBEBNHDECJ_ ;
      /**
       * <code>uint32 LMBEBNHDECJ = 11;</code>
       * @return The lMBEBNHDECJ.
       */
      @java.lang.Override
      public int getLMBEBNHDECJ() {
        return lMBEBNHDECJ_;
      }
      /**
       * <code>uint32 LMBEBNHDECJ = 11;</code>
       * @param value The lMBEBNHDECJ to set.
       * @return This builder for chaining.
       */
      public Builder setLMBEBNHDECJ(int value) {
        
        lMBEBNHDECJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LMBEBNHDECJ = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLMBEBNHDECJ() {
        
        lMBEBNHDECJ_ = 0;
        onChanged();
        return this;
      }

      private int kEPEDKKHGIO_ ;
      /**
       * <code>uint32 KEPEDKKHGIO = 2;</code>
       * @return The kEPEDKKHGIO.
       */
      @java.lang.Override
      public int getKEPEDKKHGIO() {
        return kEPEDKKHGIO_;
      }
      /**
       * <code>uint32 KEPEDKKHGIO = 2;</code>
       * @param value The kEPEDKKHGIO to set.
       * @return This builder for chaining.
       */
      public Builder setKEPEDKKHGIO(int value) {
        
        kEPEDKKHGIO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KEPEDKKHGIO = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearKEPEDKKHGIO() {
        
        kEPEDKKHGIO_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryEffigyChallengeV2Info)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryEffigyChallengeV2Info)
    private static final emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info();
    }

    public static emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryEffigyChallengeV2Info>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryEffigyChallengeV2Info>() {
      @java.lang.Override
      public SceneGalleryEffigyChallengeV2Info parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryEffigyChallengeV2Info(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryEffigyChallengeV2Info> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryEffigyChallengeV2Info> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneGalleryEffigyChallengeV2InfoOuterClass.SceneGalleryEffigyChallengeV2Info getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryEffigyChallengeV2Info_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryEffigyChallengeV2Info_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'SceneGalleryEffigyChallengeV2Info.prot" +
      "o\"\214\001\n!SceneGalleryEffigyChallengeV2Info\022" +
      "\023\n\013MLKMBDPMGCN\030\n \001(\r\022\023\n\013ALCIMMHBFGF\030\007 \001(" +
      "\r\022\023\n\013NBNBNNMHBIF\030\004 \001(\r\022\023\n\013LMBEBNHDECJ\030\013 " +
      "\001(\r\022\023\n\013KEPEDKKHGIO\030\002 \001(\rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryEffigyChallengeV2Info_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryEffigyChallengeV2Info_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryEffigyChallengeV2Info_descriptor,
        new java.lang.String[] { "MLKMBDPMGCN", "ALCIMMHBFGF", "NBNBNNMHBIF", "LMBEBNHDECJ", "KEPEDKKHGIO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
