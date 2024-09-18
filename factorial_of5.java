public class factorial_of5 {

    //Factorial is the multiplication of all previous numbers
    // if n = 4 : 1*2*3*4 = 24
    public static void main(String args[]) {
        int number = 5;
        int fact = 1;
        while (number > 1) {
            fact = fact * number;
            number--;
        }
        System.out.println(fact);
    }
}
