import java.util.Scanner;

class array_findindex{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("RAGHAV 24CSU168");
        System.out.println("Enter length of array: ");
        int n= scan.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            System.out.print("enter element: ");
            arr[i] = scan.nextInt();
        }

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        System.out.print("enter element to find index of: ");
        int e= scan.nextInt();
        int f = 0;
        for(int i =0;i<n;i++){
            if(arr[i]==e){
                System.out.print("index of " + e + " is: " + i);
                f =1;
            }
            else{
                continue;
            }
        }
        if(f==0){
            System.out.print("-1");
        }
    }
}
