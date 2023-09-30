package Lecture11;

public class ExceptionHandling {
    public static void main(String[] args) {

        // Array
        String names [] = {"Deep", "Meet", "Hardik"};

        //Exception Handling
        try {
            System.out.println(names[3]);

        } catch (Exception e) {
            System.out.println(e);



            System.out.println(names[1]);
            System.out.println(names[2]);
        }
    }
}
