public class rightangle_print {
    public static void main(String args[]) {
        int maxstars = 4;
        for (int i = 0; i <= maxstars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
