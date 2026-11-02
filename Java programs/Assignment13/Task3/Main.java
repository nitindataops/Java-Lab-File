public class Main {
    public static void main(String[] args) {
        String word = "racecar";
        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }
        if (word.equals(rev)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
