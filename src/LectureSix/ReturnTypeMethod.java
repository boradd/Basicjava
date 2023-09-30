package LectureSix;

public class ReturnTypeMethod {
    public static void main(String[] args) {
       int outcome =  sumoftwoNumber(20,30);
        System.out.println(outcome);
        int d = divisionofTwonumber(30,5);
        System.out.println(d);
        int e =multipilactionofthreeNumber(2,4);
        System.out.println(e);


    }
    public static int sumoftwoNumber(int a, int b){
        int c= a+b;
        return c;

        }
        public static int divisionofTwonumber(int a, int b){
        int d= a+b;
        return d;
    }
        public static int multipilactionofthreeNumber(int a, int b){
        int e= a*b;
        return e;
        }

}
