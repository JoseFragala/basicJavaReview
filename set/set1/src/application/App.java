package application;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
// import java.util.TreeSet;

public class App {
    public static void main(String[] args){

       // Set<String> set = new HashSet<>(); //unordered
       // Set<String> set = new TreeSet<>(); //ordered by String
       Set<String> set = new LinkedHashSet<>(); // keep the insert order

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        set.removeIf(x -> x.charAt(0) == 'T');
        

        System.out.println(set.contains("Notebook"));


        for (String p: set){
            System.out.println(p);
        }
    }
}
