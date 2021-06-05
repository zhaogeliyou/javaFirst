package com.lq;

import com.lq.dao.ItemsDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = context.getBean(ItemsDao.class);
        System.out.println(itemsDao.findAll());
    }
}
