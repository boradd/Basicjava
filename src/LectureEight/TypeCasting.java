package LectureEight;

public class TypeCasting {
    // To Store the Value of one Data Type to Different data Type;
    public static void main(String[] args) {

        //byte -> short-> long -> float -> double
        // <-
        // Wide Type Casting
       byte a =  124;
        short b ;
        b=a;
        System.out.println(b);

        // Narrow Type Casting
        a= (byte) b;
        float f= 1442.41f;
        int i= 451;
        i = (int) f;
        System.out.println(i);


    }
}
