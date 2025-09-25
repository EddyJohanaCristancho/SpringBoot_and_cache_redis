package com.example.redis_spring.service;

import com.example.redis_spring.dto.RateDTO;
import com.example.redis_spring.repository.RateMapper;
import com.example.redis_spring.repository.RateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RateService {

    private final RateRepository rateRepository;

    private final RateMapper rateMapper;

    @Cacheable(value = "getRate")
    public List<RateDTO> getRate() {
        return rateRepository.findAll().stream()
                .filter(rate -> rate.getStatus().equals("REJECTED"))
                .map(rateMapper::toEntity)
                .collect(Collectors.toList());
    }

    public RateDTO createRate(RateDTO rateDTO) {
        return rateMapper.toEntity(rateRepository
                .save(rateMapper.toData(rateDTO)));
    }

}
