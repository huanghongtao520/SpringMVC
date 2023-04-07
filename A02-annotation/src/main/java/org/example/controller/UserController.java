package org.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController 注释在类上，表示该类下的所有的方法，都返回JSON字符串，不走视图解析器
public class UserController {

    @RequestMapping("/user")
    @ResponseBody //表示不会走视图解析器，直接返回一个字符串到网页
    public String json1() throws JsonProcessingException {
        //中文显示到网页会乱码
        User user = new User(1,"黄宏涛",23);
        //将对象User(id=1, name=黄宏涛, age=23)
        //转为字符串形式{"id":1,"name":"黄宏涛","age":23}
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(user);
    }
}
