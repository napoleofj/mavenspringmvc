package com.simcard.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class Hello implements Controller{
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        List list =new ArrayList<>();
        list.add("one");
        list.add("two");
        ModelAndView mv=new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("index.jsp");
        return mv;
    }

}
