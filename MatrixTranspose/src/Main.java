public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        // Matrisin boyutlarını alıyoruz.
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        // Transpoz matrisi oluşturuyoruz
        int[][] transposeMatrix = new int[numCols][numRows];

        // Matrisin transpouzunu hesaplıyoruz.
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        // Matrisin orijinalini yazdırıyoruz.
        System.out.println("Matrix:");
        printMatrix(matrix);

        // Matirisin transpozunu yazdırıyoruz.
        System.out.println("Transpose:");
        printMatrix(transposeMatrix);
    }

    // Matrisi ekrana yazdıran fonksiyon
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
