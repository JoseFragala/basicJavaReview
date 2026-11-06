package application;

import entities.Client;

public class App {
    public static void main(String[] args) {


        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client ("Alex", "Alex@gmai.com");
        Client c3 = new Client("Maria", "maria123@gmail.com");
        Client c4 = new Client("Maria", "maria123@gmail.com");


        String s1 = "Test";
        String s2 = "Test";


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c3.equals(c4));
        System.out.println(c3 == c4); //this compares memory references.

        System.out.println(s1 == s2); // without object it compares the content.


        
    }
}
