package com.facudev.freelanceflow.domain.model;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Client {
    private long clientId;
    private String name;
    private String surname;
    private String email;
    private String cellphone;

}
