package com.zcp.controller;

import com.zcp.pojo.Items;
import com.zcp.service.ItemService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/items")
public class controller {
    @Autowired
    ItemService itemService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        //调用service层
            List<Items> itemsList = itemService.findAll();
        //存放进request域对象中
            model.addAttribute("items",itemsList);
            //用视图解析器去跳转到items.jsp中
            return "items";

    }
    @RequestMapping("/update")
    public String  update(Items items){
        //调用service层
        itemService.update(items);
        //重定向跳转到findAll方法，用于重新刷新jsp页面，如果直接跳转到jsp页面不会刷新，因为没有访问数据库拿出最新添加的
        //那条数据
        return "redirect:/items/findAll";
    }
}
