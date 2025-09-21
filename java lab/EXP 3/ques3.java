import java.util.Scanner;

class array_oddeven{
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

        System.out.print("original array: ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        int p =0;
        int q =0;
        for(int i =0;i<n;i++){
            if(arr[i]%2==0){
                p++;
            }
            else{
                q++;
            }
        }

        System.out.println("number of even elements: "+p);
        System.out.println("number of odd elements: "+q);
        int arr_even[] = new int[p];
        int arr_odd[] = new int[q];
        int a = 0;
        int b= 0;
        for(int i =0;i<n;i++){
            if(arr[i]%2==0){
                arr_even[a] = arr[i];
                a++;
            }
            else{
                arr_odd[b] = arr[i];
                b++;
            }
        }

        System.out.println("even array: ");
        for(int j=0;j<p;j++){
            System.out.print(arr_even[j]+ " ");
        }
        System.out.println();
        System.out.println("odd array: ");
        for(int j=0;j<q;j++){
            System.out.print(arr_odd[j]+ " ");
        }
    }
}