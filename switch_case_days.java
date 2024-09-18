import java.util.Scanner;

public class switch_case_days {
    public static void main(String[] args) {
        String dayname = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a day number:  ");
        int userinp = in.nextInt();
        switch (userinp) {
            case 1:
                dayname = "Sunday";
                break;
            case 2:
                dayname = "Monday";
                break;
            case 3:
                dayname = "Tuesday";
                break;
            case 4:
                dayname = "Wednesday";
                break;
            case 5:
                dayname = "Thursday";
                break;
            case 6:
                dayname = "Friday";
                break;
            case 7:
                dayname = "Saturday";
                break;
        }
        System.out.print(dayname);
    }
}


