package com.schnabel.schnabel.grades.model;

import com.schnabel.schnabel.users.model.Dermatologist;
import com.schnabel.schnabel.users.model.Patient;
import com.schnabel.schnabel.misc.model.IIdentifiable;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Dermatologist grade
 */
@Entity
@Table(name = "dermatologistgrades")
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode
public class DermatologistGrade implements IIdentifiable<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int value;

    //TODO():
    //private Dermatologist dermatologist;
    //private Patient patient;
}
