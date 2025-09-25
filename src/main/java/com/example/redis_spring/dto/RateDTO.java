package com.example.redis_spring.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RateDTO implements Serializable {
    private Long id;
    private LocalDateTime created;
    private LocalDate endDate;
    private LocalDate startDate;
    private String status;
    private LocalDateTime updated;
    private BigDecimal valueRate;
    private LocalDate approvedAt;
    private int rateTypeId;
}
