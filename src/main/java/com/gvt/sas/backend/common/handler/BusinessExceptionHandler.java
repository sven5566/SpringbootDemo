package com.gvt.sas.backend.common.handler;

import com.gvt.sas.backend.common.enums.ResultEnum;
import com.gvt.sas.backend.common.exception.BusinessException;
import com.gvt.sas.backend.common.result.ResultVO;
import com.gvt.sas.backend.common.util.ResultVOUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BusinessExceptionHandler {
    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public ResultVO handlerBusinessException(BusinessException e) {
        return ResultVOUtil.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultVO handlerException(Exception e) {
        return ResultVOUtil.error(ResultEnum.FAILURE.getCode(), ResultEnum.FAILURE.getMessage());
    }
}
