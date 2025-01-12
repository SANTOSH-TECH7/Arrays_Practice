import java.util.*;
public class Test1 {
    //Majority repeated element
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
            }
        } 
            if(count>n/2)
            {
                System.out.print("Majority is:"+arr[i]);
                break;
            }   
        }
    }
}
