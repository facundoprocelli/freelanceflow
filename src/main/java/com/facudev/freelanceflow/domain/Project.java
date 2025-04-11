package com.facudev.freelanceflow.domain;

import com.facudev.freelanceflow.enums.ProjectStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@ToString
@SuperBuilder
public class Project {

    private long projectId;
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
