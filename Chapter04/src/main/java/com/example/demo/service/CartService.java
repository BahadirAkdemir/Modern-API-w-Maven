package com.example.demo.service;

import com.example.demo.entity.CartEntity;
import com.example.demo.model.Item;
import jakarta.validation.Valid;
import java.util.List;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter04 - Modern API Development with Spring and Spring Boot Ed 2
 **/
public interface CartService {

  List<Item> addCartItemsByCustomerId(String customerId, @Valid Item item);

  List<Item> addOrReplaceItemsByCustomerId(String customerId, @Valid Item item);

  void deleteCart(String customerId);

  void deleteItemFromCart(String customerId, String itemId);

  CartEntity getCartByCustomerId(String customerId);

  List<Item> getCartItemsByCustomerId(String customerId);

  Item getCartItemsByItemId(String customerId, String itemId);
}