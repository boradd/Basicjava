package LectureEight;

public class Array {

    public static void main(String[] args) {
        //Arry- collection of similar data type of variables
                // How to Print/ Use the value ? By the index+ number starts from 0.
                // How to  ge the length of arry? By using this length
                //  Change the Value
                // Print all the Values from the arry
        // for each loop

        int a = 10;
        a++;
        System.out.println(a);

        int listNumber[]= {10,20,30,40,50,60,70,80,90,100};
        //Index             0  1  2  3  4  5  6  7  8  9


        listNumber [3]=15;
        listNumber [3]++;
        System.out.println(listNumber[3]);

        listNumber[5]= listNumber[5]+ listNumber[6];
        System.out.println(listNumber[5]);

        String Name = "Deep";
        System.out.println(Name.length());

        for (int i=0;i<=9; i++){
            System.out.println(listNumber[i]);
        }
    }
}
