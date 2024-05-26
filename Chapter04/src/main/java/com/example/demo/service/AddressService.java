package com.example.demo.service;

import com.example.demo.entity.AddressEntity;
import com.example.demo.model.AddAddressReq;
import java.util.Optional;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter04 - Modern API Development with Spring and Spring Boot Ed 2
 */
public interface AddressService {
  Optional<AddressEntity> createAddress(AddAddressReq addAddressReq);

  void deleteAddressesById(String id);

  Optional<AddressEntity> getAddressesById(String id);

  Iterable<AddressEntity> getAllAddresses();
}
