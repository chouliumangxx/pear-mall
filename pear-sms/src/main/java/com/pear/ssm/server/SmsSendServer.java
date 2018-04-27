package com.pear.ssm.server;

import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * create by cx is 2018/4/27
 * 消息发送,消费者
 */
@Component
public class SmsSendServer implements MessageListener {

    @Override
    public void onMessage(Message message) {

    }

}
