// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.rainway.sachiel.messages;

public final class MessageProto {
  private MessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.rainway.sachiel.messages.Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
     */
    boolean hasHeader();
    /**
     * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
     */
    com.rainway.sachiel.messages.HeaderProto.Header getHeader();
    /**
     * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
     */
    com.rainway.sachiel.messages.HeaderProto.HeaderOrBuilder getHeaderOrBuilder();
  }
  /**
   * Protobuf type {@code com.rainway.sachiel.messages.Message}
   */
  public  static final class Message extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.rainway.sachiel.messages.Message)
      MessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Message() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Message(
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
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.rainway.sachiel.messages.HeaderProto.Header.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(com.rainway.sachiel.messages.HeaderProto.Header.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
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
      return com.rainway.sachiel.messages.MessageProto.internal_static_com_rainway_sachiel_messages_Message_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rainway.sachiel.messages.MessageProto.internal_static_com_rainway_sachiel_messages_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rainway.sachiel.messages.MessageProto.Message.class, com.rainway.sachiel.messages.MessageProto.Message.Builder.class);
    }

    private int bitField0_;
    public static final int HEADER_FIELD_NUMBER = 1;
    private com.rainway.sachiel.messages.HeaderProto.Header header_;
    /**
     * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
     */
    public com.rainway.sachiel.messages.HeaderProto.Header getHeader() {
      return header_ == null ? com.rainway.sachiel.messages.HeaderProto.Header.getDefaultInstance() : header_;
    }
    /**
     * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
     */
    public com.rainway.sachiel.messages.HeaderProto.HeaderOrBuilder getHeaderOrBuilder() {
      return header_ == null ? com.rainway.sachiel.messages.HeaderProto.Header.getDefaultInstance() : header_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasHeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getHeader().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getHeader());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getHeader());
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
      if (!(obj instanceof com.rainway.sachiel.messages.MessageProto.Message)) {
        return super.equals(obj);
      }
      com.rainway.sachiel.messages.MessageProto.Message other = (com.rainway.sachiel.messages.MessageProto.Message) obj;

      boolean result = true;
      result = result && (hasHeader() == other.hasHeader());
      if (hasHeader()) {
        result = result && getHeader()
            .equals(other.getHeader());
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
      if (hasHeader()) {
        hash = (37 * hash) + HEADER_FIELD_NUMBER;
        hash = (53 * hash) + getHeader().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.rainway.sachiel.messages.MessageProto.Message parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.rainway.sachiel.messages.MessageProto.Message parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.rainway.sachiel.messages.MessageProto.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.rainway.sachiel.messages.MessageProto.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.rainway.sachiel.messages.MessageProto.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.rainway.sachiel.messages.MessageProto.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.rainway.sachiel.messages.MessageProto.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.rainway.sachiel.messages.MessageProto.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.rainway.sachiel.messages.MessageProto.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.rainway.sachiel.messages.MessageProto.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.rainway.sachiel.messages.MessageProto.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.rainway.sachiel.messages.MessageProto.Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.rainway.sachiel.messages.MessageProto.Message prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code com.rainway.sachiel.messages.Message}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.rainway.sachiel.messages.Message)
        com.rainway.sachiel.messages.MessageProto.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.rainway.sachiel.messages.MessageProto.internal_static_com_rainway_sachiel_messages_Message_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.rainway.sachiel.messages.MessageProto.internal_static_com_rainway_sachiel_messages_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.rainway.sachiel.messages.MessageProto.Message.class, com.rainway.sachiel.messages.MessageProto.Message.Builder.class);
      }

      // Construct using com.rainway.sachiel.messages.MessageProto.Message.newBuilder()
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
          getHeaderFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = null;
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.rainway.sachiel.messages.MessageProto.internal_static_com_rainway_sachiel_messages_Message_descriptor;
      }

      public com.rainway.sachiel.messages.MessageProto.Message getDefaultInstanceForType() {
        return com.rainway.sachiel.messages.MessageProto.Message.getDefaultInstance();
      }

      public com.rainway.sachiel.messages.MessageProto.Message build() {
        com.rainway.sachiel.messages.MessageProto.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.rainway.sachiel.messages.MessageProto.Message buildPartial() {
        com.rainway.sachiel.messages.MessageProto.Message result = new com.rainway.sachiel.messages.MessageProto.Message(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (headerBuilder_ == null) {
          result.header_ = header_;
        } else {
          result.header_ = headerBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.rainway.sachiel.messages.MessageProto.Message) {
          return mergeFrom((com.rainway.sachiel.messages.MessageProto.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.rainway.sachiel.messages.MessageProto.Message other) {
        if (other == com.rainway.sachiel.messages.MessageProto.Message.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHeader()) {
          return false;
        }
        if (!getHeader().isInitialized()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.rainway.sachiel.messages.MessageProto.Message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.rainway.sachiel.messages.MessageProto.Message) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.rainway.sachiel.messages.HeaderProto.Header header_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.rainway.sachiel.messages.HeaderProto.Header, com.rainway.sachiel.messages.HeaderProto.Header.Builder, com.rainway.sachiel.messages.HeaderProto.HeaderOrBuilder> headerBuilder_;
      /**
       * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
       */
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
       */
      public com.rainway.sachiel.messages.HeaderProto.Header getHeader() {
        if (headerBuilder_ == null) {
          return header_ == null ? com.rainway.sachiel.messages.HeaderProto.Header.getDefaultInstance() : header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      /**
       * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
       */
      public Builder setHeader(com.rainway.sachiel.messages.HeaderProto.Header value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
       */
      public Builder setHeader(
          com.rainway.sachiel.messages.HeaderProto.Header.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
       */
      public Builder mergeHeader(com.rainway.sachiel.messages.HeaderProto.Header value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              header_ != null &&
              header_ != com.rainway.sachiel.messages.HeaderProto.Header.getDefaultInstance()) {
            header_ =
              com.rainway.sachiel.messages.HeaderProto.Header.newBuilder(header_).mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = null;
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
       */
      public com.rainway.sachiel.messages.HeaderProto.Header.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
       */
      public com.rainway.sachiel.messages.HeaderProto.HeaderOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_ == null ?
              com.rainway.sachiel.messages.HeaderProto.Header.getDefaultInstance() : header_;
        }
      }
      /**
       * <code>required .com.rainway.sachiel.messages.Header header = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.rainway.sachiel.messages.HeaderProto.Header, com.rainway.sachiel.messages.HeaderProto.Header.Builder, com.rainway.sachiel.messages.HeaderProto.HeaderOrBuilder> 
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.rainway.sachiel.messages.HeaderProto.Header, com.rainway.sachiel.messages.HeaderProto.Header.Builder, com.rainway.sachiel.messages.HeaderProto.HeaderOrBuilder>(
                  getHeader(),
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.rainway.sachiel.messages.Message)
    }

    // @@protoc_insertion_point(class_scope:com.rainway.sachiel.messages.Message)
    private static final com.rainway.sachiel.messages.MessageProto.Message DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.rainway.sachiel.messages.MessageProto.Message();
    }

    public static com.rainway.sachiel.messages.MessageProto.Message getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Message>
        PARSER = new com.google.protobuf.AbstractParser<Message>() {
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Message(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Message> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    public com.rainway.sachiel.messages.MessageProto.Message getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rainway_sachiel_messages_Message_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rainway_sachiel_messages_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\022\034com.rainway.sachiel.mes" +
      "sages\032\014header.proto\"?\n\007Message\0224\n\006header" +
      "\030\001 \002(\0132$.com.rainway.sachiel.messages.He" +
      "aderB,\n\034com.rainway.sachiel.messagesB\014Me" +
      "ssageProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.rainway.sachiel.messages.HeaderProto.getDescriptor(),
        }, assigner);
    internal_static_com_rainway_sachiel_messages_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_rainway_sachiel_messages_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rainway_sachiel_messages_Message_descriptor,
        new java.lang.String[] { "Header", });
    com.rainway.sachiel.messages.HeaderProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}