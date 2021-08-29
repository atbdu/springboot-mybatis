package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.service.Agent_rimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Agent_rimController {
    @Autowired
    private Agent_rimService agent_rimService;
    @RequestMapping("/list")
    @ResponseBody
    public List getList(){
        System.out.println("11111");
        List list = agent_rimService.getAgent_rims();
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
        return list;
    }
    @RequestMapping("/updateAgent_rim")
    @ResponseBody
    public int updateAgent_rim(String agent_pwd, String agent_no){
        agent_no = "A00000001";
        String pwd = "123456789";
        String s = DigestUtils.md5DigestAsHex(pwd.getBytes());
        System.out.println(s);
        agent_pwd=s;
        int i = agent_rimService.updateAgent_rim(agent_pwd,agent_no);
        return i;
    }
}
