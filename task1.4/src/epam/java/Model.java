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
        int transpositions=0;
        int max=size;
        int k;
        int l;
        for (int i = 0; i <size/2 ; i++) {
            for (int j = i; j <size-i-1; j++) {
                temp=matrix[i][j];
                k=i;
                l=j;
                transpositions=0;
                while (transpositions != 4) {
                    transpositions++;
                    counter = 1;
                    while(counter!=size-i){

                        while(l<size-2*i-1 && k==i  && counter!=size-i) {
                            l++;
                            counter++;
                        }
                        while(k<size-2*i-1 &&  counter!=size-i) {
                            k++;
                            counter++;
                        }
                        while(l>i && counter!=size-i) {
                            l--;
                            counter++;
                        }
                        while(k>i && counter!=size-i) {
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
