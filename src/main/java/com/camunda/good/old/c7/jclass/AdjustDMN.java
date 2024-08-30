package com.camunda.good.old.c7.jclass;

import com.camunda.ProcessVariables;
import com.camunda.services.HeartofGold;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class AdjustDMN implements JavaDelegate {

    private final HeartofGold heartofGold;

    public AdjustDMN() {
        this.heartofGold = new HeartofGold();
    }

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        delegateExecution.setVariable(ProcessVariables.VAR_NAME_DMNSideEffect, heartofGold.infiniteImprobabilityDrive());
    }
}
