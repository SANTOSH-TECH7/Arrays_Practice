import java.util.*;
class Rotatearray{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int newarr[]=new int[n];
        int k=1;
        int mid=k%n;
        for(int i=0;i<k;i++)
        {
            newarr[n-k+i]=arr[i];   
        }
        for(int i=k;i<n;i++)
        {
            newarr[i-k]=arr[i];
        }
        
        System.out.println(Arrays.toString(newarr));
    }
}