package com.zcp.testservice;

import com.zcp.pojo.Items;
import com.zcp.service.ItemService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 测试service层
 */
public class TestService {
    @Test
    public void testFindAll(){
        //创建容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemService itemsService = (ItemService)applicationContext.getBean("itemServiceImpl");
        List<Items> itemsList = itemsService.findAll();
        System.out.println(itemsList);
    }
    @Test
    public void testUpdate(){
        //创建容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemService itemsService = (ItemService)applicationContext.getBean("itemServiceImpl");
        Items items = new Items();
        items.setName("草拟吗");
        itemsService.update(items);
    }
}
