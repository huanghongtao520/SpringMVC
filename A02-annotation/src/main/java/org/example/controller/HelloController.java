package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    // 传统风格：http://localhost:8082/add?a=1&b=1
    // RestFul风格：使用@PathVariable注解,并修改路径为/add/{a}/{b}
    // RestFul路径：http://localhost:8082/add/1/2
    @RequestMapping("/add/{a}/{b}")
    public String hello(@PathVariable int a, @PathVariable int b, Model model){

        model.addAttribute("msg","结果为："+(a+b));

        return "hello";
    }
}
