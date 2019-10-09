
class Q6 {

    public static void main(String[] args) {

        int a[] = {2, 3, 1, 6, 5, 2, 3, 7, 8};

        int total, temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Second Largest: " + a[a.length - 2]);

    }

}
