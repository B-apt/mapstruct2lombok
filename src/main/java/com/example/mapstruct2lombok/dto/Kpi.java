package com.example.mapstruct2lombok.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kpi {
    private double value;

    private KpiMeta kpiMeta;
}
