package com.facudev.freelanceflow.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "credentials")
public class CredentialsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    @Email
    private  String email;
    @Column(unique = true, length = 13)
    private String cellphone;
    @Column()
    private String password;
    @Column(nullable = false)
    private  boolean active;
    @OneToOne(mappedBy = "credentials")
    private UserEntity user;
}
