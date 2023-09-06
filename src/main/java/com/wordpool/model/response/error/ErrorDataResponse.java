package com.wordpool.model.response.error;

import com.wordpool.model.response.GeneralDataResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDataResponse extends GeneralDataResponse {
    private String detailMessage;
    public ErrorDataResponse(int status, String detailMessage, Object data) {
        super(status,"FAILED", data);
        this.detailMessage = detailMessage;
    }
}
