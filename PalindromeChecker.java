public class PalindromeChecker {
    public static void main(String[] args) {
        // Predefined string to check
        String input = "A man a plan a canal Panama"; // You can change this to any string you want to check

        // Remove spaces and convert to lowercase
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

        // Create an attractive output
        String result = cleanedInput.equals(reversedInput) 
            ? "🎉 \"" + input + "\" is a palindrome! 🎉" 
            : "❌ \"" + input + "\" is not a palindrome. ❌";

        System.out.println(result + " - Checked by Shoaib");
    }
}
