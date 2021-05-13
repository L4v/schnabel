package com.schnabel.schnabel.appointment.model;


import com.schnabel.schnabel.drugs.model.Drug;
import com.schnabel.schnabel.misc.model.IIdentifiable;
import com.schnabel.schnabel.pharmacies.model.Pharmacy;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "recommended_meds")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class RecommendedMed implements IIdentifiable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int durationInDays;

    @Column
    private int takePerDay;

    @ManyToOne
    @JoinColumn(name = "rec_med_drug_id")
    private Drug drug;

    @ManyToOne
    @JoinColumn(name = "app_rep_id")
    private AppointmentReport report;
}
