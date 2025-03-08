import java.util.*;
public class Bubblesort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // int arr[]= {2,1,3,4,5};
        // int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<=n-1;i++)
        {
            System.out.println("The sorted array are :"+arr[i]);
        }

    }

}
