package tugas1kripto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OneTimePad {
    private String keyFromFile;

    public OneTimePad(String keyFilePath) throws IOException {
        // Baca seluruh isi file kunci
        this.keyFromFile = new String(Files.readAllBytes(Paths.get(keyFilePath)));
    }

    public String encrypt(String plaintext) {
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            char p = plaintext.charAt(i);
            if (Character.isLetter(p)) {
                // Menggunakan nilai ASCII
                char k = keyFromFile.charAt(i % keyFromFile.length());
                char encryptedChar = (char) (((Character.toUpperCase(p) - 'A' + Character.toUpperCase(k) - 'A') % 26) + 'A'); // Untuk huruf besar
                ciphertext.append(encryptedChar);
            }
            // Karakter non-huruf diabaikan
        }
        return ciphertext.toString();
    }

    public String decrypt(String ciphertext) {
        StringBuilder plaintext = new StringBuilder();
        ciphertext = ciphertext.toUpperCase(); // Pastikan ciphertext dalam huruf besar

        for (int i = 0; i < ciphertext.length(); i++) {
            char c = ciphertext.charAt(i);
            if (Character.isLetter(c)) {
                // Menggunakan nilai ASCII
                char k = keyFromFile.charAt(i % keyFromFile.length());
                char decryptedChar = (char) (((c - 'A' - (Character.toUpperCase(k) - 'A') + 26) % 26) + 'A'); // Untuk huruf besar
                plaintext.append(decryptedChar);
            }
            // Karakter non-huruf diabaikan
        }
        return plaintext.toString();
    }
}
