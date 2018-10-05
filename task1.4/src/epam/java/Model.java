package epam.java;

public class Model {
    private int size;
    private int[][] matrix;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setMatrix() {
        matrix = new int[size][size];
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                matrix[i][j] =(int)(Math.random()*100-50);
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void rotateMatrix(){
        int counter;
        int temp;
        int temp2;
        int transpositions;
        int k;
        int l;
        for (int i = 0; i <size/2 ; i++) {
            for (int j = i; j <size-i-1; j++) {
                temp=matrix[i][j];
                matrix[i][j]=matrix[size-j-1][i];
                k=i;
                l=j;
                transpositions=0;
                while (transpositions != 3) {
                    transpositions++;
                    counter = 1;
                    while(counter!=size-2*i){

                        while(l<size-i-1 && k==i  && counter!=size-2*i) {
                            l++;
                            counter++;
                        }
                        while(k<size-i-1 &&  counter!=size-2*i) {
                            k++;
                            counter++;
                        }
                        while(l>i && counter!=size-2*i) {
                            l--;
                            counter++;
                        }
                        while(k>i && counter!=size-2*i) {
                            k--;
                            counter++;
                        }

                    }
                    temp2=matrix[k][l];
                    matrix[k][l]=temp;
                    temp=temp2;

                    }
                }


        }
    }
}
