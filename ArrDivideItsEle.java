import java.util.*;
public class ArrDivideItsEle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       
        int b=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]%arr[i]==0)
                {
                    count++;
                }
            }
            // only if the arr element divides all the element in the arr
            if(count==arr.length)
            {
                b=1;//flag
                System.out.print(arr[i]);
                break;
            }
                
        }
        if(b==0)
            System.out.print("-1");
    }
}
