package org.jtf.k8s.order.management.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_tab")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String productName;
    private int quantity;

    // Getters and setters

    // Constructors
}

