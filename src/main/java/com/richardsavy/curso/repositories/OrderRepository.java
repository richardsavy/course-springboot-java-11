package com.richardsavy.curso.repositories;

import com.richardsavy.curso.entities.Order;
import com.richardsavy.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {


}
