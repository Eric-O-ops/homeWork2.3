package com.geektech.progect;

public class LimitException extends InputException {
    private double remainingAmount;

    public LimitException(String massage, double remainingAmount) {
        super(massage);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
