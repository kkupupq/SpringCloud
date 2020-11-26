package com.kateh.test.trace.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceMessage {
    private String methodName;
    private long time;
}
