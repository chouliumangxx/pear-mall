package com.pear.ssm.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 短信消息bean
 * create by cx is 2018/4/27
 */
public class SmsMessage {

    //短信内容
    private String content;
    //手机号对象
    private List<String> mobile = new ArrayList<>();
    //国家号
    private String nationcode;

    public SmsMessage() {
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getMobile() {
        return mobile;
    }

    public void setMobile(List<String> mobile) {
        this.mobile = mobile;
    }

    public String getNationcode() {
        return nationcode;
    }

    public void setNationcode(String nationcode) {
        this.nationcode = nationcode;
    }
}
