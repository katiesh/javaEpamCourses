package epam.java.task7_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public void run(){
        List<Integer> integerList =
                Stream.iterate(10,n -> n+10)
                        .limit(10)
                        .map(n -> n/2)
                        .collect(Collectors.toList());
        System.out.println("List" + integerList);

        //2
        List<Person> people = createList();
        System.out.println("Before:");
        people.stream().forEach(System.out::println);
        System.out.println("After:");
        people.stream()
                .filter(p -> p.getSex() == Person.Sex.MALE && p.getAge()>=18 && p.getAge() <= 55)
                .forEach(System.out::println);
        double averageFemaleAge = people.stream()
                .filter(p->p.getSex()==Person.Sex.FEMALE)
                .mapToInt(p->p.getAge())
                .average()
                .getAsDouble();
        System.out.println("Avarage age:" + averageFemaleAge);
    }

    private List<Person> createList(){
        return Arrays.asList(
                new Person("Oleh", 34, Person.Sex.MALE),
                new Person("Ivan", 14, Person.Sex.MALE),
                new Person("Natali", 20, Person.Sex.FEMALE),
                new Person("Igor", 25, Person.Sex.MALE),
                new Person("Dasha", 37, Person.Sex.FEMALE),
                new Person("Nina", 34, Person.Sex.FEMALE),
                new Person("Viktor", 65, Person.Sex.MALE),
                new Person("Oleh", 5, Person.Sex.MALE),
                new Person("Olga", 4, Person.Sex.FEMALE),
                new Person("Oleh", 62, Person.Sex.MALE),
                new Person("Oleh", 37, Person.Sex.MALE)
        );
    }
}
