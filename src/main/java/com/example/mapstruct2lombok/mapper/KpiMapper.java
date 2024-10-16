package com.example.mapstruct2lombok.mapper;

import com.example.mapstruct2lombok.dto.Kpi;
import com.example.mapstruct2lombok.dto.KpiDto;
import org.mapstruct.Mapper;

@Mapper(uses = {KpiMetaMapper.class})
public interface KpiMapper {
    Kpi toKpi(KpiDto kpiDto);
}
