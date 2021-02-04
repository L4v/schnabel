package com.schnabel.schnabel.order.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.schnabel.schnabel.misc.model.IIdentifiable;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Order implements IIdentifiable<Integer> 
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String description;
    private LocalDate deadline;    
    @OneToMany
    private final List<OrderItem> orderItems = new ArrayList<OrderItem>();

    @Override
    public Integer getId()
    {
        return this.id;
    }

    public void addOrderItem(OrderItem item)
    {
        this.orderItems.add(item);
    }

}
