package epam.java;


public class Main {

    public static void main(String[] args) {
        int amount = InputUtility.inputIntValueWithScanner("Enter amount of elements in list");
        int max = InputUtility.inputIntValueWithScanner("Enter maximum");
        int min = InputUtility.inputIntValueWithScanner("Enter minimum");
        Generator list = new ListGenerator(amount,max,min);
        System.out.println("List:");
        for (Integer listElement:((ListGenerator) list).getList()) {
            System.out.print(listElement +" ");
        }
        System.out.println();
        amount = InputUtility.inputIntValueWithScanner("Enter amount of elements in set");
        max = InputUtility.inputIntValueWithScanner("Enter maximum");
        min = InputUtility.inputIntValueWithScanner("Enter minimum");
        try{
            Generator set = new SetGenerator(amount, max, min);
            System.out.println("Set:");
            for (Integer setElement: ((SetGenerator) set).getSet()) {
                System.out.print(setElement +" ");
            }
        }catch(AmountOfElementsOfSetException e){
            System.err.println(e.getMessage());
        }
    }
}
