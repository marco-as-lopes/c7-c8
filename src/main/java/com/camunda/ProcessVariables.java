package com.camunda;

public class ProcessVariables {

    public static final String VAR_NAME_BPMNSideEffect = "BPMNSideEffect";
    public static final String VAR_NAME_DMNSideEffect = "DMNSideEffect";
    public static final String VAR_NAME_SourceCodeSideEffect= "sourceCodeSideEffect";

    private String BPMNSideEffect;
    private String DMNSideEffect;
    private String sourceCodeSideEffect;

    public String getBPMNSideEffect() {
        return BPMNSideEffect;
    }

    public void setBPMNSideEffect(String BPMNSideEffect) {
        this.BPMNSideEffect = BPMNSideEffect;
    }

    public String getDMNSideEffect() {
        return DMNSideEffect;
    }

    public void setDMNSideEffect(String DMNSideEffect) {
        this.DMNSideEffect = DMNSideEffect;
    }

    public String getSourceCodeSideEffect() {
        return sourceCodeSideEffect;
    }

    public void setSourceCodeSideEffect(String sourceCodeSideEffect) {
        sourceCodeSideEffect = sourceCodeSideEffect;
    }
}
