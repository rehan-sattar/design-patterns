package com.company.exercise;

public class AesEncryption implements  Encryption {

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting using AES encryption." + message);
    }
}
