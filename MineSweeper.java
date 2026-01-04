import java.util.Scanner;
import java.util.Random;

public class MineSweeper {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int row, column;

        System.out.println("Satır sayısını giriniz : ");
        row = input.nextInt();
        System.out.println("Sütun sayısını giriniz : ");
        column = input.nextInt();

        while (row < 2 || column < 2) {
            System.out.println("Minimum 2x2 boyutunda matris girişi yapılabilir!");
            System.out.println("Satır sayısını giriniz : ");
            row = input.nextInt();
            System.out.println("Sütun sayısını giriniz : ");
            column = input.nextInt();
        }

        int mineNumber = (row * column) / 4;

        String[][] mineMap = new String[row][column];
        String[][] gameMap = new String[row][column];

        createMap(mineMap);
        createMap(gameMap);
        placeMines(mineMap, mineNumber);

        boolean gameOver = false;
        int openedCells = 0;
        int totalSafeCells = (row * column) - mineNumber;

        while (!gameOver) {

            printMap(gameMap);

            int a = getCoordinate("Satır");
            int b = getCoordinate("Sütun");

            while (!isValidCoordinate(a, b, row, column) || !gameMap[a][b].equals("-")) {
                System.out.println("Geçersiz veya daha önce açılmış koordinat!");
                a = getCoordinate("Satır");
                b = getCoordinate("Sütun");
            }

            if (mineMap[a][b].equals("*")) {
                System.out.println("💥 Game Over!");
                gameOver = true;
            } else {
                int count = countMines(mineMap, a, b);
                gameMap[a][b] = String.valueOf(count);
                openedCells++;
            }

            if (openedCells == totalSafeCells) {
                System.out.println("🎉 Tebrikler! Oyunu kazandınız!");
                gameOver = true;
            }
        }

        System.out.println("\nMayın Haritası:");
        printMap(mineMap);
    }

    // ---------------- METODLAR ----------------

    static void createMap(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = "-";
            }
        }
    }

    static void placeMines(String[][] mineMap, int mineNumber) {
        Random rand = new Random();
        int placed = 0;

        while (placed < mineNumber) {
            int r = rand.nextInt(mineMap.length);
            int c = rand.nextInt(mineMap[0].length);

            if (!mineMap[r][c].equals("*")) {
                mineMap[r][c] = "*";
                placed++;
            }
        }
    }

    static void printMap(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isValidCoordinate(int a, int b, int row, int column) {
        return a >= 0 && a < row && b >= 0 && b < column;
    }

    static int getCoordinate(String text) {
        System.out.println(text + " seçiniz : ");
        return input.nextInt();
    }

    static int countMines(String[][] mineMap, int a, int b) {
        int count = 0;

        for (int i = a - 1; i <= a + 1; i++) {
            for (int j = b - 1; j <= b + 1; j++) {

                if (i < 0 || i >= mineMap.length || j < 0 || j >= mineMap[0].length) {
                    continue;
                }
                if (i == a && j == b) {
                    continue;
                }
                if (mineMap[i][j].equals("*")) {
                    count++;
                }
            }
        }
        return count;
    }
}
