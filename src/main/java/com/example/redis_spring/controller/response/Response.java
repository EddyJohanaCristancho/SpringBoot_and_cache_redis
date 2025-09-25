package com.example.redis_spring.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Response<T> {
    private LocalDateTime timestamp;
    private  T data;
    private HttpStatus status = HttpStatus.OK;

    public Response(T data) {
        this.timestamp = LocalDateTime.now();
        this.data = data;
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public T getData() {
        return data;
    }

    public HttpStatus status(){
        return status;
    }
}

