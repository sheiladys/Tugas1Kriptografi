package tugas1kripto;

public class ExtendedVigenereCipher {
    public String encrypt(String text, String keyword) {
        StringBuilder result = new StringBuilder();
        keyword = keyword.toUpperCase();
        int keywordIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                int shift = keyword.charAt(keywordIndex % keyword.length()) - 'A';
                if (Character.isUpperCase(c)) {
                    c = (char) ((c - 'A' + shift) % 26 + 'A');
                } else {
                    c = (char) ((c - 'a' + shift) % 26 + 'a');
                }
                keywordIndex++;
            } else if (Character.isDigit(c)) {
                int shift = keyword.charAt(keywordIndex % keyword.length()) - 'A';
                c = (char) ((c - '0' + shift) % 10 + '0');
                keywordIndex++;
            }
            result.append(c);
        }

        return result.toString();
    }

    public String decrypt(String text, String keyword) {
        StringBuilder result = new StringBuilder();
        keyword = keyword.toUpperCase();
        int keywordIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                int shift = keyword.charAt(keywordIndex % keyword.length()) - 'A';
                if (Character.isUpperCase(c)) {
                    c = (char) ((c - 'A' - shift + 26) % 26 + 'A');
                } else {
                    c = (char) ((c - 'a' - shift + 26) % 26 + 'a');
                }
                keywordIndex++;
            } else if (Character.isDigit(c)) {
                int shift = keyword.charAt(keywordIndex % keyword.length()) - 'A';
                c = (char) ((c - '0' - shift + 10) % 10 + '0');
                keywordIndex++;
            }
            result.append(c);
        }

        return result.toString();
    }
}