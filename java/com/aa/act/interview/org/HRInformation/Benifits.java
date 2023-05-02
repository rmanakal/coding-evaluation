package com.aa.act.interview.org.HRInformation;

import com.aa.act.interview.org.Position;

public class Benifits {


   private  String benifitName;
   private String benifitDesc;
   private String planCode;
   private String planCodeDesc;

    public Benifits(String benifitName, String benifitDesc) {
        this.benifitName = benifitName;
        this.benifitDesc = benifitDesc;
    }

    public Benifits(String benifitName) {
        this.benifitName = benifitName;
    }

    public Benifits(String benifitName, String benifitDesc, String planCode, String planCodeDesc) {
        this.benifitName = benifitName;
        this.benifitDesc = benifitDesc;
        this.planCode = planCode;
        this.planCodeDesc = planCodeDesc;
    }

    public Benifits() {

    }


    public String getBenifitName() {
        return benifitName;
    }

    public void setBenifitName(String benifitName) {
        this.benifitName = benifitName;
    }

    public String getBenifitDesc() {
        return benifitDesc;
    }

    public void setBenifitDesc(String benifitDesc) {
        this.benifitDesc = benifitDesc;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public String getPlanCodeDesc() {
        return planCodeDesc;
    }

    public void setPlanCodeDesc(String planCodeDesc) {
        this.planCodeDesc = planCodeDesc;
    }

}
