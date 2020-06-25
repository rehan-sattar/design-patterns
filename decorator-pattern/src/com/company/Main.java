package com.company;

public class Main {

    public static void main(String[] args) {
        storeCreditCard(
                // decorator for encryption
                new EncryptedCloudStream(
                        // decorator for compression
                        new CompressedCloudStream(
                                // cloud stream functionality
                                new CloudStream()
                        )
                )
        );
    }

     public static void storeCreditCard(Stream stream) {
        stream.write("2323-2323-2333-3434");
    }
}
