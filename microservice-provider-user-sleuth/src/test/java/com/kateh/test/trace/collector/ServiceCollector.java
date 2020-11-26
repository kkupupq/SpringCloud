package com.kateh.test.trace.collector;

import com.kateh.test.trace.bean.ServiceMessage;

import java.util.HashMap;
import java.util.Map;

public class ServiceCollector {
//    Map<String, ServiceMessage> messageMap = new HashMap<>();
    public void putMessage(String traceId, ServiceMessage serviceMessage) {
//        messageMap.put(traceId, serviceMessage);
        System.out.println(String.format("traceId:%s\t\tserviceMessage:%s", traceId, serviceMessage.toString()));
    }
}
