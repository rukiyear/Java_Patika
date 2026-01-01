public class DiziMatrisTranspozu {
    static void main() {
        int[][] matris = {{2,4,6},{3,6,9}};

        int row = matris.length;
        int column = matris[0].length;

        int[][] transpose = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matris[i][j];
            }
        }
        System.out.println("Orijinal Matris:");
        printMatris(matris);

        System.out.println("\nTranspoz Matris:");
        printMatris(transpose);

    }
    static void printMatris(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}

