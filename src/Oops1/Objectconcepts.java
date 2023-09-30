package Oops1;

public class Objectconcepts {

    int i = 10;
    int k= 20;

    public static void main(String[] args) {

        // physical entity
        // instance of class - objects
        Objectconcepts oC = new Objectconcepts();
        System.out.println(oC.i);
        System.out.println(oC.k);
        oC.k= 30;
        System.out.println(oC.k);
        oC.barking();
        oC.sleeping();
        oC.angry();
        oC.needfood();

    }
    public void barking(){
        System.out.println("Cow is Barking");

    }
    public void sleeping(){
        System.out.println("Cow Is Sleeping");
    }

    public  void  angry(){
        System.out.println("Cow is Angry");
    }
    public void needfood(){
        System.out.println("Cow need food");
    }


}

