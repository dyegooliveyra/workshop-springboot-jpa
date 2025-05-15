package com.educandoWeb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoWeb.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
