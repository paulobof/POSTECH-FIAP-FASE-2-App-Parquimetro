package br.com.fiap.challenge_app_parquimetro.data.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "vehicle")
public class VehicleEntity {

    @Id
    Long vehicleCode;

    String plate;

    String brand;

    String model;

    String color;

    @DBRef
    List<TicketEntity> tickets;
}
