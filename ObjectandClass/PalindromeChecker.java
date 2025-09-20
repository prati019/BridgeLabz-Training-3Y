public class PalindromeChecker {
    String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String lower = text.toLowerCase();
        String reverse = new StringBuilder(lower).reverse().toString();
        return lower.equals(reverse);
    }

    public void display() {
        if (isPalindrome()) {
            System.out.println("'" + text + "' is a Palindrome");
        } else {
            System.out.println("'" + text + "' is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("Madam");
        p.display();
    }
}
