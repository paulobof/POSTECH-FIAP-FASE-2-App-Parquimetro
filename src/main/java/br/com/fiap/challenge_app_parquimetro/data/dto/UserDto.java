package br.com.fiap.challenge_app_parquimetro.data.dto;

import br.com.fiap.challenge_app_parquimetro.data.entity.TransactionEntity;
import br.com.fiap.challenge_app_parquimetro.data.entity.VehicleEntity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @Id
    Long userCode;

    String name;

    String address;

    String email;

    String password;

    BigDecimal balance;

    List<VehicleEntity> vehicles;

    List<TransactionEntity> transactions;

}
