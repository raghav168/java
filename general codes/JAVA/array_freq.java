import java.util.Scanner;
class array_freq{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n= scan.nextInt();
        int arr[] = new int[n];
        boolean visited[] = new boolean[n];
        for(int i =0;i<n;i++){
               System.out.print("enter element: ");
               arr[i] = scan.nextInt();
        }
        for(int i =0;i<n;i++){
               if (visited[i]) continue;
               int count = 1;
               for(int j =i+1;j<n;j++){
                   if(arr[j]==arr[i]){
                     count = count +1;
                     visited[j] = true;
                   }
               }
               System.out.println("count of "+arr[i]+"= "+count);
        }
}
}