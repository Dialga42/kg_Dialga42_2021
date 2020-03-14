public class main {

    public static void main(String[] args) {
        // write your code here
        String s1 = args[0], s2 = args[1];
        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }
        char hash1[] = new char[128], hash2[] = new char[128];
        for (int i = 0; i < s1.length(); i++) {
            if (hash1[s1.charAt(i)] == 0 && hash2[s2.charAt(i)] == 0) {
                hash1[s1.charAt(i)] = s2.charAt(i);
                hash2[s2.charAt(i)] = s1.charAt(i);
            } else if (hash1[s1.charAt(i)] == s2.charAt(i) && hash2[s2.charAt(i)] == s1.charAt(i)) {
                continue;
            } else {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
