package com.apps.poc.loan;

public class Job{
    String jobName;
    String annualIncome;

    public Job ( String jobName, String annualIncome ) {
        this.jobName = jobName;
        this.annualIncome = annualIncome;
    }

    public String getJobName () {
        return jobName;
    }

    public String getAnnualIncome () {
        return annualIncome;
    }
}