package com.zcp.service;

import com.zcp.pojo.Items;

import java.util.List;

/**
 * 这个是Item的Service类的接口
 */
public interface ItemService {
    //这之中有什么方法呢？首先分析需求
    //实现查询方法，传递上层的参数到下一层
    //创建一个方法，这个方法没有参数，但是有返回值结果，其结果是list<Items>
    //在这个方法中调用dao层的方法，哦对了，有机遇dao层中没有方法，所以要使用动态代理调用dao层的接口
    //所以需要实现spring整合mybatis，这个在dao层的配置文件中就已经做好了
    //创建一个用于实现查询所有数据的方法
    public List<Items> findAll();
    //写一个实现类用于实现这个接口
    public void update(Items items);
}
