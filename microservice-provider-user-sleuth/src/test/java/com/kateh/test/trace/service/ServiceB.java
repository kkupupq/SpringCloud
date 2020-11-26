package com.kateh.test.trace.service;
import com.kateh.test.trace.bean.ServiceMessage;
import com.kateh.test.trace.collector.ServiceCollector;

import static com.kateh.test.trace.Constant.DEFAULT_TRACE_ID;

public class ServiceB extends AbstractService {
    private ServiceC serviceC;

    public ServiceB(ServiceCollector serviceCollector) {
        super(serviceCollector);
        serviceC = new ServiceC(serviceCollector);
    }

    public void serviceB () {
        this.sleep(200);
        trace(DEFAULT_TRACE_ID, new ServiceMessage("serviceB", System.currentTimeMillis()));
        serviceC.serviceC();
    }
}
