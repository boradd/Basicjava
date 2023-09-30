package Lectureseven;

public class Switch {
    public static void daySelection(int dayNumber){
        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            case  3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
            case  5:
                System.out.println("Friday");
            case  6:
                System.out.println("Saturady");
            case 7 :
                System.out.println("Sunday");
            default:
                System.out.println(" ypur value dose't mach with our condition ");
        }
    }

    public static void main(String[] args) {
        daySelection(3);

    }
}
