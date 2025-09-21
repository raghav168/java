import java.util.Scanner;
class arrayreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("RAGHAV 24CSU168");
        System.out.println("Enter length of array: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        boolean visited[] = new boolean[n];
        for(int i =0;i<n;i++){
            System.out.print("enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("og array: ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        int l =0;
        int j = n-1;
        while(l<j){
            int temp = arr[l];
            arr[l] = arr[j];
            arr[j] = temp;
            l++;
            j--;
        }

        System.out.println("reversed array: ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
