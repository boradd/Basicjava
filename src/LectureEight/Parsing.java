package LectureEight;

public class Parsing {
    // Parsing - Primitive data type to non primitive.
    // String -> int, floot, double
    // <-
    public static void main(String[] args) {
        String Value = "20";
        int i = Integer.parseInt(Value);
        System.out.println(i);
        i++;

        float f= Float.parseFloat(Value);
        System.out.println(f);

        double d = Double.parseDouble(Value);
        System.out.println(d);

        int j= 40;
        String Value2 = String.valueOf(j);
        System.out.println("int is convert into string"+ Value2);

    }
}
