package com.company;

import com.company.exercise.AesEncryption;
import com.company.exercise.ChatClient;
import com.company.exercise.DesEncryption;

public class Main {

    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("SOMEGFILE", new BandWFilter(), new PngCompressor());
        imageStorage.store("SOMEGFILE", new BandWFilter(), new JpgCompressor());
        // exercise code //
        ChatClient chatClient = new ChatClient();
        chatClient.send("Hay I'm Rehan Sattar!", new DesEncryption());
        chatClient.send("Hay I'm Rehan Sattar!", new AesEncryption());
    }
}
