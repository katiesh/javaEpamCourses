package epam.java;

public class View {
    public static final String  INPUT_SIZE = "Enter matrix size(one positive integer number)";
    public static final String WRONG_INPUT = "Try to input another number(positive integer)";
    public static final String PRINT_MATRIX = "Matrix:";
    public static final  String PRINT_RESULT_MATRIX = "Rotated matrix:";
    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMatrix(int[][] matrix, int size){
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j <size ; j++) {
                System.out.print(matrix[i][j]+"    ");
            }
            System.out.print("\n");
        }
    }
}
