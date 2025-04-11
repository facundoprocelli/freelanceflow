package com.facudev.freelanceflow.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
public class Client {
    private long clientId;
    private String name;
    private String surname;
    private String email;
    private String cellphone;

    public Client(){}
}
