package com.company.task20;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Account> accounts = new HashMap<String, Account>();             //Если хотите проверить многопоток:
        Bank bank = new Bank();                                                     //можете после 21 строки добавить вывод строки
        accounts.put("Геннадий", new Account(47826, "Геннадий"));  //либо в ForRun 21 строку изменить рандом суммы перевода
        accounts.put("Федор", new Account(24655, "Федор"));        //или же в Bank 22 строки изменить задержку
        accounts.put("Андрей", new Account(74225, "Андрей"));
        accounts.put("Леонид", new Account(87568, "Леонид"));
        accounts.put("Евгений", new Account(325465, "Евгений"));
        accounts.put("Джамшут", new Account(12678, "Джамшут"));
        accounts.put("Дмитрий", new Account(65752, "Дмитрий"));
        accounts.put("Ринат", new Account(12678, "Ринат"));
        bank.setAccounts(accounts);
        System.out.println("Изначальное количество денег в банке: " + bank.sumMoney());
        Thread task = new Thread(new ForRun(bank));
        task.start();
    }
}
