package com.example.redis_spring.controller;

import com.example.redis_spring.controller.response.Response;
import com.example.redis_spring.dto.RateDTO;
import com.example.redis_spring.service.RateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/rate")
@RequiredArgsConstructor
public class RateController {

    private final RateService rateService;

    @GetMapping("/getAll")
    public ResponseEntity<Response<List<RateDTO>>> getRate() {
        List<RateDTO> rates = rateService.getRate();
        Response<List<RateDTO>> response = new Response<>();
        response.setData(rates);
        response.setTimestamp(LocalDateTime.now());
        response.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PostMapping("/create")
    public ResponseEntity<Response<RateDTO>> CreateRate(@RequestBody RateDTO rateDTO) {
        RateDTO rate = rateService.createRate(rateDTO);
        Response<RateDTO> response = new Response<>();
        response.setData(rate);
        response.setTimestamp(LocalDateTime.now());
        response.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(response, response.getStatus());
    }
}
