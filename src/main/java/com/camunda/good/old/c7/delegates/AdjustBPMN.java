package com.camunda.good.old.c7.delegates;

import jakarta.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named("adjustBPMN")
public class AdjustBPMN implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Executing AdjustBPMN");
    }

}
