import java.util.Scanner;

class MatrixOperations {

    // Function to input a matrix
    public static void inputMatrix(int[][] matrix, Scanner scan, String name) {
        System.out.println("Enter elements of " + name + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scan.nextInt();
            }
        }
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Function to add two matrices
    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int n = m1.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    // Function to subtract two matrices
    public static int[][] subtractMatrices(int[][] m1, int[][] m2) {
        int n = m1.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return result;
    }

    // Function to multiply two matrices
    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int n = m1.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }

    // Function to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of square matrix: ");
        int n = scan.nextInt();

        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];

        inputMatrix(matrix1, scan, "first matrix");
        inputMatrix(matrix2, scan, "second matrix");

        while (true) {
            System.out.println("\nChoose operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Transpose of First Matrix");
            System.out.println("5. Transpose of Second Matrix");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            int[][] result;

            switch (choice) {
                case 1:
                    result = addMatrices(matrix1, matrix2);
                    System.out.println("Result of Addition:");
                    printMatrix(result);
                    break;

                case 2:
                    result = subtractMatrices(matrix1, matrix2);
                    System.out.println("Result of Subtraction:");
                    printMatrix(result);
                    break;

                case 3:
                    result = multiplyMatrices(matrix1, matrix2);
                    System.out.println("Result of Multiplication:");
                    printMatrix(result);
                    break;

                case 4:
                    result = transposeMatrix(matrix1);
                    System.out.println("Transpose of First Matrix:");
                    printMatrix(result);
                    break;

                case 5:
                    result = transposeMatrix(matrix2);
                    System.out.println("Transpose of Second Matrix:");
                    printMatrix(result);
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}