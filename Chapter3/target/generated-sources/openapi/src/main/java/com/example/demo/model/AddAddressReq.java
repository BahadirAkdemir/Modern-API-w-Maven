package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AddAddressReq
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-23T16:28:53.596787+03:00[Europe/Istanbul]", comments = "Generator version: 7.6.0")
public class AddAddressReq {

  private String number;

  private String residency;

  private String street;

  private String city;

  private String state;

  private String country;

  private String pincode;

  private String userId;

  public AddAddressReq number(String number) {
    this.number = number;
    return this;
  }

  /**
   * house of flat number
   * @return number
  */
  
  @Schema(name = "number", description = "house of flat number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public AddAddressReq residency(String residency) {
    this.residency = residency;
    return this;
  }

  /**
   * Socieity or building name
   * @return residency
  */
  
  @Schema(name = "residency", description = "Socieity or building name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("residency")
  public String getResidency() {
    return residency;
  }

  public void setResidency(String residency) {
    this.residency = residency;
  }

  public AddAddressReq street(String street) {
    this.street = street;
    return this;
  }

  /**
   * street name
   * @return street
  */
  
  @Schema(name = "street", description = "street name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public AddAddressReq city(String city) {
    this.city = city;
    return this;
  }

  /**
   * city name
   * @return city
  */
  
  @Schema(name = "city", description = "city name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddAddressReq state(String state) {
    this.state = state;
    return this;
  }

  /**
   * state name
   * @return state
  */
  
  @Schema(name = "state", description = "state name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddAddressReq country(String country) {
    this.country = country;
    return this;
  }

  /**
   * country name
   * @return country
  */
  
  @Schema(name = "country", description = "country name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AddAddressReq pincode(String pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * postal code
   * @return pincode
  */
  
  @Schema(name = "pincode", description = "postal code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pincode")
  public String getPincode() {
    return pincode;
  }

  public void setPincode(String pincode) {
    this.pincode = pincode;
  }

  public AddAddressReq userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddAddressReq addAddressReq = (AddAddressReq) o;
    return Objects.equals(this.number, addAddressReq.number) &&
        Objects.equals(this.residency, addAddressReq.residency) &&
        Objects.equals(this.street, addAddressReq.street) &&
        Objects.equals(this.city, addAddressReq.city) &&
        Objects.equals(this.state, addAddressReq.state) &&
        Objects.equals(this.country, addAddressReq.country) &&
        Objects.equals(this.pincode, addAddressReq.pincode) &&
        Objects.equals(this.userId, addAddressReq.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, residency, street, city, state, country, pincode, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAddressReq {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    residency: ").append(toIndentedString(residency)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

