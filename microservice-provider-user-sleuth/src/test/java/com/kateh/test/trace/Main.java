package com.kateh.test.trace;

import com.kateh.test.trace.collector.ServiceCollector;
import com.kateh.test.trace.service.ServiceA;

public class Main {
    public static void main(String[] args) {
        ServiceCollector serviceCollector = new ServiceCollector();
        ServiceA serviceA = new ServiceA(serviceCollector);
        serviceA.serviceA();
    }
}
