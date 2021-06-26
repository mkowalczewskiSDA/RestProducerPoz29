package com.example.RestProducer.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    @NotNull
    @Size(min = 1, max = 64)
    private String description;
    @Column
    private boolean completed;
    @Column
    @Min(0)
    @Max(100)
    private Integer completionPercentage;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
