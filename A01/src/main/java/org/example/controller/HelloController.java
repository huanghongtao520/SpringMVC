package org.example.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//注意：这里实现接口
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //MdoelAndView模型和视图
        //调用业务逻辑
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","HelloSpringMvc");
        //要跳转的视图
        mv.setViewName("test");
        return mv;
    }
}
