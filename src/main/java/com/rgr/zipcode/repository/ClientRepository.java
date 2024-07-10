package com.rgr.zipcode.repository;

import com.rgr.zipcode.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}