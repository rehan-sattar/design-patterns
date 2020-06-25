package com.company;

import com.company.exercise.Editor;

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
        Editor editor = new Editor();
        editor.openProject("...");
    }

     public static void storeCreditCard(Stream stream) {
        stream.write("2323-2323-2333-3434");
    }
}
