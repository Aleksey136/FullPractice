package com.company.task20;

import java.util.*;

public class Bank
{
    private Map<String, Account> accounts;
    private final Random random = new Random();

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
        throws InterruptedException
    {
        System.out.println("Данный поток занят проверкой аккаунтов.");
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    public int sumMoney(){
        int sum = 0;
        for (String i : accounts.keySet()){
            sum+= accounts.get(i).getMoney();
        }
        return sum;
    }

    public void transfer(String fromAccountNum, String toAccountNum, long amount) throws InterruptedException {
        if (fromAccountNum.contains("banned") && toAccountNum.contains("banned")){
            System.out.println("Два аккаунта уже заблокированы " + accounts.get(fromAccountNum).getAccNumber()
                    + ", " + accounts.get(toAccountNum).getAccNumber() + ". Перевод отклонен.");
        }
        else if (fromAccountNum.contains("banned")){
            System.out.println("Аккаунт " + accounts.get(fromAccountNum).getAccNumber() + " уже заблокирован. Перевод отклонен.");
        }
        else if (toAccountNum.contains("banned")){
            System.out.println("Аккаунт " + accounts.get(toAccountNum).getAccNumber() + " уже заблокирован. Перевод отклонен.");
        }
        else if (fromAccountNum.equals(toAccountNum)){
            System.out.println("Перевод со своего счета на свой счет. Перевод отклонен.");
        }
        else {
            if (amount > 50000) {
                if (isFraud(fromAccountNum, toAccountNum, amount)) {
                    accounts.put("banned" + fromAccountNum, accounts.get(fromAccountNum));
                    accounts.put("banned" + toAccountNum, accounts.get(toAccountNum));
                    accounts.remove(fromAccountNum);
                    accounts.remove(toAccountNum);
                    System.out.println("Заблокированы аккаунты: " + fromAccountNum + " и " + toAccountNum);
                    System.out.println("Сумма перевода заблокированных аккаунтов: " + amount + ".");
                    System.out.println("Перевод отклонен.");
                } else {
                    accounts.get(fromAccountNum).setMoney(accounts.get(fromAccountNum).getMoney() - amount);
                    accounts.get(toAccountNum).setMoney(accounts.get(toAccountNum).getMoney() + amount);
                    System.out.println("Операция проведена успешно на сумму " + amount + ".");
                    System.out.println(getBalance(fromAccountNum));
                    System.out.println(getBalance(toAccountNum));
                    System.out.println();
                }
            } else {
                accounts.get(fromAccountNum).setMoney(accounts.get(fromAccountNum).getMoney() - amount);
                accounts.get(toAccountNum).setMoney(accounts.get(toAccountNum).getMoney() + amount);
                System.out.println("Операция проведена успешно на сумму " + amount + ".");
                System.out.println(getBalance(fromAccountNum));
                System.out.println(getBalance(toAccountNum));
                System.out.println();
            }
        }
    }

    public String getBalance(String accountNum)
    {
        return ("Остаток на счете " + accountNum + ": " + accounts.get(accountNum).getMoney() + "; ");
    }

}
