package lacoList.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main (String[] args){

        //dont allow primitive type. Int for example.
        // i cant instantiate with "new List" because it is a interface;
        // i need use a class that implements it
        List<String> list = new ArrayList<>(); 

        list.add ("Maria");
        list.add ("Alex");
        list.add ("Bob");
        list.add ("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());


        for (String names : list){
            System.out.println(names);
        }

        System.out.println("-----------------------------");
        list.removeIf(x -> x.charAt(0)  == 'M');

        for (String names : list){
            System.out.println(names);
        }

        System.out.println("-----------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Bob: " + list.indexOf("Marco"));

        System.out.println("-----------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        
        for (String names : result){
            System.out.println(names);
        }
        System.out.println("-----------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

        System.out.println("-----------------------------");
        String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name1);










    }
    
}
