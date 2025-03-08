import java.util.Arrays;
import java.util.Scanner;
public class deletearr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        //initialise;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("enter the value to be deleted");
        int ins_val=sc.nextInt();
        int newarr[]=new int[n-1];
        for(int i=0;i<newarr.length+1;i++)
        {
            if(arr[i]<ins_val)
            {
                newarr[i]=arr[i];
            }
            else if(arr[i]==ins_val)
            {
                continue; //skips the deleted position or val
            }
            else{
                newarr[i-1]=arr[i];
            }
        }
        System.out.print(Arrays.toString(newarr));
    
    }
}
