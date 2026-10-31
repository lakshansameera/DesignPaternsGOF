package com.patterns.abstractFactory;

public class Demo {

    public static void main (String args[]){

        BankingProductFactory products;
        products = new CoporateBankingFactory();

        Savings savings = products.createSaving();
        savings.openSavings();

        Loan laon = products.createLoan();
        laon.openLoan();

        products = new RetailBankingFactory();
        Savings reSaving = products.createSaving();
        reSaving.openSavings();

        Loan reLoan = products.createLoan();
        reLoan.openLoan();

    }
}
