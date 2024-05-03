package com.example.emsidemospringang;

import com.example.emsidemospringang.entities.Payment;
import com.example.emsidemospringang.entities.PaymentStatus;
import com.example.emsidemospringang.entities.PaymentType;
import com.example.emsidemospringang.entities.Student;
import com.example.emsidemospringang.repository.PaymentRepository;
import com.example.emsidemospringang.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class EmsiDemoSpringAngApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmsiDemoSpringAngApplication.class, args);
    }
@Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository,
PaymentRepository paymentRepository){
     return args -> {
         studentRepository.save(Student.builder().id(UUID.randomUUID().toString()).fistName("Mohamed").code("112233").programId("IIR").build());
         studentRepository.save(Student.builder().id(UUID.randomUUID().toString()).fistName("Meryem").code("112234").programId("IFA").build());
         studentRepository.save(Student.builder().id(UUID.randomUUID().toString()).fistName("Adnane").code("112235").programId("IFA").build());
         studentRepository.save(Student.builder().id(UUID.randomUUID().toString()).fistName("Yasmine").code("112236").programId("GC").build());
    PaymentType[] paymentTypes=PaymentType.values();
         Random random=new Random();
     studentRepository.findAll().forEach(st->{
         for(int i=0;i<10 ; i++){
             int index =random.nextInt(paymentTypes.length);
             Payment payment=Payment.builder()
                     .amount(1000+(int)(Math.random()*20000))
                     .type(paymentTypes[index])
                     .status(PaymentStatus.CREATED)
                     .date(LocalDate.now())
                     .student(st)
                     .build();
             paymentRepository.save(payment);
         }
     });
     };
}
}
