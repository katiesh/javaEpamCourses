package epam.java;

public class View {
    public static final String INPUT_HEIGHT = "Please enter height of triangle(integer number from 1 to 9)";
    public static final String WRONG_INPUT = "Wrong input. ";
    public void printMessage(String message){
        System.out.println(message);
    }

    public void printTriangle(int[][] triangle, int height){
        for (int i = 0; i < height ; i++) {
            for (int j = 0; j <2*height-1 ; j++) {
                if(triangle[i][j]==0){
                    System.out.print(" ");
                }
                else {
                    System.out.print(triangle[i][j]);
                }

            }
            System.out.print("\n");

        }
    }
}
