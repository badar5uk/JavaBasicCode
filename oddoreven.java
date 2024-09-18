import java.util.Scanner;

public class oddoreven {
    // Input: user enters a number
    // process: check if modulus of entered value is 0
    // process : use if statement, if modulus equals zero then even, else odd
    // process:  exit if zero is entered
    public static void main(String args[]) {
        int userinp;
        do {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number:  ");
            userinp = in.nextInt();
            if(userinp ==0) {
                break;
            }else if (userinp % 2 == 0) {
                System.out.println("Your number is Even");
            } else if (userinp % 2 == 1) {
                System.out.println("Your number is Odd");
            }


        } while (userinp > 0);
    }
}

