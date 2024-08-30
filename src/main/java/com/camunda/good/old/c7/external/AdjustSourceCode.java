package com.camunda.good.old.c7.external;

import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.stereotype.Component;

public class AdjustSourceCode implements ExternalTaskHandler {
    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        System.out.println("Executing AdjustSourceCode");
        externalTaskService.complete(externalTask);
    }
}
