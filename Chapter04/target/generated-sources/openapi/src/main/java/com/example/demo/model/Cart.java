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
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.hateoas.RepresentationModel;

import java.util.*;
import jakarta.annotation.Generated;

/**
 * Shopping Cart of the user
 */

@Schema(name = "Cart", description = "Shopping Cart of the user")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0")
public class Cart extends RepresentationModel<Cart>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String customerId;

  @Valid
  private List<@Valid Item> items = new ArrayList<>();

  public Cart id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Cart Identifier
   * @return id
  */
  
  @Schema(name = "id", description = "Cart Identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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
    return Objects.equals(this.id, cart.id) &&
        Objects.equals(this.customerId, cart.customerId) &&
        Objects.equals(this.items, cart.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

