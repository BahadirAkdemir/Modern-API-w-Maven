package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.model.Tag;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
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
 * Product information
 */

@Schema(name = "Product", description = "Product information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0")
public class Product extends RepresentationModel<Product>  implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String name;

  private String description;

  private String imageUrl;

  private BigDecimal price = null;

  private Integer count;

  @Valid
  private List<@Valid Tag> tag = new ArrayList<>();

  public Product id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Product identifier
   * @return id
  */
  
  @Schema(name = "id", description = "Product identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Product Name
   * @return name
  */
  
  @Schema(name = "name", description = "Product Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Prodcut's description
   * @return description
  */
  
  @Schema(name = "description", description = "Prodcut's description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Product image's URL
   * @return imageUrl
  */
  
  @Schema(name = "imageUrl", description = "Product image's URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public Product price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Product price
   * @return price
  */
  @Valid 
  @Schema(name = "price", description = "Product price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Product count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Product count
   * @return count
  */
  
  @Schema(name = "count", description = "Product count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Product tag(List<@Valid Tag> tag) {
    this.tag = tag;
    return this;
  }

  public Product addTagItem(Tag tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<>();
    }
    this.tag.add(tagItem);
    return this;
  }

  /**
   * Tags associated with the product
   * @return tag
  */
  @Valid 
  @Schema(name = "tag", description = "Tags associated with the product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag")
  public List<@Valid Tag> getTag() {
    return tag;
  }

  public void setTag(List<@Valid Tag> tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.imageUrl, product.imageUrl) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.count, product.count) &&
        Objects.equals(this.tag, product.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, imageUrl, price, count, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

