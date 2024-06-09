package br.com.fiap.challenge_app_parquimetro.data.dto;

import br.com.fiap.challenge_app_parquimetro.data.entity.UserEntity;
import br.com.fiap.challenge_app_parquimetro.data.entity.VehicleEntity;
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
public class TicketDto {

    @Id
    Long ticketCode;

    LocalDateTime ticketStart;

    LocalDateTime ticketEnd;

    BigDecimal ticketValue;

    List<UserEntity> users;

    List<VehicleEntity> vehicles;
}
