package com.didispace;

import com.didispace.web.BlogProperties;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2019/3/21 0021.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Chapter1Application.class)
public class ApplicationTests {
    @Autowired
    private BlogProperties blogProperties;
    
    @Test
    public void getHello () throws  Exception{
        Assert.assertEquals(blogProperties.getName(),"zhangjun");
        Assert.assertEquals(blogProperties.getTitle(),"Spring Boot");
    }
}
