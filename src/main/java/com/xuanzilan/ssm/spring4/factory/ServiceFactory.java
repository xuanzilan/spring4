package com.xuanzilan.ssm.spring4.factory;

import com.xuanzilan.ssm.spring4.service.ISomeService;
import com.xuanzilan.ssm.spring4.service.impl.SomeServiceImpl;
import org.apache.log4j.Logger;

public class ServiceFactory {
    static Logger logger = Logger.getLogger(ServiceFactory.class);

    public ISomeService getSomeService(){
        logger.info("getSomeService");
        return new SomeServiceImpl();
    }

    public static ISomeService getSomeServiceStatic(){
        logger.info("getSomeServiceStatic");
        return new SomeServiceImpl();
    }
}
