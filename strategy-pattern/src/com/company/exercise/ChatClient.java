package com.company.exercise;

public class ChatClient {
    public void send(String message, Encryption encryptionAlgorithm) {
        /*
        if (encryptionAlgorithm == "DES")
            System.out.println("Encrypting message using DES");
        else if (encryptionAlgorithm == "AES")
            System.out.println("Encrypting message using AES");
        else
            throw new UnsupportedOperationException("Unsupported encryption algorithm");
         */
        encryptionAlgorithm.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}