package com.kgc.exam.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.kgc.exam.common.service.DubboServiceTest;

@Service
public class DubboServiceTestImpl implements DubboServiceTest {

    @Override
    public void dubboTest() {
        System.out.println("111");
    }
}
