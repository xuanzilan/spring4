package com.xuanzilan.ssm.spring4.service.impl;

import com.xuanzilan.ssm.spring4.service.ISomeService;
import org.apache.log4j.Logger;

public class SomeServiceImpl implements ISomeService {
    Logger logger = Logger.getLogger(SomeServiceImpl.class);

    public SomeServiceImpl() {
        logger.info("执行无参构造器");
    }

    public void doSome() {
        logger.info("Do SomeThing!");
    }
}
