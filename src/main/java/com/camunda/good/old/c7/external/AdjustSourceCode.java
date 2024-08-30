package com.camunda.good.old.c7.external;

import com.camunda.ProcessVariables;
import com.camunda.services.HeartofGold;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AdjustSourceCode implements ExternalTaskHandler {

    private final HeartofGold heartofGold;

    public AdjustSourceCode() {
        heartofGold = new HeartofGold();
    }

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {

        Map<String, Object> variables = new HashMap<>();
        variables.put(ProcessVariables.VAR_NAME_SourceCodeSideEffect, heartofGold.infiniteImprobabilityDrive());

        externalTaskService.complete(externalTask,variables);
    }
}
