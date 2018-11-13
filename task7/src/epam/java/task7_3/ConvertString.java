package epam.java.task7_3;

@FunctionalInterface
public interface ConvertString {
    String convert(String str);
    default boolean isNull(String string){
        return string == null || string.trim().equals("");
    }
}
