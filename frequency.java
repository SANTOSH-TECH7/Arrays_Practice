import java.util.Arrays;
import java.util.Scanner;

public class frequency {
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
        int newarr[]=new int[n];
        Arrays.sort(arr);
        int count=1;
        int max=0;
        int val=0;
        for(int i=0;i<n;i++)
        {
            count=1;
            if(arr[i]==-1)//for the new val of i then it checks for the condition
                continue;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])//as it travels along the arr 
                {
                    count++; //if equal it increases the count
                    arr[j]=-1;//for the next num assigns negative val
                } 
                
            }
            val=count;
            for(int k=0;k<=arr[i];k++)
            {
                newarr[k]
            }
            System.out.println(arr[i]+"-"+count);
            // System.out.print(" counts are:"+count);
           
        }
    }
    
}
