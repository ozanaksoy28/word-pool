package com.wordpool.model.response.error;

import com.wordpool.model.response.GeneralResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse extends GeneralResponse {
    private String detailMessage;
    public ErrorResponse(int status,String detailMessage) {
        super(status, "FAILED");
        this.detailMessage = detailMessage;
    }
}
