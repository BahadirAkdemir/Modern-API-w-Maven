/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.demo.api;

import com.example.demo.model.Shipment;
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
@Tag(name = "shipment", description = "Operations about shippings")
public interface ShipmentApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api/v1/shipping : Return the Shipment
     * Return the Shipment for the specified order
     *
     * @param id Order Identifier (required)
     * @return For successful fetch. (status code 200)
     */
    @Operation(
        operationId = "getShipmentByOrderId",
        summary = "Return the Shipment",
        description = "Return the Shipment for the specified order",
        tags = { "shipment" },
        responses = {
            @ApiResponse(responseCode = "200", description = "For successful fetch.", content = {
                @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Shipment.class))),
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Shipment.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/shipping",
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<List<Shipment>> getShipmentByOrderId(
        @Parameter(name = "id", description = "Order Identifier", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"carrier\" : \"carrier\", \"estDeliveryDate\" : \"2000-01-23\", \"id\" : \"id\", \"trackingNumber\" : \"trackingNumber\" }, { \"carrier\" : \"carrier\", \"estDeliveryDate\" : \"2000-01-23\", \"id\" : \"id\", \"trackingNumber\" : \"trackingNumber\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Shipment> <id>aeiou</id> <carrier>aeiou</carrier> <trackingNumber>aeiou</trackingNumber> <estDeliveryDate>2000-01-23</estDeliveryDate> </Shipment>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
