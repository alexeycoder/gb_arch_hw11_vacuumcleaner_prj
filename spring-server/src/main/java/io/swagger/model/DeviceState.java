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
 * DeviceState
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-27T16:36:05.325149630Z[GMT]")


public class DeviceState   {
  @JsonProperty("chargeLevel")

  private Object chargeLevel = null;

  @JsonProperty("isCharging")

  private Object isCharging = null;

  @JsonProperty("batteryHealth")

  private Object batteryHealth = null;

  @JsonProperty("currentServiceId")

  private Object currentServiceId = null;

  @JsonProperty("currentServicePropertiesCode")

  private Object currentServicePropertiesCode = null;

  @JsonProperty("connectionUrl")

  private Object connectionUrl = null;


  public DeviceState chargeLevel(Object chargeLevel) { 

    this.chargeLevel = chargeLevel;
    return this;
  }

  /**
   * Get chargeLevel
   * @return chargeLevel
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getChargeLevel() {  
    return chargeLevel;
  }



  public void setChargeLevel(Object chargeLevel) { 

    this.chargeLevel = chargeLevel;
  }

  public DeviceState isCharging(Object isCharging) { 

    this.isCharging = isCharging;
    return this;
  }

  /**
   * Get isCharging
   * @return isCharging
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getIsCharging() {  
    return isCharging;
  }



  public void setIsCharging(Object isCharging) { 

    this.isCharging = isCharging;
  }

  public DeviceState batteryHealth(Object batteryHealth) { 

    this.batteryHealth = batteryHealth;
    return this;
  }

  /**
   * Get batteryHealth
   * @return batteryHealth
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getBatteryHealth() {  
    return batteryHealth;
  }



  public void setBatteryHealth(Object batteryHealth) { 

    this.batteryHealth = batteryHealth;
  }

  public DeviceState currentServiceId(Object currentServiceId) { 

    this.currentServiceId = currentServiceId;
    return this;
  }

  /**
   * Get currentServiceId
   * @return currentServiceId
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getCurrentServiceId() {  
    return currentServiceId;
  }



  public void setCurrentServiceId(Object currentServiceId) { 

    this.currentServiceId = currentServiceId;
  }

  public DeviceState currentServicePropertiesCode(Object currentServicePropertiesCode) { 

    this.currentServicePropertiesCode = currentServicePropertiesCode;
    return this;
  }

  /**
   * Get currentServicePropertiesCode
   * @return currentServicePropertiesCode
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getCurrentServicePropertiesCode() {  
    return currentServicePropertiesCode;
  }



  public void setCurrentServicePropertiesCode(Object currentServicePropertiesCode) { 

    this.currentServicePropertiesCode = currentServicePropertiesCode;
  }

  public DeviceState connectionUrl(Object connectionUrl) { 

    this.connectionUrl = connectionUrl;
    return this;
  }

  /**
   * Get connectionUrl
   * @return connectionUrl
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Object getConnectionUrl() {  
    return connectionUrl;
  }



  public void setConnectionUrl(Object connectionUrl) { 

    this.connectionUrl = connectionUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceState deviceState = (DeviceState) o;
    return Objects.equals(this.chargeLevel, deviceState.chargeLevel) &&
        Objects.equals(this.isCharging, deviceState.isCharging) &&
        Objects.equals(this.batteryHealth, deviceState.batteryHealth) &&
        Objects.equals(this.currentServiceId, deviceState.currentServiceId) &&
        Objects.equals(this.currentServicePropertiesCode, deviceState.currentServicePropertiesCode) &&
        Objects.equals(this.connectionUrl, deviceState.connectionUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeLevel, isCharging, batteryHealth, currentServiceId, currentServicePropertiesCode, connectionUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceState {\n");
    
    sb.append("    chargeLevel: ").append(toIndentedString(chargeLevel)).append("\n");
    sb.append("    isCharging: ").append(toIndentedString(isCharging)).append("\n");
    sb.append("    batteryHealth: ").append(toIndentedString(batteryHealth)).append("\n");
    sb.append("    currentServiceId: ").append(toIndentedString(currentServiceId)).append("\n");
    sb.append("    currentServicePropertiesCode: ").append(toIndentedString(currentServicePropertiesCode)).append("\n");
    sb.append("    connectionUrl: ").append(toIndentedString(connectionUrl)).append("\n");
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
