package com.company.exercise;

public class DesEncryption implements Encryption {

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting using DES encryption" + message);
    }
}
