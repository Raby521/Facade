package com.mycompany.facade;

public class Calculator {
    private InterestCalculation current;
    private InterestCalculation savings; 
    private InterestCalculation loan;
    
    public Calculator() {
        current = new calculateCurrentInterest();
        savings = new calculateSavingsInterest();
        loan = new calculateLoanInterest();
    }
    
    public double executeCurrentFacade(double balance) {
        return current.calculateInterest(balance);
    }
    
    public double executeSavingsFacade(double balance) {
        return savings.calculateInterest(balance);
    }
    
    public double executeLoanFacade(double balance) {
        return loan.calculateInterest(balance);
    }
    
   //counting the interest amount by month or quarter or year
   public double amountInterest(String period, double interest) {
        switch (period) {
            case "month":
                return interest;
            
            case "quarter": 
                return interest * 4;

            case "year": 
                return interest * 12;

            default:
                return 0;
        }
    } 
}
