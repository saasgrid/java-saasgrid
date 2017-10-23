/*
 * Saasgrids CRM grid
 * Saasgrids CRM grid
 *
 * OpenAPI spec version: 1.0.0
 * Contact: hello@saasgrids.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package saasgrids;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import saasgrids.Customfield;

/**
 * Note
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T10:40:37.504+05:30")
public class Note {
  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("targetable_id")
  private String targetableId = null;

  @SerializedName("targetable_type")
  private String targetableType = null;

  @SerializedName("custom_fields")
  private List<Customfield> customFields = null;

  public Note id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Note description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Note targetableId(String targetableId) {
    this.targetableId = targetableId;
    return this;
  }

   /**
   * Get targetableId
   * @return targetableId
  **/
  @ApiModelProperty(value = "")
  public String getTargetableId() {
    return targetableId;
  }

  public void setTargetableId(String targetableId) {
    this.targetableId = targetableId;
  }

  public Note targetableType(String targetableType) {
    this.targetableType = targetableType;
    return this;
  }

   /**
   * Get targetableType
   * @return targetableType
  **/
  @ApiModelProperty(value = "")
  public String getTargetableType() {
    return targetableType;
  }

  public void setTargetableType(String targetableType) {
    this.targetableType = targetableType;
  }

  public Note customFields(List<Customfield> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Note addCustomFieldsItem(Customfield customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<Customfield>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
  public List<Customfield> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<Customfield> customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.id, note.id) &&
        Objects.equals(this.description, note.description) &&
        Objects.equals(this.targetableId, note.targetableId) &&
        Objects.equals(this.targetableType, note.targetableType) &&
        Objects.equals(this.customFields, note.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, targetableId, targetableType, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    targetableId: ").append(toIndentedString(targetableId)).append("\n");
    sb.append("    targetableType: ").append(toIndentedString(targetableType)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
