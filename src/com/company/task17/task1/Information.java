package com.company.task17.task1;

import java.util.List;

public class Information {
    private String accountType;
    private String accountNumber;
    private String currency;
    private String transactionDate;
    private String transactionReference;
    private String descriptionOfOperations;
    private double coming;
    private double expenditure;
    public Information(){}
    public Information(String accountType, String accountNumber, String currency, String transactionDate, String transactionReference, String descriptionOfOperations, double coming, double expenditure) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.transactionDate = transactionDate;
        this.transactionReference = transactionReference;
        this.descriptionOfOperations = descriptionOfOperations;
        this.coming = coming;
        this.expenditure = expenditure;
    }

    public void lineReading (String input, List<Information> information) {
        String[]inputArray = input.split(",");
        information.add(new Information(inputArray[0],inputArray[1],inputArray[2],inputArray[3],inputArray[4],forInputArray5(inputArray[5]),
                Double.parseDouble(inputArray[6]),Double.parseDouble(inputArray[7])));
    }

    public void lineWriting (Information input){
        System.out.println(input.getAccountType() + "," + input.getAccountNumber() + "," +
                input.getCurrency() + "," + input.getTransactionDate() + "," +
                input.getTransactionReference() + "," + input.getDescriptionOfOperations() + "," +
                input.getComing() + "," + input.getExpenditure());
    }

    public void expensesByOrganization(List<ExpensesByOrganization> expensesByOrganizations, String input, double input2){
        boolean flag = false;
        for (int i = 0; i < expensesByOrganizations.size(); i++){
            if (input.equals(expensesByOrganizations.get(i).getNameOrganization())) {
                flag = true;
                expensesByOrganizations.get(i).setExpenditure(expensesByOrganizations.get(i).getExpenditure()+input2);
                break;
            }
        }
        if (!flag)
        {
            expensesByOrganizations.add(new ExpensesByOrganization(input,input2));
        }
    }

    public void outputExpensesByOrganization(List<ExpensesByOrganization> expensesByOrganizations, int index){
        System.out.println("В организации << " + expensesByOrganizations.get(index).getNameOrganization() +
                ">> потрачено " + expensesByOrganizations.get(index).getExpenditure() + ";");
    }

    public String forInputArray5 (String input){
        String output = "";
        for (int i = 0; i < input.length(); i++){
            if ((input.charAt(i) == '/')||(input.charAt(i) == '\\')) {
                for (int j = i; j < input.length();j++){
                    output = output + input.charAt(j);
                    if (input.charAt(j)==' ' && input.charAt(j+1)==' ' && input.charAt(j+2)==' ')
                        break;
                }
                break;
            }
        }
        return output;
    }

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
    public String getTransactionReference() {
        return transactionReference;
    }
    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }
    public String getDescriptionOfOperations() {
        return descriptionOfOperations;
    }
    public void setDescriptionOfOperations(String descriptionOfOperations) {
        this.descriptionOfOperations = descriptionOfOperations;
    }
    public double getComing() {
        return coming;
    }
    public void setComing(double coming) {
        this.coming = coming;
    }
    public double getExpenditure() {
        return expenditure;
    }
    public void setExpenditure(double expenditure) {
        this.expenditure = expenditure;
    }
}
