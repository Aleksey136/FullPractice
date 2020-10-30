package com.company.task14.task2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        treeSet.add("abcd@mail.ru");
        treeSet.add("mads@mail.ru");
        System.out.println("Введите команду, которую хотите выполнить: (End - чтобы остановить программу)");
        String command = scanner.nextLine();
        while (!command.equals("End")) {

            String[] words = command.split(" ");

            if (words[0].equals("LIST") && (words.length==1)) {
                System.out.println(treeSet);
            } else if (words[0].equals("ADD") && (words.length==2)){
                String[] partWord = words[1].split("@");
                if (partWord.length!=2)
                    System.out.println("Неккоректный ввод.");
                else {
                    boolean flagMailCorrect = true;
                    for (int i = 0; i < partWord[0].length(); i++){
                        if (!(((partWord[0].charAt(i) >= 'a' && partWord[0].charAt(i) <= 'z')) ||
                                ((partWord[0].charAt(i) == '.')) || (((partWord[0].charAt(i) >= '0' && partWord[0].charAt(i) <= '9')))
                                || ((partWord[0].charAt(i) == '-')) || ((partWord[0].charAt(i) == '_')))) {
                            flagMailCorrect = false;
                            break;
                        }
                        if ((partWord[0].charAt(i) == '.') || (partWord[0].charAt(i) == '-') || (partWord[0].charAt(i) == '_')) {
                            if (i != 0) {
                                if (('.' == partWord[0].charAt(i - 1)) || ('-' == partWord[0].charAt(i - 1))
                                        || ('_' == partWord[0].charAt(i - 1))) {
                                    flagMailCorrect = false;
                                    break;
                                }
                            }
                            else if ((partWord[0].charAt(i) == '.') || (partWord[0].charAt(i) == '-') || (partWord[0].charAt(i) == '_')) {
                                flagMailCorrect = false;
                                break;
                            }
                            if (i != partWord[0].length()-1) {
                                if (('.' == partWord[0].charAt(i + 1)) || ('-' == partWord[0].charAt(i + 1))
                                        || ('_' == partWord[0].charAt(i + 1))) {
                                    flagMailCorrect = false;
                                    break;
                                }
                            }
                            else if ((partWord[0].charAt(i) == '.') || (partWord[0].charAt(i) == '-') || (partWord[0].charAt(i) == '_')) {
                                flagMailCorrect = false;
                                break;
                            }
                        }
                    }

                    if (partWord[0].length()==0)
                        flagMailCorrect = false;

                    if (partWord[1].contains("..") || (partWord[1].endsWith(".")) || (partWord[1].startsWith(".")))
                        flagMailCorrect = false;
                    else {
                        String[] partPartWord = partWord[1].split("\\.");

                        String word = partPartWord[0];
                        for (int i = 1; i < partPartWord.length-2; i++)
                            word += partPartWord[i];

                        for (int i = 0; i < word.length(); i++) {
                            if (!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')) {
                                flagMailCorrect = false;
                                break;
                            }
                        }
                        if (partPartWord[0].length() == 0)
                            flagMailCorrect = false;

                        if ((partPartWord[partPartWord.length-1].length() >= 2 && partPartWord[partPartWord.length-1].length() <= 6)) {
                            for (int i = 0; i < partPartWord[partPartWord.length-1].length(); i++) {
                                if (!((partPartWord[partPartWord.length-1].charAt(i) >= 'a' &&
                                        partPartWord[partPartWord.length-1].charAt(i) <= 'z')
                                        || partPartWord[partPartWord.length-1].charAt(i) == '.')) {
                                    flagMailCorrect = false;
                                    break;
                                }
                            }
                        }
                    }

                    /*if (!((partWord[1].endsWith(".ru")) || (partWord[1].endsWith(".com"))))         //Реализация для .ru и .com и не более
                        flagMailCorrect = false;
                    if (partWord[1].endsWith(".ru")) {
                        for (int i = 0; i < partWord[1].length() - 3; i++) {
                            if (!(partWord[1].charAt(i) >= 'a' && partWord[1].charAt(i) <= 'z')) {
                                flagMailCorrect = false;
                                break;
                            }
                        }
                        if ((partWord[1].length()-3)==0)
                            flagMailCorrect = false;
                    }
                    if (partWord[1].endsWith(".com")) {
                        for (int i = 0; i < partWord[1].length() - 4; i++) {
                            if (!(partWord[1].charAt(i) >= 'a' && partWord[1].charAt(i) <= 'z')) {
                                flagMailCorrect = false;
                                break;
                            }
                        }
                        if ((partWord[1].length()-4)==0)
                            flagMailCorrect = false;
                    }*/

                    if (flagMailCorrect)
                        treeSet.add(words[1]);
                    else
                        System.out.println("Неккоректный ввод.");
                }
            } else
                System.out.println("Неккоректный ввод.");
            command = scanner.nextLine();
        }
    }
}
