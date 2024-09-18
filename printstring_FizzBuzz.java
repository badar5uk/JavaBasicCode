public class printstring_FizzBuzz {
    // Input: a loop of numbers from 1 to 15
    // process: 3 if statements to divide the numbers by 3,5, and both
    //if division leaves no remainder then if statement works
    // print fiz for 3, buzz for 5 and fizzbuzz for both
    public static void main(String args[]) {
        for (int i = 1; i < 16; i++) {
            if (i% 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else  if (i% 3 == 0) {
                System.out.println("Fizz");
            }
        }
    }
}


