package com.example.springbootmybatis.service;

import com.example.springbootmybatis.pojo.Agent_rim;

import java.util.List;

public interface Agent_rimService {
    public List<Agent_rim> getAgent_rims();
    public int updateAgent_rim(String agent_pwd,String agent_no);
}
