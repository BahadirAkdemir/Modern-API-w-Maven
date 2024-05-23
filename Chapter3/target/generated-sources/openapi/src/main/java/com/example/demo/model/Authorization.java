package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Authorization
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-23T16:28:53.596787+03:00[Europe/Istanbul]", comments = "Generator version: 7.6.0")
public class Authorization {

  private String orderId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time;

  private Boolean authorized;

  private String message;

  private String error;

  public Authorization orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Order Identification
   * @return orderId
  */
  
  @Schema(name = "orderId", description = "Order Identification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderId")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Authorization time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Timestamp when this authorization was created
   * @return time
  */
  @Valid 
  @Schema(name = "time", description = "Timestamp when this authorization was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public Authorization authorized(Boolean authorized) {
    this.authorized = authorized;
    return this;
  }

  /**
   * Flat that specify whether the payment is authorized
   * @return authorized
  */
  
  @Schema(name = "authorized", description = "Flat that specify whether the payment is authorized", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorized")
  public Boolean getAuthorized() {
    return authorized;
  }

  public void setAuthorized(Boolean authorized) {
    this.authorized = authorized;
  }

  public Authorization message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Approavl or rejection message
   * @return message
  */
  
  @Schema(name = "message", description = "Approavl or rejection message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Authorization error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Processing error description, if any
   * @return error
  */
  
  @Schema(name = "error", description = "Processing error description, if any", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authorization authorization = (Authorization) o;
    return Objects.equals(this.orderId, authorization.orderId) &&
        Objects.equals(this.time, authorization.time) &&
        Objects.equals(this.authorized, authorization.authorized) &&
        Objects.equals(this.message, authorization.message) &&
        Objects.equals(this.error, authorization.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, time, authorized, message, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authorization {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

