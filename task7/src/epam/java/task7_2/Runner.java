package epam.java.task7_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public void run() throws NoSuchMethodException,
                             IllegalAccessException,
                             InvocationTargetException,
                             InstantiationException {
        Class<?> clazz = UnaryOperation.class;
        Constructor constructor = clazz.getConstructor();
        UnaryOperation obj = (UnaryOperation) constructor.newInstance();
        System.out.println(obj);

        Method[] methods = clazz.getMethods();
        for (Method method:methods) {
            if(method.getName().startsWith("set")){
                method.invoke(obj, 112.1);
                System.out.println(obj);
            }
            if(method.getName().startsWith("inc")){
                method.invoke(obj);
                System.out.println(obj);
            }
            if(method.getName().startsWith("dec")){
                method.invoke(obj);
                System.out.println(obj);
            }
        }


    }

}
