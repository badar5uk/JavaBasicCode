public class switch_case_months {
    public static void main(String args[]) {
        //Input : Array of numbers with For loop that goes through 1 to 12
        //input: take the numbers for the for loop and enter into switch
        //output: print each month
        String month = "";
        for(int numbers = 1; numbers <13; numbers++){
            switch (numbers){
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "Feburary";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                case 12:
                    month = "December";
                    break;
            }
            System.out.println(month);
        }
    }
}
