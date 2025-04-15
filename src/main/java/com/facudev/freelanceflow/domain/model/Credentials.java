package com.facudev.freelanceflow.domain.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Credentials {
    private long id;
    private String email;
    private String cellphone;
    private String password;
    private boolean active;
}
