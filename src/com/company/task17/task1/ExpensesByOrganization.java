package com.company.task17.task1;

public class ExpensesByOrganization {
    private String nameOrganization;
    private double expenditure;
    public ExpensesByOrganization(String nameOrganization, double expenditure) {
        this.nameOrganization = nameOrganization;
        this.expenditure = expenditure;
    }
    public String getNameOrganization() {
        return nameOrganization;
    }
    public void setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }
    public double getExpenditure() {
        return expenditure;
    }
    public void setExpenditure(double expenditure) {
        this.expenditure = expenditure;
    }
}
