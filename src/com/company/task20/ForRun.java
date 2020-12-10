package com.company.task20;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ForRun implements Runnable {
    private Bank bank = new Bank();

    public ForRun(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            Random random = new Random();
            List<String> keys = new ArrayList<>(bank.getAccounts().keySet());
            String randomKey1 = keys.get(random.nextInt(bank.getAccounts().size()));
            String randomKey2 = keys.get(random.nextInt(bank.getAccounts().size()));
            long amount = random.nextInt(21_000) + 30_000;
            int j = 1;
            while (bank.getAccounts().get(randomKey1).getMoney()<amount) {
                j++;
                randomKey1 = keys.get(random.nextInt(bank.getAccounts().size()));
                if (j==bank.getAccounts().size()){
                    amount = random.nextInt(21_000) + 30_000;
                    break;
                }
            }
            if (j==bank.getAccounts().size())
                continue;
            try {
                bank.transfer(randomKey1,randomKey2,amount);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Конечное количество денег в банке: " + bank.sumMoney());
    }
}
