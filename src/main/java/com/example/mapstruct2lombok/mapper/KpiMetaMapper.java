package com.example.mapstruct2lombok.mapper;

import com.example.mapstruct2lombok.dto.KpiMeta;
import com.example.mapstruct2lombok.dto.KpiMetaDto;
import org.mapstruct.Mapper;

@Mapper
public interface KpiMetaMapper {

    KpiMeta toKpiMeta(KpiMetaDto kpiMetaDto);
}
