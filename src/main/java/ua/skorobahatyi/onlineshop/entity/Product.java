package ua.skorobahatyi.onlineshop.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(columnDefinition = "decimal(10,2) default 0.0")
    private Double price;
    @Column(columnDefinition = "timestamp default current_timestamp")
    private LocalDateTime createdAt;
}
