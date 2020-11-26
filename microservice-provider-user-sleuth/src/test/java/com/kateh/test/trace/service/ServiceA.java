package com.kateh.test.trace.service;

import com.kateh.test.trace.Constant;
import com.kateh.test.trace.bean.ServiceMessage;
import com.kateh.test.trace.collector.ServiceCollector;

import static com.kateh.test.trace.Constant.DEFAULT_TRACE_ID;

public class ServiceA extends AbstractService {
    private ServiceB serviceB;

    public ServiceA(ServiceCollector serviceCollector) {
        super(serviceCollector);
        serviceB = new ServiceB(serviceCollector);
    }

    public void serviceA () {
        this.sleep(1000);
        trace(DEFAULT_TRACE_ID, new ServiceMessage("serviceA", System.currentTimeMillis()));
        serviceB.serviceB();
    }
}
