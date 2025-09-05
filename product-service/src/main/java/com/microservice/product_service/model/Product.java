package com.microservice.product_service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product")   // MongoDB collection name
@AllArgsConstructor            // Lombok: generates constructor with all fields
@NoArgsConstructor             // Lombok: generates constructor with no fields
@Builder                        // Lombok: generates builder pattern for the class
@Data                           // Lombok: generates getter and setter methods
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}