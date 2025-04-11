package com.facudev.freelanceflow.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
public class Budget {
    private long budgetId;
    private float amount;
    private float pricePerHour;
    private int estimateHours;

    public Budget(){}
}
