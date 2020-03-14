import java.util.*;

public class main {

    public static void main(String[] args) {
        // write your code here
        if (args.length != 2) {
            System.out.println("Invalid input!");
            return;
        }
        String s1 = args[0], s2 = args[1];
        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }
        int hash[] = new int[128];
        Arrays.fill(hash, -1);
        for (int i = 0; i < s1.length(); i++) {
            if (hash[s1.charAt(i)] == -1) {
                hash[s1.charAt(i)] = s2.charAt(i);
            } else if (hash[s1.charAt(i)] == s2.charAt(i)) {
                continue;
            } else {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
