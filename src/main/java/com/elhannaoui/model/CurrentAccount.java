package com.elhannaoui.model;

public class CurrentAccount extends  BankAccount{

    private double overDraft;

    public CurrentAccount(double overDraft) {
        this.overDraft = overDraft;
    }
}

