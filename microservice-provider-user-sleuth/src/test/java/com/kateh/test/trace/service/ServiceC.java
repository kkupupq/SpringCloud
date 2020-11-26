package com.kateh.test.trace.service;

import com.kateh.test.trace.bean.ServiceMessage;
import com.kateh.test.trace.collector.ServiceCollector;

import static com.kateh.test.trace.Constant.DEFAULT_TRACE_ID;

public class ServiceC extends AbstractService {
    public ServiceC(ServiceCollector serviceCollector) {
        super(serviceCollector);
    }

    public void serviceC () {
        this.sleep(500);
        trace(DEFAULT_TRACE_ID, new ServiceMessage("serviceC", System.currentTimeMillis()));
    }
}
