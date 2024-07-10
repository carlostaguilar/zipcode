package com.rgr.zipcode.repository;


import com.rgr.zipcode.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}