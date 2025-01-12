import java.util.Arrays;
import java.util.Scanner;
public class insert 
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
        System.out.println("enter the value to inserted");
        int ins_val=sc.nextInt();
        System.out.println("enter the position to inserted");
        int ins_pos=sc.nextInt();
        int newarr[]=new int[n+1];
        for(int i=0;i<newarr.length;i++)
        {
            if(i<ins_pos)
            {
                newarr[i]=arr[i];
            }
            else if(i==ins_pos)
            {
                newarr[i]=ins_val;
            }
            else{
                newarr[i]=arr[i-1];
            }
        }
        System.out.print(Arrays.toString(newarr));
    
    }
}
