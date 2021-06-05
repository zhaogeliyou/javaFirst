package com.lq.controller;

import com.lq.pojo.Items;
import com.lq.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ItemController {
    @Autowired
    ItemsService itemsService;
    @RequestMapping("/findAll")
    public String findAll(){
        List<Items> all = itemsService.findAll();
        System.out.println(all);
        return "success";
    }
}
