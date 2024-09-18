import java.util.Scanner; // Import the Scanner class

public class sum_positive {
    public static void main(String args[]) {
        // INPUT: positive integer entered by user (while loop)
        // OUTPUT: Sum of all positive numbers
        // Process: if(enteredvalue > 0) add to sum
        //          if (enteredvalue == 0) exit
        int enteredvalue = 0;
        int sum = 0;
        do {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter a positive integer");
            enteredvalue = myObj.nextInt();
            if(enteredvalue > 0){
                sum = enteredvalue + sum;
            }
            System.out.println("Your sum is: " + sum);
        }while (enteredvalue != 0);
    }
}