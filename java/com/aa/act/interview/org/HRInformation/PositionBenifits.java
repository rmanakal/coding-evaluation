package com.aa.act.interview.org.HRInformation;

import com.aa.act.interview.org.Position;

public class PositionBenifits {

    private Position position;
    private Benifits benifits;
    private PercentDollar percentageDollerQualifier; //Percentatge or flat amount

    private Double percentageDollerValue ;

    public PositionBenifits(Position position, Benifits benifits, PercentDollar percentageDollerQualifier, Double percentageDollerValue) {
        this.position = position;
        this.benifits = benifits;
        this.percentageDollerQualifier = percentageDollerQualifier;
        this.percentageDollerValue = percentageDollerValue;
    }

    public PercentDollar getPercentageDollerQualifier() {
        return percentageDollerQualifier;
    }

    public void setPercentageDollerQualifier(PercentDollar percentageDollerQualifier) {
        this.percentageDollerQualifier = percentageDollerQualifier;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    public Double getPercentageDollerValue() {
        return percentageDollerValue;
    }

    public void setPercentageDollerValue(Double percentageDollerValue) {
        this.percentageDollerValue = percentageDollerValue;
    }

    public Benifits getBenifits() {
        return benifits;
    }

    public void setBenifits(Benifits benifits) {
        this.benifits = benifits;
    }
}
