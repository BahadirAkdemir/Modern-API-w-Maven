package com.example.demo.controllers;

import com.example.demo.api.ApiApi;
import com.example.demo.hateoas.PaymentRepresentationModelAssembler;
import com.example.demo.model.Authorization;
import com.example.demo.model.PaymentReq;
import com.example.demo.service.PaymentService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter04 - Modern API Development with Spring and Spring Boot Ed 2
 **/
@RestController
public class PaymentController implements ApiApi {

  private final PaymentService service;
  private final PaymentRepresentationModelAssembler assembler;

  public PaymentController(PaymentService service, PaymentRepresentationModelAssembler assembler) {
    this.service = service;
    this.assembler = assembler;
  }

  @Override
  public ResponseEntity<Authorization> authorize(@Valid PaymentReq paymentReq) {
    return null;
  }

  @Override
  public ResponseEntity<List<Authorization>> getOrdersPaymentAuthorization(
      @NotNull @Valid String id) {
    return null;
  }
}
