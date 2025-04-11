package com.facudev.freelanceflow.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString
@SuperBuilder
public class User {

    private long userId;
    private String name;
    private String surname;
    private Date birthday;
    private Credentials credentials;
    public User(){}
}
