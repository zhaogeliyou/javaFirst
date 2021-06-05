package com.lq.service.impl;

import com.lq.dao.ItemsDao;
import com.lq.pojo.Items;
import com.lq.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    ItemsDao itemsDao;
    public List<Items> findAll() {
        return itemsDao.findAll();
    }
}
