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
 * User
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-27T16:36:05.325149630Z[GMT]")


public class User   {
  @JsonProperty("userId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object userId = null;

  @JsonProperty("username")

  private Object username = null;

  @JsonProperty("password")

  private Object password = null;

  @JsonProperty("name")

  private Object name = null;


  public User userId(Object userId) { 

    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  
  @Schema(description = "")
  
  public Object getUserId() {  
    return userId;
  }



  public void setUserId(Object userId) { 
    this.userId = userId;
  }

  public User username(Object username) { 

    this.username = username;
    return this;
  }

  /**
   * Адрес эл. почты пользователя в качестве имени для входа
   * @return username
   **/
  
  @Schema(required = true, description = "Адрес эл. почты пользователя в качестве имени для входа")
  
  @NotNull
  public Object getUsername() {  
    return username;
  }



  public void setUsername(Object username) { 

    this.username = username;
  }

  public User password(Object password) { 

    this.password = password;
    return this;
  }

  /**
   * Хэш пароля
   * @return password
   **/
  
  @Schema(required = true, description = "Хэш пароля")
  
  @NotNull
  public Object getPassword() {  
    return password;
  }



  public void setPassword(Object password) { 

    this.password = password;
  }

  public User name(Object name) { 

    this.name = name;
    return this;
  }

  /**
   * Отображаемое имя пользователя
   * @return name
   **/
  
  @Schema(required = true, description = "Отображаемое имя пользователя")
  
  @NotNull
  public Object getName() {  
    return name;
  }



  public void setName(Object name) { 

    this.name = name;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.userId, user.userId) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.name, user.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, username, password, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
