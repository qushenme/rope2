package com.goodCode.ifElseMethod1;

public class SmsChannelServiceA implements SmsChannelService {

    @Override
    public void send(String phoneNo, String content) {
        System.out.println("这是A发的消息");
    }
}
