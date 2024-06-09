package br.com.fiap.challenge_app_parquimetro.data.dto;

import br.com.fiap.challenge_app_parquimetro.data.entity.TicketEntity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDto {

    @Id
    Long vehicleCode;

    String plate;

    String brand;

    String model;

    String color;

    List<TicketEntity> tickets;
}
