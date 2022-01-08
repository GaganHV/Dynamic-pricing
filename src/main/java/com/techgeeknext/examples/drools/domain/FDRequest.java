package com.techgeeknext.examples.drools.domain;

import java.util.Date;
import java.util.TimeZone;

public class FDRequest {
    private String bankName;
    private Date durationInYear;
    private String fdInterestRate;
    private TimeZone zone;

    public FDRequest(String bankName, Date durationInYear) {
        this.bankName = bankName;
        this.durationInYear = durationInYear;
        this.zone = TimeZone.getTimeZone("IST");
    }

    public TimeZone getZone() {
        return zone;
    }

    public void setZone(TimeZone zone) {
        this.zone = zone;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Date getDurationInYear() {
        return durationInYear;
    }

    public void setDurationInYear(Date durationInYear) {
        this.durationInYear = durationInYear;
    }

    public String getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(String fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }
}
