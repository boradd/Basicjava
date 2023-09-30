package LectureEight;

public class StringArray {
    public static void main(String[] args) {
        String Names[]={"Deep","Hardik","Meet","Kax"};
        //                0        1       2      3

        char characters[] = {'a', 'b', 'c', 'd'};

        for (int i =0; i <= Names.length -1; i++){
            System.out.println(i);

        }


        Names [3]= "Viral";
        System.out.println(Names[3]);

        for (String Name : Names) {
            System.out.println(Name);
        }

        for (char ch : characters){
            System.out.println(ch);
        }


    }
}
