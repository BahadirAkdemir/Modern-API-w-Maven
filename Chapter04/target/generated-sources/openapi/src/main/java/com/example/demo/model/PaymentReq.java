package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.model.Address;
import com.example.demo.model.Card;
import com.example.demo.model.CustomerInfoOnCard;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
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
 * Contains the payment request information
 */

@Schema(name = "PaymentReq", description = "Contains the payment request information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0")
public class PaymentReq extends RepresentationModel<PaymentReq>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private String orderId;

  private CustomerInfoOnCard customer;

  private Address address;

  private Card card;

  private BigDecimal amount = null;

  public PaymentReq orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Order Identifier
   * @return orderId
  */
  
  @Schema(name = "orderId", description = "Order Identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderId")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public PaymentReq customer(CustomerInfoOnCard customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @Valid 
  @Schema(name = "customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customer")
  public CustomerInfoOnCard getCustomer() {
    return customer;
  }

  public void setCustomer(CustomerInfoOnCard customer) {
    this.customer = customer;
  }

  public PaymentReq address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public PaymentReq card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  */
  @Valid 
  @Schema(name = "card", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("card")
  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public PaymentReq amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Payment amount
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", description = "Payment amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentReq paymentReq = (PaymentReq) o;
    return Objects.equals(this.orderId, paymentReq.orderId) &&
        Objects.equals(this.customer, paymentReq.customer) &&
        Objects.equals(this.address, paymentReq.address) &&
        Objects.equals(this.card, paymentReq.card) &&
        Objects.equals(this.amount, paymentReq.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, customer, address, card, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentReq {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

