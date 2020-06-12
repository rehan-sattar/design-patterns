package com.company;

public class Main {

    public static void main(String[] args) {
        /**
         * Classes and objects example
         */
        User user = new User("Rehan Sattar");
        user.showName();
        /**
         * Interface example
         */
        TaxCalculator calculator = getTaxCalculator();
        float tax = calculator.calculateTax();
        System.out.println("The Tax is: "+  tax);

        /**
         * Encapsulation Example
         */
        Account account = new Account();
        account.deposit(10);
        account.withdraw(5);
        float balance = account.getBalance();
        System.out.println("Balance is: " + balance);
    }

    /**
     * interface example
     * @return  TaxCalculator
     */
    public static TaxCalculator getTaxCalculator() {
        return new TaxCalculator2019();
    }

}