package com.zcp.service.Impl;

import com.zcp.service.ItemService;
import com.zcp.dao.ItemDao;
import com.zcp.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 这是一个实现类，用于实现呃呃呃
 */
@Service
public class ItemServiceImpl implements ItemService {
    //这里依赖注入dao层的对象用于调用其方法
    @Autowired
    ItemDao itemDao;
    @Override
    public List<Items> findAll() {
        //需求：实现一个查找所有数据的方法
        //传递上层的数据然后调用dao层
        //由于没有上层数据所以直接调用dao层
        List<Items> items = itemDao.findAll();
        return items;
        //还要在这层干嘛来着，暂时这样
    }

    @Override
    public void update(Items items) {
        itemDao.update(items);
    }
}
