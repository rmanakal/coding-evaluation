package com.aa.act.interview.org.HRInformation;

public enum PercentDollar{
    PERCENT ("PERCENT"),
    DOLLAR ("DOLLAR");

    public final String label;

    private PercentDollar(String label) {
        this.label = label;
    }

    @Override
    public String toString(){
        return label;
    }


}
