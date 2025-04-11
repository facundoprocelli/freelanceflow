package com.facudev.freelanceflow.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
public class Credentials {
    private long credentialsId;
    private String email;
    private String cellphone;
    private String password;
    private boolean active;

    public Credentials(){}
}
