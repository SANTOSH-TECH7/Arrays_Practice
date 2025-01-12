import java.util.*;
public class Pair    
{
    //Pairs in the array
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the target:");
        int target=sc.nextInt();
        int sum=0;
        //initialise;
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                // System.out.printf("there is a pair :%d,%d",arr[i],arr[i+1]);
                sum=arr[i]+arr[i+1];
            }
        }
    
    }
}
