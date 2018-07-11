package com.gvt.sas.backend.common.exception;

import com.gvt.sas.backend.common.enums.ResultEnum;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{
    private Integer code;

    public BusinessException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
