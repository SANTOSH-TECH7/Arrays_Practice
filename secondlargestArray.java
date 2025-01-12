import java.util.*;
public class secondlargestArray {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n]; 

        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int l=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>l)
            {
                l=arr[i];
                s=l;

            }
            else if(arr[i]>s && arr[i]!=l)
            {
                s=arr[i];
            }
        }
        System.out.println("the largest element" +l);
        System.out.println("the second largest element" +s);

    }

}  
