package epam.java;

public class Model {
    private int height;
    private int[][] triangle;

    public int[][] getTriangle() {
        return triangle;
    }

    private void setTriangle(int size) {
        this.triangle = new int[size][2*size-1];
    }

    public int getHeigth() {
        return height;
    }

    public void setHeigth(int heigth) {
        this.height = heigth;
    }

    public void makeTriangle(){
        setTriangle(height);
        for (int i=0; i<height; i++){
            int temp = 0;
            for(int j=0; j<2*height-1; j++){
                if(j<height-i-1 || j>=height+i){
                    triangle[i][j]=0;
                }
                else{
                    if(j<height){
                        temp++;
                    }
                    else{
                        temp--;
                    }
                    triangle[i][j]=temp;
                }

            }
        }
    }
}
