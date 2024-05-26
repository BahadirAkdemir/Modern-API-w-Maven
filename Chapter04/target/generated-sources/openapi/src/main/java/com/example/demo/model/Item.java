package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
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
 * Items in shopping cart
 */

@Schema(name = "Item", description = "Items in shopping cart")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0")
public class Item extends RepresentationModel<Item>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private Integer quantity;

  private BigDecimal unitPrice = null;

  public Item id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Item Identifier
   * @return id
  */
  
  @Schema(name = "id", description = "Item Identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Item quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The item quantity
   * @return quantity
  */
  
  @Schema(name = "quantity", description = "The item quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Item unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * The item's price per unit
   * @return unitPrice
  */
  @Valid 
  @Schema(name = "unitPrice", description = "The item's price per unit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unitPrice")
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.id, item.id) &&
        Objects.equals(this.quantity, item.quantity) &&
        Objects.equals(this.unitPrice, item.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, unitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

