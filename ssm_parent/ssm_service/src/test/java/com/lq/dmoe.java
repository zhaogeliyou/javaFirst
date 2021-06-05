package com.lq;

import com.lq.dao.ItemsDao;
import com.lq.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class dmoe {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:sping-service.xml");
        ItemsService itemsService = context.getBean(ItemsService.class);
        System.out.println(itemsService.findAll());
    }
}
