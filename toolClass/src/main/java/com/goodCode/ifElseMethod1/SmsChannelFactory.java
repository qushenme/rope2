package com.goodCode.ifElseMethod1;

import java.util.HashMap;
import java.util.Map;

public class SmsChannelFactory {

    private Map<String,SmsChannelService> map;

    public SmsChannelFactory(){
        map = new HashMap<>(2);
        map.put("CHANNEL_A",new SmsChannelServiceA());
        map.put("CHANNEL_B",new SmsChannelServiceB());
    }

    public SmsChannelService get(String channelType){
        return map.get(channelType);
    }
}
