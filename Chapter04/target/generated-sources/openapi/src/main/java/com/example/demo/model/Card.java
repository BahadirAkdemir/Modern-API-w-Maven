package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Card
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0")
public class Card extends RepresentationModel<Card>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String cardNumber;

  private String expires;

  private String cvv;

  private String userId;

  public Card id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Order identifier
   * @return id
  */
  
  @Schema(name = "id", description = "Order identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Card cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Card Number
   * @return cardNumber
  */
  
  @Schema(name = "cardNumber", description = "Card Number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardNumber")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public Card expires(String expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Expiration date
   * @return expires
  */
  
  @Schema(name = "expires", description = "Expiration date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires")
  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public Card cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }

  /**
   * CVV code
   * @return cvv
  */
  
  @Schema(name = "cvv", description = "CVV code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cvv")
  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  public Card userId(String userId) {
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
    Card card = (Card) o;
    return Objects.equals(this.id, card.id) &&
        Objects.equals(this.cardNumber, card.cardNumber) &&
        Objects.equals(this.expires, card.expires) &&
        Objects.equals(this.cvv, card.cvv) &&
        Objects.equals(this.userId, card.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cardNumber, expires, cvv, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
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

