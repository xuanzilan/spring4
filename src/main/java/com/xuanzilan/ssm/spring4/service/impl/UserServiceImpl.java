package com.xuanzilan.ssm.spring4.service.impl;

import com.xuanzilan.ssm.spring4.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

    public UserServiceImpl() {
        logger.info("无参构造器");
    }

    public void doSome() {
        logger.info("doSome");
    }

    public void doOther() {
        logger.info("doOther");
    }
}
