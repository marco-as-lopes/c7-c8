package com.camunda;

import com.camunda.good.old.c7.external.AdjustSourceCode;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.core5.util.Timeout;
import org.camunda.bpm.client.ExternalTaskClient;

public class App {
    public static void main(String... args) {
        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://localhost:8080/engine-rest")
                .asyncResponseTimeout(1000)
                .customizeHttpClient(httpClientBuilder -> {
                    httpClientBuilder.setDefaultRequestConfig(RequestConfig.custom()
                            .setResponseTimeout(Timeout.ofSeconds(15))
                            .build());
                })
                .build();

        client.subscribe("AdjustSourceCode").handler(new AdjustSourceCode()).open();
    }
}
