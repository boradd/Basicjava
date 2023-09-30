package polymorphism;

public class MethodsOverloading {

    public static void main(String[] args) {

        // Methods having same name but different parameters
        // add numbers

        MethodsOverloading methodsOverloading=new MethodsOverloading();
        methodsOverloading.addTwonumber();
        methodsOverloading.addTwonumber(10,20);
        methodsOverloading.addnumber(110,220,340);


    }

    public void addTwonumber(){

        int a=10;
        int b=20;
        System.out.println(a+b);
    }
    public void addTwonumber(int a, int b){

        System.out.println(a+b);
    }
    public void addnumber(int a, int b, int c){
        System.out.println(a+b+c);
    }


}
