package com.schnabel.schnabel.users.model;

import com.schnabel.schnabel.misc.model.Address;
import com.schnabel.schnabel.misc.model.IIdentifiable;
import com.schnabel.schnabel.terms.model.Term;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Registered employed user
 */
@Entity
@Table(name = "employed_users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class EmployedUser implements IIdentifiable<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(nullable = false)
    protected String name;
    @Column(nullable = false)
    protected String surname;
    @Column(unique = true, nullable = false)
    @Setter(AccessLevel.PROTECTED)
    protected String email;
    @Column(nullable = false)
    protected String password;
    @Embedded
    protected Address address;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "employedUser")
    protected final Set<Term> terms = new HashSet<Term>();
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "employedUser")
    protected final Set<Shift> shifts = new HashSet<Shift>();

    public EmployedUser(String name, String surname, String email, String password, Address address)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public EmployedUser(long id, String name, String surname, String email, String password, Address address)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.address = address;
    }

}