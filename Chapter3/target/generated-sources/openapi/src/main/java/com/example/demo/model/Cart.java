package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.model.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Shopping Cart of the user
 */

@Schema(name = "Cart", description = "Shopping Cart of the user")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-23T16:28:53.596787+03:00[Europe/Istanbul]", comments = "Generator version: 7.6.0")
public class Cart {

  private String customerId;

  @Valid
  private List<@Valid Item> items = new ArrayList<>();

  public Cart customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Id of the customer who possesses the cart
   * @return customerId
  */
  
  @Schema(name = "customerId", description = "Id of the customer who possesses the cart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Cart items(List<@Valid Item> items) {
    this.items = items;
    return this;
  }

  public Cart addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Collection of items in cart.
   * @return items
  */
  @Valid 
  @Schema(name = "items", description = "Collection of items in cart.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Cart cart = (Cart) o;
    return Objects.equals(this.customerId, cart.customerId) &&
        Objects.equals(this.items, cart.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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

