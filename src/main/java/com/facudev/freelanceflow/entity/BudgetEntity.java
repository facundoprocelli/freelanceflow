package com.facudev.freelanceflow.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "budgets")
public class BudgetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column()
    private float amount;
    @Column()
    private float pricePerHour;
    @Column()
    private float estimatedHours;

    @OneToOne(mappedBy = "budget")
    private ProjectEntity porject;
}
