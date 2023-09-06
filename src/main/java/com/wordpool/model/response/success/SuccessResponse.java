package com.wordpool.model.response.success;

import com.wordpool.model.response.GeneralResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessResponse extends GeneralResponse {
    public SuccessResponse(int status) {
        super(status, "SUCCESS");
    }
}
