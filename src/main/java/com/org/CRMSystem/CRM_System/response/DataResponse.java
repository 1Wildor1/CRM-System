package com.org.CRMSystem.CRM_System.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

@Setter
@Getter
public class DataResponse<T> {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy- MM-dd hh:mm:ssa")
    private LocalDateTime timestamp;
    @JsonProperty("status_code")
    private Integer statusCode;
    private ResponseEntity<T> messageAndData;
    public DataResponse(Integer statusCode, ResponseEntity<T> messageAndData) {
        this.timestamp = LocalDateTime.now();
        this.statusCode = statusCode;
        this.messageAndData = messageAndData;
    }
}
