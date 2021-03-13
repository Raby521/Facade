package com.mycompany.facade;

public class calculateLoanInterest implements InterestCalculation {

    @Override
    public double calculateInterest(double accountBalance) {
        return accountBalance * (0.1 / 12);
    }
}
