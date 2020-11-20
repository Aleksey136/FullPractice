package com.company.task17.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BankStatement {
    public static void main(String[] args) {
        System.out.println("Начилось считывание файла.");
        List<Information> information = new ArrayList<Information>();
        List<ExpensesByOrganization> expensesByOrganizations = new ArrayList<ExpensesByOrganization>();
        Information information1 = new Information();
        try (FileReader reader = new FileReader("forTask17\\movementList.csv");
             BufferedReader input = new BufferedReader(reader))
        {
            double comingAll=0;
            double expenditureAll=0;
            String line = input.readLine();
            while ((line = input.readLine()) != null) {
                information1.lineReading(line,information);
                comingAll+=information.get(information.size()-1).getComing();
                expenditureAll+=information.get(information.size()-1).getExpenditure();
                information1.expensesByOrganization(expensesByOrganizations,
                        information.get(information.size()-1).getDescriptionOfOperations(),
                        information.get(information.size()-1).getExpenditure());
            }
            System.out.println("Сумма расходов: " + comingAll);
            System.out.println("Сумма доходов: " + expenditureAll);
            System.out.println("Суммы расходов по организациям:");
            for (int i = 0; i < expensesByOrganizations.size();i++)
                information1.outputExpensesByOrganization(expensesByOrganizations,i);
            /*for (int i = 0; i < information.size();i++)
                information1.lineWriting(information.get(i));*/
        }
        catch (Exception error)
        {
            System.out.println(error.toString());
        }
    }
}
