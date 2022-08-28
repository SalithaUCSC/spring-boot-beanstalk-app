package com.rest.order.entities;

import lombok.*;
import lombok.extern.jackson.Jacksonized;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Jacksonized
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String buyer;
    Double price;
    int qty;
}
