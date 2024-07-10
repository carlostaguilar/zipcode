package com.rgr.zipcode.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "zipcodeClient", url = "https://api.brasilaberto.com/v1/zipcode")
public interface ZipcodeClient {

    @GetMapping("/{cep}")
    ZipcodeResponse getAddressByZipcode(@PathVariable("cep") String cep);

}