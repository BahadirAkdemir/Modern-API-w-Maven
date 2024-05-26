/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.demo.api;

import com.example.demo.model.Product;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.6.0")
@Validated
@Tag(name = "product", description = "Operations about products")
public interface ProductApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api/v1/products/{id} : Returns a product
     * Returns the product that matches the given product ID
     *
     * @param id Product Identifier (required)
     * @return For successful fetch. (status code 200)
     */
    @Operation(
        operationId = "getProduct",
        summary = "Returns a product",
        description = "Returns the product that matches the given product ID",
        tags = { "product" },
        responses = {
            @ApiResponse(responseCode = "200", description = "For successful fetch.", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Product.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/products/{id}",
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<Product> getProduct(
        @Parameter(name = "id", description = "Product Identifier", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"price\" : \"\", \"imageUrl\" : \"imageUrl\", \"name\" : \"name\", \"count\" : 0, \"description\" : \"description\", \"id\" : \"id\", \"tag\" : [ { \"name\" : \"name\", \"id\" : \"id\" }, { \"name\" : \"name\", \"id\" : \"id\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> <id>aeiou</id> <name>aeiou</name> <description>aeiou</description> <imageUrl>aeiou</imageUrl> <price>UNDEFINED_EXAMPLE_VALUE</price> <count>123</count> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/products : Returns all the matched products
     * Returns the products that matches the given query criteria
     *
     * @param tag Product tag (optional)
     * @param name Product name (optional)
     * @param page Query page number (optional, default to 1)
     * @param size Query page size (optional, default to 10)
     * @return For successful fetch. (status code 200)
     */
    @Operation(
        operationId = "queryProducts",
        summary = "Returns all the matched products",
        description = "Returns the products that matches the given query criteria",
        tags = { "product" },
        responses = {
            @ApiResponse(responseCode = "200", description = "For successful fetch.", content = {
                @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Product.class))),
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Product.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/products",
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<List<Product>> queryProducts(
        @Parameter(name = "tag", description = "Product tag", in = ParameterIn.QUERY) @Valid @RequestParam(value = "tag", required = false) String tag,
        @Parameter(name = "name", description = "Product name", in = ParameterIn.QUERY) @Valid @RequestParam(value = "name", required = false) String name,
        @Parameter(name = "page", description = "Query page number", in = ParameterIn.QUERY) @Valid @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
        @Parameter(name = "size", description = "Query page size", in = ParameterIn.QUERY) @Valid @RequestParam(value = "size", required = false, defaultValue = "10") Integer size
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"price\" : \"\", \"imageUrl\" : \"imageUrl\", \"name\" : \"name\", \"count\" : 0, \"description\" : \"description\", \"id\" : \"id\", \"tag\" : [ { \"name\" : \"name\", \"id\" : \"id\" }, { \"name\" : \"name\", \"id\" : \"id\" } ] }, { \"price\" : \"\", \"imageUrl\" : \"imageUrl\", \"name\" : \"name\", \"count\" : 0, \"description\" : \"description\", \"id\" : \"id\", \"tag\" : [ { \"name\" : \"name\", \"id\" : \"id\" }, { \"name\" : \"name\", \"id\" : \"id\" } ] } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> <id>aeiou</id> <name>aeiou</name> <description>aeiou</description> <imageUrl>aeiou</imageUrl> <price>UNDEFINED_EXAMPLE_VALUE</price> <count>123</count> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}