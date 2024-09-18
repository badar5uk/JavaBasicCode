public class vowels_switch_case {
    public static void main(String sargs[]) {
        int count = 0;
        String sentence = "Real Madrid is the best club in the world";
        for (char vowels:sentence.toCharArray())
        {
            switch (vowels) {
                case 'a':
                    count++; break;
                case 'e':
                    count++; break;
                case 'i':
                    count++; break;
                case 'o':
                    count++; break;
                case 'u':
                    count++; break;
                case 'A':
                    count++; break;
                case 'E':
                    count++; break;
                case 'I':
                    count++; break;
                case 'O':
                    count++; break;
                case 'U':
                    count++; break;
            }
        }
        System.out.println(count);
    }
}
//