package com.patterns.abstractFactory;

public class RetailBankingFactory implements BankingProductFactory{

    @Override
    public Savings createSaving() {
        return new RetailSavings();
    }

    @Override
    public Loan createLoan() {
        return new RetailLoan();
    }
}
