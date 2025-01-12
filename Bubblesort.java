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
        int temp=0;
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<=n-1;i++)
        {
            System.out.println("The sorted array are :"+arr[i]);
        }

    }

}
