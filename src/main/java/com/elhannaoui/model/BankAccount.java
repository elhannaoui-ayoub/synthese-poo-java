package com.elhannaoui.model;

import java.util.Objects;
import java.util.UUID;

public class BankAccount {
    String accountId;
    double balance;
    String currency;
    AccountStatus status;

    public BankAccount(){
        this.accountId= UUID.randomUUID().toString();
        status=AccountStatus.CREATED;
    }

    public BankAccount(String currency,double initialBalance){
        this();
        this.balance=initialBalance;
        status=AccountStatus.CREATED;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public String getAccountId(){
        return accountId;
    }

    public void setAccountId(String accountId){
        this.accountId=accountId;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountId.equals(that.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, balance, currency, status);
    }


}
