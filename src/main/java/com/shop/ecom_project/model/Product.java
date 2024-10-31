package com.shop.ecom_project.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     private String name;
     private String description;
     private String brand;
     private BigDecimal price;
     private String category;

     //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
     private Date releaseDate;
     private boolean productAvailable;
     private int stockQuantity;

     private String imageName;
     private String imageType;
     @Lob
     private byte[] imageData;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
