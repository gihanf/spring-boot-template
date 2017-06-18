package com.gihan.service;

import com.gihan.port.SamplePort;

public class SampleService implements SamplePort {

    @Override
    public int samplePortMethod(int a, int b) {
        return a + b;
    }
}
