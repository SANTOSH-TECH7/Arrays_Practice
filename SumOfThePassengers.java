import java.util.*;
public class SumOfThePassengers {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<0)
            {
                System.out.println("Invalid input");
                return;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print(sum);

    }
    
}
