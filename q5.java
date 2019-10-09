
import java.util.Scanner;

class Q5 {

    public static void main(String args[]) {

        System.out.println("Enter first word");
        Scanner sc1 = new Scanner(System.in);
        String word1 = sc1.nextLine();

        System.out.println("Enter second word");
        Scanner sc2 = new Scanner(System.in);
        String word2 = sc2.nextLine();

        if (word1.equals(word2)) {
            System.out.println("Same Words");
        } else {
            System.out.println("Different Words");
        }
    }
}
