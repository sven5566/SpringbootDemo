package com.gvt.sas.backend.controller;
import com.gvt.sas.backend.dao.IntegralMapper;
import com.gvt.sas.backend.entity.Integral;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    IntegralMapper mapper;
    @RequestMapping("/test1")
    public String test1(){
        Integral integral = mapper.checkPhone("13510639646");
        System.out.println("result>>>>>>>>"+integral);
//        throw new RuntimeException();
        return "test1";
    }
}
