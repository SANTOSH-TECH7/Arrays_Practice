import java.util.*;
public class RemoveElePos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int []newarr=new int[n-1];
        int pos=sc.nextInt();
        for(int i=0;i<n;i++) 
        {
            if(i<pos)
            {
                newarr[i]=arr[i];
            }
            else if(i==pos)
            {
                newarr[i]=arr[pos];
            }
            else {
                newarr[i-1]=arr[i];
            }

        }
        System.out.println(Arrays.toString(newarr));
    }
}
