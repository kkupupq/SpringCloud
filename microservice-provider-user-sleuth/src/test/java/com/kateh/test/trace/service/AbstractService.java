package com.kateh.test.trace.service;

import com.kateh.test.trace.bean.ServiceMessage;
import com.kateh.test.trace.collector.ServiceCollector;

public abstract class AbstractService {
    private ServiceCollector serviceCollector;
    protected AbstractService(ServiceCollector serviceCollector) {
        this.serviceCollector = serviceCollector;
    }

    protected void sleep(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void trace(String traceId, ServiceMessage serviceMessage) {
        serviceCollector.putMessage(traceId, serviceMessage);
    }
}
