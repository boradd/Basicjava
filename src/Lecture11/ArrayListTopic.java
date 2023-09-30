package Lecture11;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTopic {
    public static void main(String[] args) {

        //Array- collection Of Variables

        String names[]= {"Deep","Hardik","Hiral"};

        for (String name : names){
            System.out.println(name);
        }

        // ArrayList- Dyamic in Size

        ArrayList<String> nextProduct = new ArrayList<>();//Slow

        LinkedList<String> StudentName = new LinkedList<>();// fast

        nextProduct.add("Shirt ");
        nextProduct.add("T-shirt");
        nextProduct.add("Cargo");
        nextProduct.add("Nightwears");
        nextProduct.add("shoes");
        nextProduct.remove("shirt");
        nextProduct.remove(3);
        nextProduct.add(2,"shocks");
        System.out.println(nextProduct.contains("Cargo"));
        nextProduct.set(0,"Jeans");
        System.out.println(nextProduct);
    }
}
