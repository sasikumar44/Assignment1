
import java.util.Scanner;

class Q7 {

    public static void main(String args[]) {

        int arr[] = new int[]{9, 3, 6, 1, 5, 2, 2};
        int pointer;
        int destination;
        System.out.println("Enter the target");
        Scanner sc = new Scanner(System.in);
        pointer = sc.nextInt();

        System.out.println("Enter the destination");
        Scanner sc1 = new Scanner(System.in);
        destination = sc1.nextInt();
        if (pointer < arr.length && destination < arr.length && pointer > -1 && destination > -1) {

            int temp = 0;
            temp = arr[pointer];
            arr[pointer] = arr[destination];
            arr[destination] = temp;

            // System.out.println(arr[pointer]+" " +arr[destination]);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
