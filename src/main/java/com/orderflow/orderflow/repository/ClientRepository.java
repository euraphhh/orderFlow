package com.orderflow.orderflow.repository;

import com.orderflow.orderflow.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ClientRepository extends JpaRepository<Client, Long> {

}
