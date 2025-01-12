
import java.util.*;
public class reversearrrSingleloop
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        //initialise;
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=n-1;
        for(int i=start;i<end;i++)
        {

            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        System.out.print(Arrays.toString(arr));
        sc.close();
    }
 }