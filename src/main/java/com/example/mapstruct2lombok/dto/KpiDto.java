package com.example.mapstruct2lombok.dto;

import lombok.Data;

@Data
public class KpiDto {
    private double value;

    private KpiMetaDto kpiMetaDto;
}
