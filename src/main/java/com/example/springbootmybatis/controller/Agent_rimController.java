package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.service.Agent_rimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Agent_rimController {
    @Autowired
    private Agent_rimService agent_rimService;
    @RequestMapping("/list")
    @ResponseBody
    public String getList(){
        System.out.println("11111");
        List list = agent_rimService.getAgent_rims();
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
        return "select ok";
    }
}
