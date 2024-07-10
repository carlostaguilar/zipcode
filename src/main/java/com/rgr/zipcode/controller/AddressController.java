package com.rgr.zipcode.controller;

import com.rgr.zipcode.model.Address;
import com.rgr.zipcode.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable int id) {
        return addressService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.save(address);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Address> updateAddress(@PathVariable int id, @RequestBody Address addressDetails) {
        return addressService.findById(id)
                .map(address -> {
                    address.setAddress(addressDetails.getAddress());
                    address.setNumber(addressDetails.getNumber());
                    address.setComplement(addressDetails.getComplement());
                    address.setPostalCode(addressDetails.getPostalCode());
                    address.setCity(addressDetails.getCity());
                    address.setState(addressDetails.getState());
                    address.setCountry(addressDetails.getCountry());
                    return ResponseEntity.ok(addressService.save(address));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable int id) {
        if (addressService.findById(id).isPresent()) {
            addressService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}