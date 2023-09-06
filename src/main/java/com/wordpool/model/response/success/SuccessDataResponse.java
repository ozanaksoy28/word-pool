package com.wordpool.model.response.success;

import com.wordpool.model.response.GeneralDataResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessDataResponse<T> extends GeneralDataResponse {
    public SuccessDataResponse(int status, Object data) {
        super(status, "SUCCESS", data);
    }
}
