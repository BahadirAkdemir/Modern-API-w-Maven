package com.example.demo.service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepository;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter04 - Modern API Development with Spring and Spring Boot Ed 2
 **/
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

  private final ProductRepository repository;

  public ProductServiceImpl(ProductRepository repository) {
    this.repository = repository;
  }

  @Override
  public Iterable<ProductEntity> getAllProducts() {
    return repository.findAll();
  }

  @Override
  public Optional<ProductEntity> getProduct(String id) {
    return repository
        .findById(UUID.fromString(id));
  }
}
