package com.schnabel.schnabel.drugs.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "drugprice")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DrugPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double price;

    @Column(name = "price_start_date", nullable = false)
    private LocalDateTime priceStartDate;

    @Column(name = "price_end_date", nullable = true)
    private LocalDateTime priceEndDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "drug_id")
    private Drug drug;
}
