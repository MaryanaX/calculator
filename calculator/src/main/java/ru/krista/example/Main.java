package ru.krista.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double answ = 0.0; 
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        String[] parts = str.split(" ");
        String str1 = parts[0];
        int num1 = 0;
        try {
        num1 = Integer.parseInt(str1);
        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число из: " + str1);
            System.exit(1);
        }
        String str2 = parts[2];
        int num2 = 0;
        try {
        num2 = Integer.parseInt(str2);
        } catch (NumberFormatException e) {
            System.out.println("Не удалось получить число из: " + str2);
            System.exit(1);
        }
        String op = parts[1];
        switch (op) {
            case "+":
                answ = num1 + num2;
                break;
            case "-":
                answ = num1 - num2;
                break;
            case "*":
                answ = num1 * num2;
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("Не удалось получить число");
                    return;
                }
                answ = num1 / num2;
                break;
        }
        System.out.println(answ);
    }
}