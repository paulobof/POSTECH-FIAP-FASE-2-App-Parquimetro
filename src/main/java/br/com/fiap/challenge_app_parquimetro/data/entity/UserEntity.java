package br.com.fiap.challenge_app_parquimetro.data.entity;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user")
public class UserEntity {

    @Id
    Long userCode;

    String name;

    String address;

    String email;

    String password;

    BigDecimal balance;

    @DBRef
    List<VehicleEntity> vehicles;

    @DBRef
    List<TransactionEntity> transactions;

}
