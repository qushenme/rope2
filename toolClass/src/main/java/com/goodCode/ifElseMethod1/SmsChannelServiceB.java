package com.goodCode.ifElseMethod1;

public class SmsChannelServiceB implements SmsChannelService {
    @Override
    public void send(String phoneNo, String content) {
        System.out.println("这是B发出的消息");
    }
}
