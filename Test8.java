import java.util.*;
public class Test8   
{
    //Count the unique elements
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
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<=n-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            
        }
        int diff;
        if(count >n)
        {
            diff=count -n;
            System.out.print(diff);
        }
        else if(n>count)
        {
            diff=n-count;
            System.out.print(diff);
        }
        else  System.out.print("No unique");
            
       
    
    }
}
