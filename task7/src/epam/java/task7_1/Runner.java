package epam.java.task7_1;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Runner {
    public void run() throws NoSuchFieldException,
            IllegalAccessException {
        String string = "Hello";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter string:");
//        String string = sc.nextLine();
        System.out.println(string);
        Class<?> clazz = string.getClass();
        Field field = clazz.getDeclaredField("value");
        field.setAccessible(true);
        field.set(string, "New string".toCharArray());
        System.out.println("new->" + string);
        System.out.println("Hello".equals("New string"));
    }
}
