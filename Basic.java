import java.util.*;
class Basic{
    //Even odd
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();//getting inputs
        }
        //Even and odd numbers

        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("Even num:"+arr[i]);
            }
            else
             System.out.println("Odd num:"+arr[i]);
        }

    }
}