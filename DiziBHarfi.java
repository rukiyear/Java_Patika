public class DiziBHarfi {
    static void main() {
        String[][] letter = new String[10][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if ( i == 0 || i == 3 || i == 6 || i == 9) {
                    letter[i][j] = " * ";
                } else if ( j == 0) {
                    letter[i][j] = " * ";
                } else if (j == 3 && i != 0 && i != 3 && i != 6 && i != 9) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
