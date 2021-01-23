package com.zcp.dao;

import com.zcp.pojo.Items;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ItemDao {
    //这里应该有两个方法,由于是查询所以要有返回值，返回值是一个Javabean
    public List<Items>  findAll();
    //还有一个方法,这个方法实现更新要传参数，传啥，一个Javabean对象
    public void update(Items items);
}
