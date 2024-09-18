public class for_loop {
    public static void main(String args[]) {
        //Input: for loop that goes from 1 to 10
        //process: for loop condition to skip 5
        //output: print statement to stop before 8
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int desiredoutput : numbers) {
            if(desiredoutput == 5){
                continue; // to do the next iteration right away
            }else if(desiredoutput == 8){
                break;
            }
                System.out.print(desiredoutput+ ", ");

        }
    }
}