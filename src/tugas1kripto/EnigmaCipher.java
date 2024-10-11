package tugas1kripto;

public class EnigmaCipher {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int[] ROTOR_WIRING = {4, 9, 12, 25, 0, 11, 24, 23, 21, 1, 22, 5, 2, 17, 16, 20, 14, 13, 19, 18, 15, 8, 10, 7, 6, 3};
    private static final int[] REFLECTOR_WIRING = {24, 17, 20, 7, 16, 18, 11, 3, 15, 23, 13, 6, 14, 10, 12, 8, 4, 1, 5, 25, 2, 22, 21, 9, 0, 19};
    private String key;

    public EnigmaCipher(String key) {
        this.key = key.toUpperCase();
    }

    public String encrypt(String text) {
        text = text.toUpperCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                int position = ALPHABET.indexOf(c);
                int keyPosition = ALPHABET.indexOf(key.charAt(i % key.length()));
                position = (position + keyPosition) % ALPHABET.length();
                position = rotorEncrypt(position);
                position = reflectorEncrypt(position);
                position = rotorDecrypt(position);
                result.append(ALPHABET.charAt(position));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public String decrypt(String text) {
        text = text.toUpperCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                int position = ALPHABET.indexOf(c);
                position = rotorEncrypt(position);
                position = reflectorEncrypt(position);
                position = rotorDecrypt(position);
                int keyPosition = ALPHABET.indexOf(key.charAt(i % key.length()));
                position = (position - keyPosition + ALPHABET.length()) % ALPHABET.length();
                result.append(ALPHABET.charAt(position));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private int rotorEncrypt(int position) {
        return ROTOR_WIRING[position];
    }

    private int rotorDecrypt(int position) {
        for (int i = 0; i < ROTOR_WIRING.length; i++) {
            if (ROTOR_WIRING[i] == position) {
                return i;
            }
        }
        return -1;
    }

    private int reflectorEncrypt(int position) {
        return REFLECTOR_WIRING[position];
    }

    // Method to encrypt byte array
    public byte[] encrypt(byte[] fileBytes) {
        StringBuilder text = new StringBuilder();
        for (byte b : fileBytes) {
            text.append((char) (b & 0xFF));
        }
        String encryptedText = encrypt(text.toString());
        return encryptedText.getBytes();
    }

    // Method to decrypt byte array
    public byte[] decrypt(byte[] fileBytes) {
        StringBuilder text = new StringBuilder();
        for (byte b : fileBytes) {
            text.append((char) (b & 0xFF));
        }
        String decryptedText = decrypt(text.toString());
        return decryptedText.getBytes();
    }
}