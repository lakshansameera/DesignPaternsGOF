package com.patterns.abstractFactory;

public interface BankingProductFactory {

    Savings createSaving();
    Loan createLoan();
}
