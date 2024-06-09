package br.com.fiap.challenge_app_parquimetro.data.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "transaction")
public class TransactionEntity {

    @Id
    Long transactionCode;

    String description;

    LocalDateTime transactionDate;

    BigDecimal transactionAmount;

    @DBRef
    List<UserEntity> users;
}
