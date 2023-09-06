package com.wordpool.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class GeneralDataResponse<T> extends Response{
    private String message;
    private T data;
    public GeneralDataResponse(int status,String message, T data) {
        super(status);
        this.message = message;
        this.data = data;
    }
}
