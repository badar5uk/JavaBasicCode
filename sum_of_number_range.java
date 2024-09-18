public class sum_of_number_range {
    public static void main(String args[]) {
        //Process: take a range of numbers from 1 to 50 using for loop ( increment 1)
        //if the number is divisble by two, add it to the sum of numbers
        //output: the sum of all numbers that are even:
        int numberrange;
        int sumnumber = 0;
        for (numberrange = 1; numberrange < 51; numberrange++) {
            if (numberrange % 2 == 0) {
                sumnumber = sumnumber + numberrange;
            }
        }
        System.out.print("The sum is: " + sumnumber);
    }
}
