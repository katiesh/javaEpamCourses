package epam.java.task7_3;

import java.util.*;
import java.util.function.Predicate;

public class Runner {
    public void run(){
        Integer[] arrInt = createArrayInt(15);
        System.out.println("Array:" + Arrays.toString(arrInt));
        //Arrays.sort(arrInt, (a,b) -> b.compareTo(a));
        Arrays.sort(arrInt, Comparator.reverseOrder());
        System.out.println("Sort:" + Arrays.toString(arrInt));
        List<String> stringList = createListStrings();
        System.out.println("List:" + stringList);
        //Collections.sort(stringList,(a,b)->b.compareTo(a));
        Collections.sort(stringList,Comparator.reverseOrder());
        System.out.println("Sorted:" + stringList);

        //74
        System.out.println("------------------------");
        System.out.println("sum=" + sum(arrInt, x -> x%2==0));
        System.out.println("sum=" + sum(arrInt, x -> x>5 && x%3==0));
        System.out.println("select:" + selectString(stringList, x->x.startsWith("d") ||
        x.startsWith("j")));

        //5
        System.out.println("--------------------");
        updateListString(stringList, x->x.toUpperCase());
        System.out.println("New list:" + stringList);
        List<String> list = Arrays.asList("", null, "   ", "  dsef");
        updateListString(list, String::toUpperCase);
        System.out.println(list);
    }

    private Integer[] createArrayInt(int size){
        Integer[] array = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    private List<String> createListStrings(){
        List<String> list = new ArrayList<>();
        for (char ch = 'a'; ch <='z' ; ch++) {
            list.add("" + ch + ch);
        }
        Collections.shuffle(list);
        return list;
    }

    public int sum(Integer[] array, Predicate<Integer> filter){
        int ss = 0;
        for (Integer value : array) {
            if(filter.test(value)){
                ss += value;
            }
        }
        return ss;
    }

    public List<String> selectString(List<String> list, Predicate<String> filter){
        List<String> newList = new ArrayList<>();
        for (String str: list) {
            if(filter.test(str))
                newList.add(str);
        }
        return newList;
    }

    public void updateListString(List<String> list, ConvertString convertString){
        for (int i = 0; i < list.size() ; i++) {
            if(!convertString.isNull(list.get(i))){
                list.set(i,convertString.convert(list.get(i)));
            }
        }
    }
}
