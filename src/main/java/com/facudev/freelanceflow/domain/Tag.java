package com.facudev.freelanceflow.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
public class Tag {

    private long id;
    private String tagName;

    public Tag () {}
}
