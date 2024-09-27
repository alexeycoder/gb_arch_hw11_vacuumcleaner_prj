package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Group
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-27T16:36:05.325149630Z[GMT]")


public class Group   {
  @JsonProperty("groupId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object groupId = null;

  @JsonProperty("name")

  private Object name = null;

  @JsonProperty("members")

  private Object members = null;


  public Group groupId(Object groupId) { 

    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
   **/
  
  @Schema(description = "")
  
  public Object getGroupId() {  
    return groupId;
  }



  public void setGroupId(Object groupId) { 
    this.groupId = groupId;
  }

  public Group name(Object name) { 

    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getName() {  
    return name;
  }



  public void setName(Object name) { 

    this.name = name;
  }

  public Group members(Object members) { 

    this.members = members;
    return this;
  }

  /**
   * Get members
   * @return members
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getMembers() {  
    return members;
  }



  public void setMembers(Object members) { 

    this.members = members;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.groupId, group.groupId) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.members, group.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, name, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
