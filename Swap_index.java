import java.util.*;
public class Swap_index {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            
                int temp=arr[a];
                arr[a]=arr[b];
                arr[b]=temp;
            
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
