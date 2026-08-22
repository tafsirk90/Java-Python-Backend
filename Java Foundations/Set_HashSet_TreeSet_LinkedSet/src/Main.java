import java.util.*;

public class Main{
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Jane");
        names.add("Julie");
        names.add("Pop");
        names.add("John");

//        names.remove("Jane");
//
//        System.out.println(names);
//        System.out.println(names.size());
//        System.out.println(names.contains("John"));
//        names.clear();
//        System.out.println(names.isEmpty());

        for(String name : names){
            System.out.println(name);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        Set<Integer> Numbers = new HashSet<>(numbers);
        for(Integer number : Numbers){
            System.out.println(number);
        }

        Set<String> names2 = new TreeSet<>(names);
        System.out.println(names2);

        Set<String> names3 = new LinkedHashSet<>();
        names3.add("John");
        names3.add("Jane");
        names3.add("Julie");
        names3.add("Pop");
        names3.add("John");
        System.out.println(names3);
    }
}