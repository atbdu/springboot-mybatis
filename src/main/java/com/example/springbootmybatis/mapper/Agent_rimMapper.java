package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.pojo.Agent_rim;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper//这个注解表示这是一个mybatis的mapper类，或者在主启动类上加@MapperScan("xxx.xx.xx")
@Repository
public interface Agent_rimMapper {
    public List<Agent_rim> getAgent_rims();
}
