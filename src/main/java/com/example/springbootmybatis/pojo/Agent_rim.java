package com.example.springbootmybatis.pojo;

import java.sql.Time;
import java.sql.Date;

public class Agent_rim {
    private Integer Id;
    private String agent_no;
    private String id_card_md5;
    private String phone_md5;
    private Integer invitation_no;
    private String agent_pwd;
    private String pay_pwd;
    private Date add_date;
    private Time add_time;

    public Agent_rim() {
    }

    public Agent_rim(Integer id, String agent_no, String id_card_md5, String phone_md5, Integer invitation_no, String agent_pwd, String pay_pwd, Date add_date, Time add_time) {
        Id = id;
        this.agent_no = agent_no;
        this.id_card_md5 = id_card_md5;
        this.phone_md5 = phone_md5;
        this.invitation_no = invitation_no;
        this.agent_pwd = agent_pwd;
        this.pay_pwd = pay_pwd;
        this.add_date = add_date;
        this.add_time = add_time;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getAgent_no() {
        return agent_no;
    }

    public void setAgent_no(String agent_no) {
        this.agent_no = agent_no;
    }

    public String getId_card_md5() {
        return id_card_md5;
    }

    public void setId_card_md5(String id_card_md5) {
        this.id_card_md5 = id_card_md5;
    }

    public String getPhone_md5() {
        return phone_md5;
    }

    public void setPhone_md5(String phone_md5) {
        this.phone_md5 = phone_md5;
    }

    public Integer getInvitation_no() {
        return invitation_no;
    }

    public void setInvitation_no(Integer invitation_no) {
        this.invitation_no = invitation_no;
    }

    public String getAgent_pwd() {
        return agent_pwd;
    }

    public void setAgent_pwd(String agent_pwd) {
        this.agent_pwd = agent_pwd;
    }

    public String getPay_pwd() {
        return pay_pwd;
    }

    public void setPay_pwd(String pay_pwd) {
        this.pay_pwd = pay_pwd;
    }

    public Date getAdd_date() {
        return add_date;
    }

    public void setAdd_date(Date add_date) {
        this.add_date = add_date;
    }

    public Time getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Time add_time) {
        this.add_time = add_time;
    }

    @Override
    public String toString() {
        return "Agent_rim{" +
                "Id=" + Id +
                ", agent_no='" + agent_no + '\'' +
                ", id_card_md5='" + id_card_md5 + '\'' +
                ", phone_md5='" + phone_md5 + '\'' +
                ", invitation_no=" + invitation_no +
                ", agent_pwd='" + agent_pwd + '\'' +
                ", pay_pwd='" + pay_pwd + '\'' +
                ", add_date=" + add_date +
                ", add_time=" + add_time +
                '}';
    }
}
