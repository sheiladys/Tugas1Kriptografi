package tugas1kripto;

public class PlayfairCipher {
    private char[][] table;

    public PlayfairCipher() {
        table = new char[5][5];
        String alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = alphabet.charAt(index++);
            }
        }
    }

    public String encrypt(String text, String keyword) {
        text = text.toUpperCase().replace("J", "I");
        keyword = keyword.toUpperCase().replace("J", "I");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (i + 1 < text.length()) {
                    char c2 = text.charAt(i + 1);
                    if (Character.isLetter(c2)) {
                        int[] pos1 = findPosition(c);
                        int[] pos2 = findPosition(c2);

                        if (pos1[0] == pos2[0]) {
                            result.append(table[pos1[0]][(pos1[1] + 1) % 5]);
                            result.append(table[pos2[0]][(pos2[1] + 1) % 5]);
                        } else if (pos1[1] == pos2[1]) {
                            result.append(table[(pos1[0] + 1) % 5][pos1[1]]);
                            result.append(table[(pos2[0] + 1) % 5][pos2[1]]);
                        } else {
                            result.append(table[pos1[0]][pos2[1]]);
                            result.append(table[pos2[0]][pos1[1]]);
                        }
                        i++;
                    } else {
                        int[] pos1 = findPosition(c);
                        result.append(table[pos1[0]][(pos1[1] + 1) % 5]);
                        result.append('X');
                    }
                } else {
                    int[] pos1 = findPosition(c);
                    result.append(table[pos1[0]][(pos1[1] + 1) % 5]);
                    result.append('X');
                }
            }
        }

        return result.toString();
    }

    public String decrypt(String text, String keyword) {
        text = text.toUpperCase().replace("J", "I");
        keyword = keyword.toUpperCase().replace("J", "I");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {
            char c1 = text.charAt(i);
            char c2 = (i + 1 < text.length()) ? text.charAt(i + 1) : 'X';

            int[] pos1 = findPosition(c1);
            int[] pos2 = findPosition(c2);

            if (pos1[0] == pos2[0]) {
                result.append(table[pos1[0]][(pos1[1] - 1 + 5) % 5]);
                result.append(table[pos2[0]][(pos2[1] - 1 + 5) % 5]);
            } else if (pos1[1] == pos2[1]) {
                result.append(table[(pos1[0] - 1 + 5) % 5][pos1[1]]);
                result.append(table[(pos2[0] - 1 + 5) % 5][pos2[1]]);
            } else {
                result.append(table[pos1[0]][pos2[1]]);
                result.append(table[pos2[0]][pos1[1]]);
            }
        }

        return result.toString();
    }

    private int[] findPosition(char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (table[i][j] == c) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}