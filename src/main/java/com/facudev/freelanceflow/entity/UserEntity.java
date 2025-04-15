package com.facudev.freelanceflow.entity;

import com.facudev.freelanceflow.domain.model.Credentials;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "usuarios")
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
    private Date birthday;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name ="credentials_id", referencedColumnName = "id", unique = true)
    private CredentialsEntity credentials;

}
