package br.com.fiap.challenge_app_parquimetro.data.dto;

import br.com.fiap.challenge_app_parquimetro.data.entity.UserEntity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {

    @Id
    Long transactionCode;

    String description;

    LocalDateTime transactionDate;

    BigDecimal transactionAmount;

    List<UserEntity> users;
}
