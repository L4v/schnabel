package com.schnabel.schnabel.users.model;

import javax.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
public class MedicalEmployee extends User
{
    @OneToMany(mappedBy = "medicalEmployee")
    private List<Vacation> vacations;
}