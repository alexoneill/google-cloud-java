// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog;

public interface LookupEntryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.LookupEntryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full name of the Google Cloud Platform resource the Data Catalog
   * entry represents. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * Full names are case-sensitive.
   * Examples:
   * "//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId".
   * "//pubsub.googleapis.com/projects/projectId/topics/topicId"
   * </pre>
   *
   * <code>string linked_resource = 1;</code>
   */
  java.lang.String getLinkedResource();
  /**
   *
   *
   * <pre>
   * The full name of the Google Cloud Platform resource the Data Catalog
   * entry represents. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * Full names are case-sensitive.
   * Examples:
   * "//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId".
   * "//pubsub.googleapis.com/projects/projectId/topics/topicId"
   * </pre>
   *
   * <code>string linked_resource = 1;</code>
   */
  com.google.protobuf.ByteString getLinkedResourceBytes();

  /**
   *
   *
   * <pre>
   * The SQL name of the entry. SQL names are case-sensitive.
   * Examples:
   * &lt;ul&gt;
   *   &lt;li&gt;cloud_pubsub.project_id.topic_id&lt;/li&gt;
   *   &lt;li&gt;pubsub.project_id.`topic.id.with.dots`&lt;/li&gt;
   *   &lt;li&gt;bigquery.project_id.dataset_id.table_id&lt;/li&gt;
   *   &lt;li&gt;datacatalog.project_id.location_id.entry_group_id.entry_id&lt;/li&gt;
   * &lt;/ul&gt;
   * *_ids shoud satisfy the standard SQL rules for identifiers.
   * https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical
   * </pre>
   *
   * <code>string sql_resource = 3;</code>
   */
  java.lang.String getSqlResource();
  /**
   *
   *
   * <pre>
   * The SQL name of the entry. SQL names are case-sensitive.
   * Examples:
   * &lt;ul&gt;
   *   &lt;li&gt;cloud_pubsub.project_id.topic_id&lt;/li&gt;
   *   &lt;li&gt;pubsub.project_id.`topic.id.with.dots`&lt;/li&gt;
   *   &lt;li&gt;bigquery.project_id.dataset_id.table_id&lt;/li&gt;
   *   &lt;li&gt;datacatalog.project_id.location_id.entry_group_id.entry_id&lt;/li&gt;
   * &lt;/ul&gt;
   * *_ids shoud satisfy the standard SQL rules for identifiers.
   * https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical
   * </pre>
   *
   * <code>string sql_resource = 3;</code>
   */
  com.google.protobuf.ByteString getSqlResourceBytes();

  public com.google.cloud.datacatalog.LookupEntryRequest.TargetNameCase getTargetNameCase();
}
