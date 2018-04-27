package com.pear.ssm.utils;

import com.github.qcloudsms.SmsSenderUtil;
import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import com.pear.ssm.bean.SmsContents;
import com.pear.ssm.bean.SmsMessage;
import org.json.JSONException;

import java.io.IOException;

/**
 * 短信发送工具类
 * create by cx is 2018/4/27
 */
public class SmsUtils {

    private SmsUtils(){}

    public String singleSend(SmsMessage smsMessage){

        try {
            SmsSingleSender smsSingleSender = new SmsSingleSender(SmsContents.APP_ID,SmsContents.APP_KEY);
            SmsSingleSenderResult result = smsSingleSender.send(0, smsMessage.getNationcode(), smsMessage.getMobile().get(0), smsMessage.getContent(),"", "");
        }catch (HTTPException e){

        }catch (JSONException e){

        }catch (IOException e){

        }
        return null;
    }

}
