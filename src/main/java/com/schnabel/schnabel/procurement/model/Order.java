package com.schnabel.schnabel.procurement.model;

import com.schnabel.schnabel.misc.model.IIdentifiable;
import com.schnabel.schnabel.users.model.PharmacyAdmin;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Order implements IIdentifiable<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private LocalDate deadline;
    
    @Column
    private String description;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pharmacyadmin_id")
    private PharmacyAdmin pharmacyAdmin;
    
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private List<Offer> offers;
    
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private List<OrderItem> orderItems;
}