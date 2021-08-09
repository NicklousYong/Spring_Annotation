package com.atguigu.controller;/*
 * @AUTHOR   LiXiang
 * @Classname BookController
 *
 * @Date 2021/8/5 обнГ4:00
 *

 * @userName
 */

import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {


    @Autowired
    private BookService bookService;

}

