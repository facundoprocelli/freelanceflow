package com.facudev.freelanceflow.domain.model;

import com.facudev.freelanceflow.domain.model.Credentials;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class User {

    private long userId;
    private String name;
    private String surname;
    private Date birthday;
    private Credentials credentials;
}
