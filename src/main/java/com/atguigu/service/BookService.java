package com.atguigu.service;/*
 * @AUTHOR   LiXiang
 * @Classname BookService
 *
 * @Date 2021/8/5 обнГ4:00
 *

 * @userName
 */

import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;


    public void  print(){
        System.out.println(bookDao.toString());
    }


}
