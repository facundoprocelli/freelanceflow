package com.facudev.freelanceflow.entity;

import com.facudev.freelanceflow.domain.model.Credentials;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    @Temporal(TemporalType.DATE)
    private LocalDate birthday;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name ="credentials_id", referencedColumnName = "id", unique = true)
    private CredentialsEntity credentials;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private List<ProjectEntity> projectEntities;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private List<WorkingDayEntity> workingDayEntityList;

}
