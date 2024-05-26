package com.example.demo.repository;

import com.example.demo.entity.OrderEntity;
import com.example.demo.model.NewOrder;
import java.util.Optional;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter04 - Modern API Development with Spring and Spring Boot Ed 2
 **/
public interface OrderRepositoryExt {
  Optional<OrderEntity> insert(NewOrder m);
}

