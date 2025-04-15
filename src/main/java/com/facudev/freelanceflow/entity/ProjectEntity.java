package com.facudev.freelanceflow.entity;

import com.facudev.freelanceflow.domain.enums.ProjectStatus;
import com.facudev.freelanceflow.domain.model.Budget;
import com.facudev.freelanceflow.domain.model.Client;
import com.facudev.freelanceflow.domain.model.Tag;
import com.facudev.freelanceflow.domain.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "projects")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;

    @Temporal(TemporalType.DATE)
    private LocalDate startDate;
    @Temporal(TemporalType.DATE)
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "project_status")
    private ProjectStatus status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_budget_id", referencedColumnName = "id", unique = true)
    private BudgetEntity budget;

    @OneToMany(mappedBy = "tags", fetch = FetchType.LAZY)
    private List<TagEntity> tags;
    private Client client;
    private User owner;

}
