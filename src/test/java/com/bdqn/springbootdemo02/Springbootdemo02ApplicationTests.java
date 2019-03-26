package com.bdqn.springbootdemo02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springbootdemo02ApplicationTests {
    //记录器
 Logger logger =  LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {

        //日志级别 trace<debug<info<warn<error
    logger.trace("跟踪日志");
    logger.debug("警告日志");
    //springBoot默认是info的

    logger.info("输出日志");
    logger.warn("这是warn日志");
    logger.error("这是error日志");
    }

}
