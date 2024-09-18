public class enhanced_for_loop {
    public static void main(String args[]) {
        //Array to store values from 1 to 10
        //
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int even : numbers) {
            if (even % 2 == 0) {
                System.out.print(even + ", ");

            }
        }
    }
}
