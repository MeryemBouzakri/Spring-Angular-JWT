package com.example.emsidemospringang.dtos;

import com.example.emsidemospringang.entities.PaymentStatus;
import com.example.emsidemospringang.entities.PaymentType;
import com.example.emsidemospringang.entities.Student;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;



@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder

public class PaymentDTO {
    private Long id;
    private LocalDate date;
    private double amount ;
    private PaymentType type;
    private PaymentStatus status;

}
