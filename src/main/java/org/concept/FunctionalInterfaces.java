package JavaConcepts.src.main.java.org.concept;

@FunctionalInterface
interface Sum {
    public void sum(int a, int b);
}
public class FunctionalInterfaces {
    public static void main(String[] args) {
        //Creating a reference for interface
        Sum s;
        //To implement the functional interface we need lambda expressions.
        //We used the reference created for the interface and implemented the logic
        s = (a,b) -> {
            System.out.println("Result: "+ (a+b));
        };
        s.sum(10,20);
        s.sum(234, 3543);
    }
}
