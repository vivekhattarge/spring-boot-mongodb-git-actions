package com.ecommerce.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("product")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private Integer quantity;
    private double price;

}
