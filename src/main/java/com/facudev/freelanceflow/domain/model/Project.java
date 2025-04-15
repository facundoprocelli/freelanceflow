package com.facudev.freelanceflow.domain.model;

import com.facudev.freelanceflow.domain.enums.ProjectStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
public class Project {

    private long id;
    private String name;
    private String description;
    private Budget budget;
    private LocalDate startDate;
    private LocalDate endDate;
    private ProjectStatus status;
    private Tag[] tags;
    private Client client;
    private User owner;
}
