import java.util.Scanner;
class RemoveDuplicatesArray {

    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("RAGHAV 24CSU168");
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        java.util.Arrays.sort(arr);
        int newLength = removeDuplicates(arr, arr.length);

        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
