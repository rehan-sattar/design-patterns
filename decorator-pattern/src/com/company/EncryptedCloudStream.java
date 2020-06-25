package com.company;

public class EncryptedCloudStream  implements  Stream {
    private final Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String encryptedData = encrypt(data);
       stream.write(encryptedData);
    }

    private String encrypt(String data) {
        return "@*#@)*#()@*$_";
    }
}
