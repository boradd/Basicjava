package LectureSix;

public class Parameterrise {
    public static void main(String[] args) {
        sumoftwoNumber(30,50);
        sumoftwoNumber(40,20);
        sumoftwoNumber(70,100);
        substractionofTwonumber(40,30);
        substractionofTwonumber(75,76);
        substractionofTwonumber( 35,45);
        multiplicationoftwonumber(5,5);
        multiplicationoftwonumber(10,7);
        multiplicationoftwonumber(7,7);
        divisionoftwonumber(20,2);
        divisionoftwonumber(25,4);
        divisionoftwonumber(421,62);
        sumanddivisonofthreenumber(10,10,2);


    }
    public static void  sumoftwoNumber(int a, int b){
        System.out.println(a+b);
    }
    public  static  void  substractionofTwonumber(int a, int b){
        System.out.println(a-b);
    }
    public  static void multiplicationoftwonumber(int a, int b){
        System.out.println(a*b);
    }
    public  static  void divisionoftwonumber(int a, int b){
        System.out.println(a/b);
    }
    public static void sumanddivisonofthreenumber(int a, int b, int c){
        System.out.println(a+b/c);

    }
}
