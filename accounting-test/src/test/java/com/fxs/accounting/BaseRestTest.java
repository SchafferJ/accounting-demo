package com.fxs.accounting;

import com.fxs.accounting.rest.bootstrap.RestApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: suxinfa
 * @Date: 2019/12/13 14:07
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class BaseRestTest {
}
