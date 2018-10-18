package epam.java.model;

public class Enumaration extends Enum {

    public static final Enumaration WINTER;
    public static final Enumaration SPRING;
    public static final Enumaration SUMMER;
    public static final Enumaration AUTUMN;
    private static final Enumaration VALUES[];
    private int numOfDays;

    public static Enumaration[] values() {
        return (Enumaration[]) VALUES.clone();
    }
    public static Enumaration valueOf(String name){
        for (Enumaration value: values()) {
            if(name.equals(value.name())){
                return value;
            }
        }
        return null;
    }
    public int getNumOfDays(){
        return numOfDays;
    }

    static {
        WINTER = new Enumaration("WINTER", 0,90){
            public Object parse(String string) { return Integer.valueOf(string); }
        };
        SPRING = new Enumaration("SPRING", 0,92){
            public Object parse(String string) { return Integer.valueOf(string); }
        };
        SUMMER = new Enumaration("SUMMER", 0,92){
            public Object parse(String string) { return Integer.valueOf(string); }
        };
        AUTUMN = new Enumaration("AUTUMN", 0,91){
            public Object parse(String string) { return Integer.valueOf(string); }
        };
        VALUES = (new Enumaration[]{
                WINTER,SPRING,SUMMER,AUTUMN
        });

    }

    private Enumaration(String name, int ordinal, int numOfDays){
        super(name,ordinal);
        this.numOfDays = numOfDays;
    }

    @Override
    public String toString() {
        return super.toString() + " " + numOfDays;
    }
}
