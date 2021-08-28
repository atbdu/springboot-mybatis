package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.mapper.Agent_rimMapper;
import com.example.springbootmybatis.pojo.Agent_rim;
import com.example.springbootmybatis.service.Agent_rimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Agent_rimServiceImpl implements Agent_rimService {
    @Autowired
    private Agent_rimMapper agent_rimMapper;
    @Override
    public List<Agent_rim> getAgent_rims() {
        List<Agent_rim> list = agent_rimMapper.getAgent_rims();
        return list;
    }
}
