package Oops1;

public class ConstructorTopic {
    // Constructor is a methods having same name as of class
    // it does not have return Type
    // to call the constructor - we have to create an object and it is call automatically
    // Type of Constructor
    ConstructorTopic (){
        System.out.println("This Constructor");

    }

    public static void main(String[] args) {

        ConstructorTopic constructorTopic =new ConstructorTopic();
        constructorTopic.myBarking();
        constructorTopic.needdoctor();
        constructorTopic.needwater();
        constructorTopic.needmedicine();



    }
    public static void myBarking(){
        System.out.println("Barking");

    }
     public  static void needdoctor(){
         System.out.println("bull Need Doctor");
     }

     public  static  void needwater(){
         System.out.println("bull need doctor");
     }

     public  static  void needmedicine(){
         System.out.println(" Doctor Suggest Bull is Suffering from High Fever");
     }


}
