package com.patterns.abstractFactory;

public class CoporateBankingFactory implements BankingProductFactory{
    @Override
    public Savings createSaving() {
        return new CoporateSavings();
    }

    @Override
    public Loan createLoan() {
        return new CoporateLoan();
    }
}
