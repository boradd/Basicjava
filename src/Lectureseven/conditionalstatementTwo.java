package Lectureseven;

public class conditionalstatementTwo {
    public static void main(String[] args) {

        int marks = 33;

        if (marks<=100&&marks>=90){
            System.out.println(" you got A1 grade");
        } else if (marks<=89&&marks>=80) {
            System.out.println(" you got A2 grade");
        } else if (marks<=79&&marks>=60) {
            System.out.println(" you got B garde ");
        } else if (marks<=59&&marks>=50) {
            System.out.println(" you got C grade");
        } else if (marks<=49&&marks>=40) {
            System.out.println(" you got D garde");
        } else if (marks<=39&&marks>=33) {
            System.out.println(" you got E grade");
        } else {
            System.out.println(" you are failed");
        }
    }
}
