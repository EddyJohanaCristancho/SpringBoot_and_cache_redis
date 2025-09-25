package com.example.redis_spring.repository;

import com.example.redis_spring.dto.RateDTO;
import com.example.redis_spring.model.Rate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RateMapper {

    Rate toData(RateDTO rateDTO);

    RateDTO toEntity(Rate rateData);
}
