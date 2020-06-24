package com.goodCode.ifElseMethod1;

public class SmsChannelTest {


    public static void main(String[] args) {
        new SmsChannelFactory().get("CHANNEL_A").send("","");
    }
}
