package com.facudev.freelanceflow.domain.model;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
}
