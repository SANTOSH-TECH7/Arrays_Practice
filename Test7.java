import java.util.*;
public class Test7    
{
    //product of all the elements except the current element
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
        int product=1;
        for(int i=0;i<=n-1;i++)
        {
           product*=arr[i];
        }
        for(int i=0;i<=n-1;i++)
        {
            System.out.print(product/arr[i]+" ");
        }
        

        
        
    
    }
}
