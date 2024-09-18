public class switch_case_days {
    public static void main(String[] args) {
       String dayname = "";
        for (int day =1; day<=7; day++) {
            switch (day) {
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
            System.out.print(dayname + ", ");
        }
    }
}


