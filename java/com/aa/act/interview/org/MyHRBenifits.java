package com.aa.act.interview.org;

import com.aa.act.interview.org.HRInformation.Benifits;
import com.aa.act.interview.org.HRInformation.PercentDollar;
import com.aa.act.interview.org.HRInformation.PositionBenifits;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MyHRBenifits {

    private PositionBenifits positionBenifits;

    private PositionBenifits hrBenifits ;


    protected HashMap<String,List<PositionBenifits>> createHRBenifits() {

        HashMap<String, List<PositionBenifits>> lposben = new HashMap<>();
        List<PositionBenifits> listposben = new LinkedList<>();
        String pos = "CEO";
        String ben = "401K-Retirement Fund";
        PositionBenifits lpos = new PositionBenifits(new Position(pos),
                                                     new Benifits(ben),
                                                     PercentDollar.PERCENT, 20.0);
        listposben.add(lpos);

        ben = "HealthCare-Medical";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 10.0);
        listposben.add(lpos);
        ben = "HealthCare-Vision";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 10.0);
        listposben.add(lpos);
        ben = "HealthCare-Dental";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 10.0);
        listposben.add(lpos);

        ben = "Supplimental-Life Insurance";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 20.0);
        listposben.add(lpos);

        ben = "Supplimental-Other Benifits";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 30.0);
        listposben.add(lpos);
        lposben.put(pos,listposben);
         listposben = new LinkedList<>();
        pos = "President";
        ben = "401K-Retirement Fund";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 10.0);
        listposben.add(lpos);

        ben = "HealthCare-Medical";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 8.0);
        listposben.add(lpos);
        ben = "HealthCare-Vision";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 8.0);
        listposben.add(lpos);
        ben = "HealthCare-Dental";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Life Insurance";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 10.0);
        listposben.add(lpos);

        ben = "Supplimental-Other Benifits";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 15.0);
        listposben.add(lpos);

        lposben.put(pos,listposben);
        listposben = new LinkedList<>();

        pos = "VP Marketing";
        ben = "401K-Retirement Fund";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);


        ben = "HealthCare-Medical";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Vision";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Dental";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Life Insurance";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Other Benifits";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        lposben.put(pos,listposben);
        listposben = new LinkedList<>();

        pos = "VP Sales";
        ben = "401K-Retirement Fund";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);


        ben = "HealthCare-Medical";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Vision";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Dental";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Life Insurance";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Other Benifits";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        lposben.put(pos,listposben);
        listposben = new LinkedList<>();

        pos = "VP Finance";
        ben = "401K-Retirement Fund";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);


        ben = "HealthCare-Medical";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Vision";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Dental";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Life Insurance";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Other Benifits";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        lposben.put(pos,listposben);
        listposben = new LinkedList<>();

        pos = "COO";
        ben = "401K-Retirement Fund";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);


        ben = "HealthCare-Medical";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Vision";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Dental";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Life Insurance";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Other Benifits";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        lposben.put(pos,listposben);
        listposben = new LinkedList<>();

        pos = "CIO";
        ben = "401K-Retirement Fund";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);


        ben = "HealthCare-Medical";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Vision";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Dental";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Life Insurance";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Other Benifits";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        lposben.put(pos,listposben);
        listposben = new LinkedList<>();

        pos = "VP Technology";
        ben = "401K-Retirement Fund";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);


        ben = "HealthCare-Medical";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Vision";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Dental";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Life Insurance";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Other Benifits";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        lposben.put(pos,listposben);
        listposben = new LinkedList<>();

        pos = "VP Infrastructure";
        ben = "401K-Retirement Fund";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);


        ben = "HealthCare-Medical";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Vision";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Dental";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Life Insurance";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Other Benifits";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        lposben.put(pos,listposben);
        listposben = new LinkedList<>();

        pos = "Director Enterprise Architecture";
        ben = "401K-Retirement Fund";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);


        ben = "HealthCare-Medical";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Vision";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Dental";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Life Insurance";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Other Benifits";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        lposben.put(pos,listposben);
        listposben = new LinkedList<>();

        pos = "Director Customer Technology";
        ben = "401K-Retirement Fund";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);


        ben = "HealthCare-Medical";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Vision";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Dental";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Life Insurance";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "Supplimental-Other Benifits";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        lposben.put(pos,listposben);
        listposben = new LinkedList<>();


        Position s = new Position("Salesperson");

        pos = "Salesperson";
        ben = "401K-Retirement Fund";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);

        ben = "HealthCare-Medical";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Vision";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.PERCENT, 7.0);
        listposben.add(lpos);
        ben = "HealthCare-Dental";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.DOLLAR, 347.0);
        listposben.add(lpos);

        ben = "Supplimental-Life Insurance";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.DOLLAR, 517.0);
        listposben.add(lpos);

        ben = "Supplimental-Other Benifits";
        lpos = new PositionBenifits(new Position(pos),
                new Benifits(ben),
                PercentDollar.DOLLAR, 517.0);
        listposben.add(lpos);

        lposben.put(pos,listposben);

        return lposben;

    }

    public List<PositionBenifits> MyHRBenifits(Position position){
        HashMap<String,List<PositionBenifits>> list = createHRBenifits();
        return list.get(position.getTitle());
   }
}
