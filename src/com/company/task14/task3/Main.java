package com.company.task14.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {        /*В качестве ключа я взял имена, потому что по заданию нам нужно, чтобы
                                                      программа печатала в консоль список всех абонентов в алфавитном порядке с номерами.
                                                      А значит если мы создадим TreeMap она уже автоматически будет хранить имена
                                                      в алфавитном порядке и на это не нужно будет тратить время программы.*/
        Scanner scanner = new Scanner(System.in);
        Map<String, String> numbers = new TreeMap<String, String>();
        numbers.put("Alexey", "+7 (905) 203-03-94");
        numbers.put("Dmitriy", "+7 (905) 875-32-45");
        numbers.put("Bill", "+7 (905) 294-12-35");
        numbers.put("Cate", "+7 (905) 567-23-62");
        System.out.println("Введите команду, которую хотите выполнить: (End - чтобы остановить программу)");
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (command.equals("LIST")) {
                for (Map.Entry<String, String> output : numbers.entrySet()) {
                    System.out.println("Имя (ключ): " + output.getKey() + "; Телефон (значение): " + output.getValue() + ";");
                }
            }
            else if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.charAt(0) == '+') {
                String phone = numberPhone(command);
                if (!phone.equals("-1")) {
                    System.out.println(phone);
                    if (numbers.containsValue(phone)) {
                        for (Map.Entry<String, String> number : numbers.entrySet()) {
                            if (number.getValue().equals(phone)) {
                                System.out.println("Введите имя, которое вы хотите:");
                                String name = scanner.nextLine();
                                while (numbers.containsKey(name)) {
                                    System.out.println("Данное имя уже есть, введите другое:");
                                    name = scanner.nextLine();
                                }
                                numbers.remove(number.getKey());
                                numbers.put(name, phone);
                                break;
                            }
                        }
                    } else {
                        System.out.println("Введите имя, которое вы хотите:");
                        String name = scanner.nextLine();
                        while (numbers.containsKey(name)) {
                            System.out.println("Данное имя уже есть, введите другое:");
                            name = scanner.nextLine();
                        }
                        numbers.put(name, phone);
                    }
                    System.out.println("Изменено.");
                }
            } else if ((command.charAt(0) >= 'a' && command.charAt(0) <= 'z') || (command.charAt(0) >= 'A' && command.charAt(0) <= 'Z')) {
                if (numbers.containsKey(command)) {
                    for (Map.Entry<String, String> number : numbers.entrySet()) {
                        if (number.getKey().equals(command)) {
                            System.out.println("Введите номер, который вы хотите:");
                            String phone = scanner.nextLine();
                            phone = numberPhone(phone);
                            while (phone.equals("-1")) {
                                System.out.println("Введите номер по возможному формату:");
                                phone = scanner.nextLine();
                                phone = numberPhone(phone);
                            }
                            System.out.println(phone);
                            while (numbers.containsValue(phone)) {
                                System.out.println("Данный номер уже есть, введите другой:");
                                phone = scanner.nextLine();
                                phone = numberPhone(phone);
                                while (phone.equals("-1")) {
                                    System.out.println("Введите номер по возможному формату:");
                                    phone = scanner.nextLine();
                                    phone = numberPhone(phone);
                                }
                                System.out.println(phone);
                            }
                            numbers.remove(number.getKey());
                            numbers.put(command, phone);
                            break;
                        }
                    }
                }
                else {
                    System.out.println("Введите номер, которые вы хотите:");
                    String phone = scanner.nextLine();
                    phone = numberPhone(phone);
                    while (phone.equals("-1")) {
                        System.out.println("Введите номер по возможному формату:");
                        phone = scanner.nextLine();
                        phone = numberPhone(phone);
                    }
                    System.out.println(phone);
                    while (numbers.containsValue(phone)) {
                        System.out.println("Данный номер уже есть, введите другой:");
                        phone = scanner.nextLine();
                        phone = numberPhone(phone);
                        while (phone.equals("-1")) {
                            System.out.println("Введите номер по возможному формату:");
                            phone = scanner.nextLine();
                            phone = numberPhone(phone);
                        }
                        System.out.println(phone);
                    }
                    numbers.put(command, phone);
                }
                System.out.println("Изменено.");
            }
            else {
                System.out.println("Неккоректный вход.");
            }
            command = scanner.nextLine();
        }
    }
    public static String numberPhone(String command) {
        char[] commandChar = new char[100];
        for (int i = 0; i < command.length(); i++)
            commandChar[i] = command.charAt(i);
        char[] phoneChar = new char[15];
        int counter = 0;
        for (int i = 0; i < command.length(); i++) {
            if ((i == 0) && (commandChar[i] == '+')) {
                phoneChar[counter] = commandChar[i];
                counter++;
            }
            if ((commandChar[i] >= '0') && (commandChar[i] <= '9')) {
                if (counter < 15) {
                    phoneChar[counter] = commandChar[i];
                    counter++;
                }
            }
        }
        String phone = "";
        if ((counter == 11) && (phoneChar[0] != '+') && ((phoneChar[0] == '7') || (phoneChar[0] == '8'))) {
            phone = "+7 (" + phoneChar[1] + phoneChar[2] + phoneChar[3] + ") " + phoneChar[4] +
                    phoneChar[5] + phoneChar[6] + "-" + phoneChar[7] + phoneChar[8] + "-" + phoneChar[9] + phoneChar[10];
        } else if ((counter == 10) && (phoneChar[0] != '+')) {
            phone = "+7 (" + phoneChar[0] + phoneChar[1] + phoneChar[2] + ") " + phoneChar[3] +
                    phoneChar[4] + phoneChar[5] + "-" + phoneChar[6] + phoneChar[7] + "-" + phoneChar[8] + phoneChar[9];
        } else if ((counter == 12) && (phoneChar[0] == '+') && (phoneChar[1] == '7')) {
            phone = "+7 (" + phoneChar[2] + phoneChar[3] + phoneChar[4] + ") " + phoneChar[5] +
                    phoneChar[6] + phoneChar[7] + "-" + phoneChar[8] + phoneChar[9] + "-" + phoneChar[10] + phoneChar[11];
        } else {
            System.out.println("Неверный формат номера");
            phone = "-1";
        }
        return phone;
    }
}