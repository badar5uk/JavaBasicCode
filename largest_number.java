public class largest_number {
    //Process: an array of integers
    // process : finds a ma value in the array
    public static void main(String args[]){
        int[] arrayofnumber = {5,200,3,400,20,1000};
        int i;
        int max = arrayofnumber[0];
        for (i=1; i <arrayofnumber.length; i++){
            if (arrayofnumber[i]>max)
                max = arrayofnumber[i];
        }
        System.out.println(max);
    }
}
