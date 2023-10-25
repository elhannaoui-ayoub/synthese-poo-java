package com.elhannaoui;

import com.elhannaoui.model.BankAccount;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args){
        BankAccount[] accounts = new BankAccount[4];
        accounts[0]= new BankAccount("USD",5400);
        accounts[1]= new BankAccount("MAD",5400);
        accounts[2]= new BankAccount("EUR",5400);
        accounts[3]= new BankAccount("RUB",5400);

        ArrayList<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(new BankAccount("USD",5400));
        bankAccountList.add(new BankAccount("MAD",5400));
        bankAccountList.add(new BankAccount("EUR",5400));

        System.out.println("-------- Map -----");
        Map<String,BankAccount> bankAccountMap = new HashMap<>();
        bankAccountMap.put("c1",new BankAccount("USD",5400));
        bankAccountMap.put("c2",new BankAccount("USD",5400));
        bankAccountMap.put("c3",new BankAccount("USD",5400));

        BankAccount acc = bankAccountMap.get("c1");
        System.out.println(acc);

        for(String key:bankAccountMap.keySet()){
            System.out.println(bankAccountMap.get(key));
        }
        for(BankAccount acco:bankAccountMap.values()){
            System.out.println(bankAccountMap.get(acco));
        }


    }

    public  String toJson(Object o) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
    }

}
