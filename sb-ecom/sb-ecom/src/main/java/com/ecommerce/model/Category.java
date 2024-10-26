package com.ecommerce.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document("category")
public class Category {
    @Id
    private String id;
    private String name;
    private String type;
    private String subType;
}
