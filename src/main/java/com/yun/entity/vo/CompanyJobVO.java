package com.yun.entity.vo;


import com.yun.entity.*;

public class CompanyJobVO {
    private Job job;
    private Company company;

    public CompanyJobVO(Job job, Company company) {
        this.job = job;
        this.company = company;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "CompanyJobVO{" +
                "job=" + job +
                ", company=" + company +
                '}';
    }
}
