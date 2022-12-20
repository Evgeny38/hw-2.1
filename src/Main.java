import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("TASK 5.");
        int value = 33;
        changeValue(value);
        System.out.println(value);
        System.out.println();

        System.out.println("TASK 6.");
        Integer val = 33;
        changeValue(val);
        System.out.println(val);
        System.out.println();

        System.out.println("TASK 7.");
        Integer[] integers = new Integer[]{3, 4};
        changeValue(integers);
        Arrays.stream(integers).forEach(System.out::print);
        System.out.println();

        System.out.println("TASK 8.");
        Integer[] numbers = new Integer[]{3, 4};
        changeValue1(numbers);
        Arrays.stream(numbers).forEach(System.out::print);
        System.out.println();

        System.out.println("TASK 9.");
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
        System.out.println();

        System.out.println("TASK 10.");
        person = new Person("Lyapis", "Trubetskoy");
        changePerson1(person);
        System.out.println(person);
    }

    static int changeValue(int value) {
        value = 22;
        return value;
    }

    static void changeValue(Integer value) {
        value = 22;
    }

    static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
    }

    static void changeValue1(Integer[] value) {
        value[0] = 99;
    }
    static void changePerson (Person person) {
        person = new Person("Ilia", "Lagutenko");

    }
    static void changePerson1 (Person person) {
        person.setName("Ilia");
        person.setSurname("Lagutenko");

    }

}