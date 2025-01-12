import java.util.*;
public class test5    {
    //Missing number
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        //initialise;
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int diff=0;
        int sum=0;
        int nsum=(n*(n+1))/2;
        for(int i=0;i<=n-1;i++)
        {
            sum+=arr[i];
        }
        if(nsum>sum)
        {
            diff=nsum-sum;
        }
        else diff=sum-nsum;
        System.out.print("The missing num:"+diff);
        
        

        
    }   
}
