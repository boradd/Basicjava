package Lecture11;

import java.util.HashMap;

public class HashMapCollection {
    public static void main(String[] args) {

        //Hashmap - key-value pair
        // Unardered
        // KeyMust be unique




        HashMap<String,String> names = new HashMap<>();
        names.put("First","Deep");
        names.put("Second","Borad");
        names.put("Third","Dineshbhai");
        names.put("Fourth","Rameshbhai");
        names.put("Five","Borad");

        System.out.println(names);
        System.out.println(names.get("Second"));

        HashMap<String,Integer> ClothingBrand = new HashMap<>();
        ClothingBrand.put("H&M",20000000);
        ClothingBrand.put("Dior",1250000);
        ClothingBrand.put("Gucci",3650000);
        ClothingBrand.put("Prada",56478901);
        ClothingBrand.put("Amiri",95412642);

        System.out.println(ClothingBrand);
        System.out.println(ClothingBrand.get("Gucci"));


    }
}
