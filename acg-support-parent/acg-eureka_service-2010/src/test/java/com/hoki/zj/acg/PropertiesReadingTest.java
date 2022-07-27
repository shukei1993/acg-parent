package com.hoki.zj.acg;

import com.hoki.zj.acg.properties.EurekaProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = EurekaServiceApp2010.class)
@RunWith(SpringRunner.class)
public class PropertiesReadingTest {

    @Autowired
    private EurekaProperty property;

    @Test
    public void test1() throws Exception {
        System.out.println(property.getName());
        System.out.println(property.getAge());
    }
}
