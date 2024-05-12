
package uts_codewars;

public class greet {
    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?" ;
    }
    
    public static void main(String[] args) {
        String name = "<name>";
        
        String greeting = greet(name);
        System.out.println(greeting);
    }
}
