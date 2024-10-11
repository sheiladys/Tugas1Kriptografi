package tugas1kripto;

public class VigenereCipher {
    public String encrypt(String text, String keyword) {
    StringBuilder result = new StringBuilder();
    text = text.toUpperCase();
    keyword = keyword.toUpperCase();
    int keywordIndex = 0;

    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);
        if (Character.isLetter(c)) {
            int shift = keyword.charAt(keywordIndex % keyword.length()) - 'A';
            c = (char) ((c - 'A' + shift) % 26 + 'A');
            keywordIndex++;
            result.append(c);
        }
    }

    return result.toString();
}

    public String decrypt(String text, String keyword) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();
        keyword = keyword.toUpperCase();
        int keywordIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                int shift = keyword.charAt(keywordIndex % keyword.length()) - 'A';
                c = (char) ((c - 'A' - shift + 26) % 26 + 'A');
                keywordIndex++;
                result.append(c);
            }
        }

        return result.toString();
    }
}