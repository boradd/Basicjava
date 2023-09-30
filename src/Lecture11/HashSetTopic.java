package Lecture11;

import java.util.HashSet;
import java.util.Set;

public class HashSetTopic {
    public static void main(String[] args) {
        //ArrayList - Slower
        //LinkedList - Faster
        //Hashset


        Set<String>  StudentName = new HashSet<>();
        StudentName.add("deep");
        StudentName.add("Hardik");
        StudentName.add("Hiral");
        StudentName.add("deep");
        System.out.println(StudentName);
    }
}
