package com.wordpool.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneralResponse extends Response{
    private String message;

    public GeneralResponse(int status,String message) {
        super(status);
        this.message = message;
    }
}
