package com.example.emsidemospringang.repository;

import com.example.emsidemospringang.entities.Payment;
import com.example.emsidemospringang.entities.PaymentStatus;
import com.example.emsidemospringang.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
 List<Payment> findByStudentCode(String code);
 List<Payment> findByStatus(PaymentStatus status);
 List<Payment> findByType(PaymentType type);
}
