package com.facudev.freelanceflow.entity;

import com.facudev.freelanceflow.domain.model.Project;
import com.facudev.freelanceflow.domain.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "working_days")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkingDayEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long workingDayId;

    private String description;

    @Temporal(TemporalType.DATE)
    private LocalDate day;
    @Temporal(TemporalType.TIME)
    private LocalTime startTime;
    @Temporal(TemporalType.TIME)
    private LocalTime finishTime;
    @Temporal(TemporalType.TIME)
    private LocalTime restStartTime;
    @Temporal(TemporalType.TIME)
    private LocalTime restFinishTime;

    //Todo: Hacer las relaciones de los user y projects
    private User user;
    private Project project;

}
