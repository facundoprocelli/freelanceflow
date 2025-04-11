package com.facudev.freelanceflow.domain;

import com.facudev.freelanceflow.enums.ProjectStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.hibernate.jdbc.Work;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@SuperBuilder
public class WorkingDay {

    private long workingDayId;
    private String description;
    private LocalDate day;
    private LocalTime startTime;
    private LocalTime finishTime;
    private LocalTime restStartTime;
    private LocalTime restFinishTime;
    private User user;
    private Project project;

    public WorkingDay(){}
}
