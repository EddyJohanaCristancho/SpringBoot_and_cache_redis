package com.example.redis_spring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "tbl_rate")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime created;
    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "start_date")
    private LocalDate startDate;
    private String status;
    @Column(name = "updated")
    private LocalDateTime updated;
    @Column(name = "value_rate")
    private BigDecimal valueRate;
    @Column(name = "approved_at")
    private LocalDate approvedAt;
    @Column(name = "rate_type_id")
    private int rateTypeId;
}
