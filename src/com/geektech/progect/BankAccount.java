package com.geektech.progect;


import java.util.Scanner;

public class BankAccount {
    private double amount;
    private int inputNumber;
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
        }
    }
    public void withDraw(int sum) throws LimitException {
        if (sum <= amount) {
            amount -= sum;
        } else {
            throw new LimitException("On your deposit money lower then the sum", getAmount());
        }
    }
    public void setInputNumber() throws InputException {
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
        switch (inputNumber) {
            case 1:
                System.out.println("\u001B[32m" + "\t\t\t\t\t Your amount " + amount + "\u001B[0m");
                Main.menu();
                break;
            case 2:
                System.out.println("\u001B[32m" + "\t\t\t\t\t Input wanting sum: " + "\u001B[0m");
                deposit(scanner.nextInt());
                System.out.println("\u001B[32m" + "\t\t\t\t\t Your amount " + amount + "\u001B[0m");
                Main.menu();
                break;
            case 3:
                System.out.println("\u001B[32m" + "\t\t\t\t\t Input wanting sum: " + "\u001B[0m");
                withDraw(scanner.nextInt());
                System.out.println("\u001B[32m" + "\t\t\t\t\t Your amount " + amount + "\u001B[0m");
                Main.menu();
                break;
            case 4:
                Main.isFinish = true;
                break;
            default:
                throw new InputException("\u001B[31m" +
                        "\t\t\t\t\t Нужно ввести цифру(1, 2, 3 or 4) без пробелов, а вы ввели: " + inputNumber + "\u001B[37m");
        }
    }
}
