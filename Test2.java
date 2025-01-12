import java.util.*;
public class Test2 {
    //Sum of elements
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        //initialise
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        //conditions
        int sum=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            sum+=arr[i];
        }
        System.out.print(sum);
            
    }
}
