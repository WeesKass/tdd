package com.company.main;

public class Account {
    private int accountNumber;
    private double balance ;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credits(double amount){
        setBalance(balance+= amount);
    }

    public void debit(double amount){
        if (balance>amount){
            setBalance(balance-=amount);
        }else{
            setBalance(balance);
        }

    }

    public String print(){
        return String.format("AccountNumber: %d, Balance: %.2f", getAccountNumber(), getBalance());
    }


}

