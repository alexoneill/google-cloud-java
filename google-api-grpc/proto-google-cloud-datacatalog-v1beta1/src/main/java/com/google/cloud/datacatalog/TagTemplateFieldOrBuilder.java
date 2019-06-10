// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/tags.proto

package com.google.cloud.datacatalog;

public interface TagTemplateFieldOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.TagTemplateField)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The display name for this field. Default value is an empty
   * string.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. The display name for this field. Default value is an empty
   * string.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.FieldType type = 2;</code>
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.FieldType type = 2;</code>
   */
  com.google.cloud.datacatalog.FieldType getType();
  /**
   *
   *
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.FieldType type = 2;</code>
   */
  com.google.cloud.datacatalog.FieldTypeOrBuilder getTypeOrBuilder();
}
