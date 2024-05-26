package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.hateoas.RepresentationModel;

import java.util.*;
import jakarta.annotation.Generated;

/**
 * Shipment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0")
public class Shipment extends RepresentationModel<Shipment>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String carrier;

  private String trackingNumber;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate estDeliveryDate;

  public Shipment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Shipment Identifier
   * @return id
  */
  
  @Schema(name = "id", description = "Shipment Identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Shipment carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Shipping Carrier
   * @return carrier
  */
  
  @Schema(name = "carrier", description = "Shipping Carrier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public Shipment trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

  /**
   * Shipping Tracking Number
   * @return trackingNumber
  */
  
  @Schema(name = "trackingNumber", description = "Shipping Tracking Number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trackingNumber")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public Shipment estDeliveryDate(LocalDate estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
    return this;
  }

  /**
   * Estimated Delivery Date
   * @return estDeliveryDate
  */
  @Valid 
  @Schema(name = "estDeliveryDate", description = "Estimated Delivery Date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estDeliveryDate")
  public LocalDate getEstDeliveryDate() {
    return estDeliveryDate;
  }

  public void setEstDeliveryDate(LocalDate estDeliveryDate) {
    this.estDeliveryDate = estDeliveryDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.id, shipment.id) &&
        Objects.equals(this.carrier, shipment.carrier) &&
        Objects.equals(this.trackingNumber, shipment.trackingNumber) &&
        Objects.equals(this.estDeliveryDate, shipment.estDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, carrier, trackingNumber, estDeliveryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    estDeliveryDate: ").append(toIndentedString(estDeliveryDate)).append("\n");
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

