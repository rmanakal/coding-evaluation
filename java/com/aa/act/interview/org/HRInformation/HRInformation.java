package com.aa.act.interview.org.HRInformation;


import com.aa.act.interview.org.Employee;
import com.aa.act.interview.org.HRInformation.PositionBenifits;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class HRInformation {
    Employee employee;
    String positionTitle;
    LocalDate hiredate;
    LocalDate startdate;


    Double salary;
    List<PositionBenifits> benifitsList;
    LocalDate terminationDate;
    HashMap<String, List<TerminationReasons>> terminationReason;
    public HRInformation(Employee employee, String positionTitle, LocalDate hiredate, LocalDate startdate, Double salary
            , List<PositionBenifits> benifitsList, LocalDate terminationDate, HashMap<String, List<TerminationReasons>> terminationReason) {
        this.employee = employee;
        this.positionTitle = positionTitle;
        this.hiredate = hiredate;
        this.startdate = startdate;
        this.salary = salary;
        this.benifitsList = benifitsList;
        this.terminationDate = terminationDate;
        this.terminationReason = terminationReason;
    }

    public HRInformation() {

    }

    public HRInformation FireInformation(Employee employee, LocalDate terminationDate, HashMap<String, List<TerminationReasons>> terminationReason ) {
        this.employee = employee;
        this.positionTitle = positionTitle;
        this.terminationDate = terminationDate;
        this.terminationReason = terminationReason;
        return this;
    }
    public HRInformation HireInformation (Employee employee, String positionTitle, LocalDate hiredate, LocalDate startdate, Double salary, List<PositionBenifits> benifitsList) {
        this.employee = employee;
        this.positionTitle = positionTitle;
        this.hiredate = hiredate;
        this.startdate = startdate;
        this.salary = salary;
        this.benifitsList = benifitsList;
          return this;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<PositionBenifits> getBenifitsList() {
        return benifitsList;
    }

    public void setBenifitsList(List<PositionBenifits> benifitsList) {
        this.benifitsList = benifitsList;
    }

    public LocalDate getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(LocalDate terminationDate) {
        this.terminationDate = terminationDate;
    }

    public HashMap<String, List<TerminationReasons>> getTerminationReason() {
        return terminationReason;
    }

    public void setTerminationReason(HashMap<String, List<TerminationReasons>> terminationReason) {
        this.terminationReason = terminationReason;
    }
}
