import java.util.*;
public class Target
{
    //Pairs in the array
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the target:");
        int target=sc.nextInt();
        //initialise;
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
           for(int j=1;j<=n-1;j++)
           {
                if(arr[i]+arr[j]==target)
                {
                    System.out.printf("the pairs are:%d,%d",arr[i],arr[j]);
                }
                else System.out.print("no pairs");
           }
        }
    
    }
}
