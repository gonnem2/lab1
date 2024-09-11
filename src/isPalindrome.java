public class isPalindrome {
    public static void main(String[] args) {
        for (int ind = 0; ind <= args.length - 1; ind++) {
            String s = args[ind];
            if (isPalindrome(s)){
                System.out.println(s);
            }
        }
    }

    public static String reverse(String s) {
        String sReverse = "";
        for (int index = s.length() - 1; index >= 0; index--) {
            sReverse += s.charAt(index);
        }
        return sReverse;
    }
    public static boolean isPalindrome(String s){
        if (s.equals(reverse(s))){
            return true;
        }
        return false;
    }
}