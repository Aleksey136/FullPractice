package com.company.task1;

public class Summator_1 {
    public static void cycleFor (int[] M){
        int summ =0;
        for (int i = 0; i<M.length; i++){
            summ += M[i];
        }
        System.out.println("При выполнении цикла for: " + summ);
    }
    public static void cycleWhile (int[] M){
        int summ =0;
        int i=0;
        while (i<M.length){
            summ += M[i];
            i++;
        }
        System.out.println("При выполнении цикла while: " + summ);
    }
    public static void cycleDo (int[] M){
        int summ =0;
        int i=0;
        do {
            summ += M[i];
            i++;
        }
        while (i < M.length);
        System.out.println("При выполнении цикла while: " + summ);
    }
}