package main.accountInfo;

import java.time.Instant;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private final Date dateCreated = Date.from(Instant.now());

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12.0;
    }

    public void withDraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance+=amount;
    }


}
