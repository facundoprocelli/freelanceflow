package com.facudev.freelanceflow.domain.model;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Budget {
    private long id;
    private float amount;
    private float pricePerHour;
    private int estimateHours;
}
