package com.example.emsidemospringang.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity @NoArgsConstructor  @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Student {
    @Id
    private String id;
    private String fistName;
    private String lastName;
    @Column(unique = true)
    private String code;
    private String programId;
    private String photo;

}
