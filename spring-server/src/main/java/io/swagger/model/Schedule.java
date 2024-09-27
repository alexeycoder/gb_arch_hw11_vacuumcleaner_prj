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
 * Schedule
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-27T16:36:05.325149630Z[GMT]")


public class Schedule   {
  @JsonProperty("scheduleId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Object scheduleId = null;

  @JsonProperty("dayOfWeek")

  private Object dayOfWeek = null;

  @JsonProperty("timeOfDay")

  private Object timeOfDay = null;

  @JsonProperty("serviceTypeId")

  private Object serviceTypeId = null;

  @JsonProperty("servicePropertiesCode")

  private Object servicePropertiesCode = null;


  public Schedule scheduleId(Object scheduleId) { 

    this.scheduleId = scheduleId;
    return this;
  }

  /**
   * Get scheduleId
   * @return scheduleId
   **/
  
  @Schema(description = "")
  
  public Object getScheduleId() {  
    return scheduleId;
  }



  public void setScheduleId(Object scheduleId) { 
    this.scheduleId = scheduleId;
  }

  public Schedule dayOfWeek(Object dayOfWeek) { 

    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getDayOfWeek() {  
    return dayOfWeek;
  }



  public void setDayOfWeek(Object dayOfWeek) { 

    this.dayOfWeek = dayOfWeek;
  }

  public Schedule timeOfDay(Object timeOfDay) { 

    this.timeOfDay = timeOfDay;
    return this;
  }

  /**
   * Get timeOfDay
   * @return timeOfDay
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getTimeOfDay() {  
    return timeOfDay;
  }



  public void setTimeOfDay(Object timeOfDay) { 

    this.timeOfDay = timeOfDay;
  }

  public Schedule serviceTypeId(Object serviceTypeId) { 

    this.serviceTypeId = serviceTypeId;
    return this;
  }

  /**
   * Get serviceTypeId
   * @return serviceTypeId
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getServiceTypeId() {  
    return serviceTypeId;
  }



  public void setServiceTypeId(Object serviceTypeId) { 

    this.serviceTypeId = serviceTypeId;
  }

  public Schedule servicePropertiesCode(Object servicePropertiesCode) { 

    this.servicePropertiesCode = servicePropertiesCode;
    return this;
  }

  /**
   * Get servicePropertiesCode
   * @return servicePropertiesCode
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getServicePropertiesCode() {  
    return servicePropertiesCode;
  }



  public void setServicePropertiesCode(Object servicePropertiesCode) { 

    this.servicePropertiesCode = servicePropertiesCode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.scheduleId, schedule.scheduleId) &&
        Objects.equals(this.dayOfWeek, schedule.dayOfWeek) &&
        Objects.equals(this.timeOfDay, schedule.timeOfDay) &&
        Objects.equals(this.serviceTypeId, schedule.serviceTypeId) &&
        Objects.equals(this.servicePropertiesCode, schedule.servicePropertiesCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleId, dayOfWeek, timeOfDay, serviceTypeId, servicePropertiesCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
    sb.append("    serviceTypeId: ").append(toIndentedString(serviceTypeId)).append("\n");
    sb.append("    servicePropertiesCode: ").append(toIndentedString(servicePropertiesCode)).append("\n");
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
