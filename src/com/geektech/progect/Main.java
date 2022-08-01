package com.geektech.progect;

import java.util.Scanner;

public class Main {
    public static boolean isFinish = false;


    public static void menu() {
        System.out.println("\n\t\t\t\t\t Choose what you want to do:\n" +
                "\t\t\t\t\t Check your deposit input 1\n" +
                "\t\t\t\t\t Deposit money to the account input 2\n" +
                "\t\t\t\t\t Withdraw your money input 3\n" +
                "\t\t\t\t\t Close input 4");

    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAmount(20000);

        menu();
        while (!isFinish) {
            try {
                bankAccount.setInputNumber();

            } catch (LimitException limitException) {
                System.out.println("\u001B[31m" + limitException.getMessage() + "\u001B[0m");
                System.out.println(
                        "\u001B[32m" + "\t\t\t\t\t You have now " +
                        limitException.getRemainingAmount() +
                        "\u001B[0m");
                menu();

            } catch (InputException e) {
                System.out.println(e.getMessage());
                menu();
            }
        }
    }
}