package epam.java.model;

public class Model {
    private int num;
    private int[] transferedNum;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int[] getTransferedNum() {
        return transferedNum;
    }

    private void moveTransferedNum( int counter){
        for(int i = counter-1; i>=0; i--){
            transferedNum[transferedNum.length-counter+i] = transferedNum[i];
            transferedNum[i]=0;
        }
    }
    public void transferToAnotherNumSystem(int numSystem){
        int counter = 0;
        switch(numSystem){
            case 2:{
                transferedNum = new int [32];
                counter=0;
                while(num!=0) {
                    counter++;
                    for(int i=counter; i>=0; i--){
                        transferedNum[i+1] = transferedNum[i];
                    }
                    transferedNum[0] = num % 2;
                    num /= 2;
                }
                moveTransferedNum(counter);
                break;
            }
            case 8:{
                transferedNum = new int[11];
                counter=0;
                while(num!=0) {
                    counter++;
                    for(int i=counter; i>=0; i--){
                        transferedNum[i+1] = transferedNum[i];
                    }
                    transferedNum[0] =(char)(num % 8);
                    num /= 8;
                }
               // moveTransferedNum(counter);
                break;
            }
            case 16:{
                transferedNum = new int[8];
                counter=0;
                while(num!=0){
                    counter++;
                    for(int i=counter; i>=0; i--){
                        transferedNum[i+1] = transferedNum[i];
                    }
                    switch (num%16){
                        case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:{
                            transferedNum[0] = (char)(num%16);
                            break;
                        }
                        case 10:{
                            transferedNum[0] = 0xA;
                            break;
                        }
                        case 11:{
                            transferedNum[0] = 0xB;
                            break;
                        }
                        case 12:{
                            transferedNum[0] = 0xC;
                            break;
                        }
                        case 13:{
                            transferedNum[0] = 0xD;
                            break;
                        }
                        case 14:{
                            transferedNum[0] = 0xE;
                            break;
                        }
                        case 15:{
                            transferedNum[0] = 0xF;
                            break;
                        }
                    }
                    num/=16;
                }
                moveTransferedNum(counter);
                break;
            }
        }
    }
}
