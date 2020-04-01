package com.kgc.exam.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kgc.exam.common.service.DubboServiceTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubbotestController {

    @Reference
    private DubboServiceTest dubboServiceTest;

    @GetMapping(value = "/testDubbo")
    public void testDubbo(){
        try {
            dubboServiceTest.dubboTest();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
