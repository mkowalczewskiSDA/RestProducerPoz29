package com.example.RestProducer.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    @NotNull
    private String firstName;
    @NotNull
    @Column
    private String lastName;
    @Column
    @NotNull
    @Email
    private String email;
    @OneToMany(mappedBy = "user")
    private Set<Task> tasks;
}
