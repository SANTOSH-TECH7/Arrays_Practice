import java.util.*;
public class test6    
{
    //Zeroes to end
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int nonzeroindex = 0;
        //initialise;
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int num : arr){
        if(num != 0){
            arr[nonzeroindex++] = num;
        }
    }
        while(nonzeroindex<n){//nonzero incremented value
            arr[nonzeroindex++] = 0;
        }

        for(int i : arr){
            System.out.print(i+"");
        }
        }
       
        
    
    }
