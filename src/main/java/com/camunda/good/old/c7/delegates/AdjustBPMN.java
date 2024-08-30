package com.camunda.good.old.c7.delegates;

import com.camunda.ProcessVariables;
import com.camunda.services.HeartofGold;
import jakarta.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

@Named("adjustBPMN")
public class AdjustBPMN implements JavaDelegate {

    private final HeartofGold heartofGold;

    public AdjustBPMN(HeartofGold heartofGold) {
        this.heartofGold = heartofGold;
    }

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        execution.setVariable(ProcessVariables.VAR_NAME_BPMNSideEffect, heartofGold.infiniteImprobabilityDrive());
    }

}
