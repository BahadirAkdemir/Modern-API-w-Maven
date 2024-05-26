package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.model.Address;
import com.example.demo.model.Card;
import com.example.demo.model.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Contains the new order request information
 */

@Schema(name = "NewOrder", description = "Contains the new order request information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0")
public class NewOrder extends RepresentationModel<NewOrder>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private String customerId;

  private Address address;

  private Card card;

  @Valid
  private List<@Valid Item> items = new ArrayList<>();

  public NewOrder customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  
  @Schema(name = "customerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public NewOrder address(Address address) {
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

  public NewOrder card(Card card) {
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

  public NewOrder items(List<@Valid Item> items) {
    this.items = items;
    return this;
  }

  public NewOrder addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Items in shopping cart
   * @return items
  */
  @Valid 
  @Schema(name = "items", description = "Items in shopping cart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid Item> getItems() {
    return items;
  }

  public void setItems(List<@Valid Item> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewOrder newOrder = (NewOrder) o;
    return Objects.equals(this.customerId, newOrder.customerId) &&
        Objects.equals(this.address, newOrder.address) &&
        Objects.equals(this.card, newOrder.card) &&
        Objects.equals(this.items, newOrder.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, address, card, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOrder {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

