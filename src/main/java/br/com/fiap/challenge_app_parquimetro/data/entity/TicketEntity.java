package br.com.fiap.challenge_app_parquimetro.data.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "ticket")
public class TicketEntity {

    @Id
    Long ticketCode;

    LocalDateTime ticketStart;

    LocalDateTime ticketEnd;

    BigDecimal ticketValue;

    @DBRef
    List<UserEntity> users;

    @DBRef
    List<VehicleEntity> vehicles;
}
