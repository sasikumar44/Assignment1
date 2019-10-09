
import java.util.Scanner;

class Q4 {

    public static void main(String args[]) {

        System.out.println("Enter a word");
        Scanner sci = new Scanner(System.in);
        String sc = sci.nextLine();

        String reverse = "";

        char[] inputArray = sc.toCharArray();
        for (int i = inputArray.length - 1; i >= 0; i--) {
            reverse = reverse + sc.charAt(i);
        }
        if (sc.equals(reverse)) {
            System.out.println("The word is palindrome");

        } else {
            System.out.println("The word is not palindrom");
        }

    }

}
