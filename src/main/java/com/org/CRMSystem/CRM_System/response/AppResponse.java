package com.org.CRMSystem.CRM_System.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

@Setter
@Getter
public class AppResponse {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy- MM-dd hh:mm:ssa")
            private LocalDateTime timestamp;
            @JsonProperty("status_code")
            private Integer statusCode;
            private ResponseEntity<String> message;
            public AppResponse(Integer statusCode, ResponseEntity<String> message) {
        this.timestamp = LocalDateTime.now();
        this.statusCode = statusCode;
        this.message = message;
    }
}