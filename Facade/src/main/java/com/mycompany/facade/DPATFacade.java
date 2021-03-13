package com.mycompany.facade;

import java.text.DecimalFormat;

public class DPATFacade {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("####0.00");ll
        
        Calculator calCurrent = new Calculator();
        Calculator calSavings = new Calculator();
        Calculator calLoan = new Calculator();
        
        double balanceAmount;
        double interestLoan, interestCurrent, interestSavings;
        
        balanceAmount = 100000;
        System.out.println("Calculating CURRENT (" + df.format(balanceAmount) + "):-\n")
        interestCurrent = calCurrent.executeCurrentFacade(balanceAmount);
        System.out.println("Current Interest per month: " + df.format(calCurrent.amountInterest("month", interestCurrent))); 
        System.out.println("Current Interest per quarter: " + df.format(calCurrent.amountInterest("quarter", interestCurrent))); 
        System.out.println("Current Interest per year: " + df.format(calCurrent.amountInterest("year", interestCurrent))); 
        
        balanceAmount = 200000;
        System.out.println("\nCalculating SAVINGS (" + df.format(balanceAmount) + "):-\n");
        interestSavings = calSavings.executeSavingsFacade(balanceAmount);
        System.out.println("Savings Interest per month: " + df.format(calSavings.amountInterest("month", interestSavings))); 
        System.out.println("Savings Interest per quarter: " + df.format(calSavings.amountInterest("quarter", interestSavings))); 
        System.out.println("Savings Interest per year: " + df.format(calSavings.amountInterest("year", interestSavings))); 
        
        balanceAmount = 300000;
        System.out.println("\nCalculating LOAN (" + df.format(balanceAmount) + "):-\n");
        interestLoan = calLoan.executeLoanFacade(balanceAmount);
        System.out.println("Loan Interest per month: " + df.format(calLoan.amountInterest("month", interestLoan))); 
        System.out.println("Loan Interest per quarter: " + df.format(calLoan.amountInterest("quarter", interestLoan))); 
        System.out.println("Loan Interest per year: " + df.format(calLoan.amountInterest("year", interestLoan))); 
    }
}
