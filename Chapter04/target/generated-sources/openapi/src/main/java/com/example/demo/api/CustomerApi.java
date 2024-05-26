/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.demo.api;

import com.example.demo.model.Address;
import com.example.demo.model.Card;
import com.example.demo.model.User;
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
@Tag(name = "customer", description = "Operations about user's persona customer")
public interface CustomerApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /api/v1/customers/{id} : Deletes the customer
     * Deletes the customer identifiable by given ID
     *
     * @param id Customer Identifier (required)
     * @return Request accepted, returns this status even if user does not exist (status code 202)
     */
    @Operation(
        operationId = "deleteCustomerById",
        summary = "Deletes the customer",
        description = "Deletes the customer identifiable by given ID",
        tags = { "customer" },
        responses = {
            @ApiResponse(responseCode = "202", description = "Request accepted, returns this status even if user does not exist")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/customers/{id}"
    )
    
    default ResponseEntity<Void> deleteCustomerById(
        @Parameter(name = "id", description = "Customer Identifier", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/customers/{id}/addresses : Returns all customer&#39;s addresses
     * Returns all customer&#39;s addresses based on given customer ID
     *
     * @param id Customer Identifier (required)
     * @return For successful fetch. (status code 200)
     */
    @Operation(
        operationId = "getAddressesByCustomerId",
        summary = "Returns all customer's addresses",
        description = "Returns all customer's addresses based on given customer ID",
        tags = { "customer" },
        responses = {
            @ApiResponse(responseCode = "200", description = "For successful fetch.", content = {
                @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Address.class))),
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Address.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/customers/{id}/addresses",
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<List<Address>> getAddressesByCustomerId(
        @Parameter(name = "id", description = "Customer Identifier", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"residency\" : \"residency\", \"number\" : \"number\", \"country\" : \"country\", \"pincode\" : \"pincode\", \"city\" : \"city\", \"street\" : \"street\", \"id\" : \"id\", \"state\" : \"state\" }, { \"residency\" : \"residency\", \"number\" : \"number\", \"country\" : \"country\", \"pincode\" : \"pincode\", \"city\" : \"city\", \"street\" : \"street\", \"id\" : \"id\", \"state\" : \"state\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Address> <id>aeiou</id> <number>aeiou</number> <residency>aeiou</residency> <street>aeiou</street> <city>aeiou</city> <state>aeiou</state> <country>aeiou</country> <pincode>aeiou</pincode> </Address>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/customers : Returns all customers
     * Returns all customers, or empty collection if no use found
     *
     * @return For successful fetch. (status code 200)
     */
    @Operation(
        operationId = "getAllCustomers",
        summary = "Returns all customers",
        description = "Returns all customers, or empty collection if no use found",
        tags = { "customer" },
        responses = {
            @ApiResponse(responseCode = "200", description = "For successful fetch.", content = {
                @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = User.class))),
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = User.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/customers",
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<List<User>> getAllCustomers(
        
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"userStatus\" : \"userStatus\", \"phone\" : \"phone\", \"id\" : \"id\", \"email\" : \"email\", \"username\" : \"username\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"userStatus\" : \"userStatus\", \"phone\" : \"phone\", \"id\" : \"id\", \"email\" : \"email\", \"username\" : \"username\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<User> <id>aeiou</id> <username>aeiou</username> <firstName>aeiou</firstName> <lastName>aeiou</lastName> <email>aeiou</email> <password>aeiou</password> <phone>aeiou</phone> <userStatus>aeiou</userStatus> </User>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/customers/{id}/cards : Returns all customer&#39;s cards
     * Returns all customer&#39;s cards based on given customer ID
     *
     * @param id Customer Identifier (required)
     * @return For successful fetch. (status code 200)
     */
    @Operation(
        operationId = "getCardByCustomerId",
        summary = "Returns all customer's cards",
        description = "Returns all customer's cards based on given customer ID",
        tags = { "customer" },
        responses = {
            @ApiResponse(responseCode = "200", description = "For successful fetch.", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Card.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Card.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/customers/{id}/cards",
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<Card> getCardByCustomerId(
        @Parameter(name = "id", description = "Customer Identifier", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"expires\" : \"expires\", \"cvv\" : \"cvv\", \"id\" : \"id\", \"userId\" : \"userId\", \"cardNumber\" : \"cardNumber\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Card> <id>aeiou</id> <cardNumber>aeiou</cardNumber> <expires>aeiou</expires> <cvv>aeiou</cvv> <userId>aeiou</userId> </Card>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/customers/{id} : Returns a customer
     * Returns a customers identifiable by given ID
     *
     * @param id Customer Identifier (required)
     * @return For successful fetch. (status code 200)
     */
    @Operation(
        operationId = "getCustomerById",
        summary = "Returns a customer",
        description = "Returns a customers identifiable by given ID",
        tags = { "customer" },
        responses = {
            @ApiResponse(responseCode = "200", description = "For successful fetch.", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/customers/{id}",
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<User> getCustomerById(
        @Parameter(name = "id", description = "Customer Identifier", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"password\" : \"password\", \"userStatus\" : \"userStatus\", \"phone\" : \"phone\", \"id\" : \"id\", \"email\" : \"email\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<User> <id>aeiou</id> <username>aeiou</username> <firstName>aeiou</firstName> <lastName>aeiou</lastName> <email>aeiou</email> <password>aeiou</password> <phone>aeiou</phone> <userStatus>aeiou</userStatus> </User>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}