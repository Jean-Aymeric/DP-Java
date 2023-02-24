package com.jad;

import com.jad.data.SamplesPropertiesConnector;

public class Client {
    private final SamplesPropertiesConnector samples;

    public Client() {
        this.samples = SamplesPropertiesConnector.getInstance();
    }

    public void work() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.samples.getById(i));
        }
    }
}
