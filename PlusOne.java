
import java.util.*;
public class PlusOne {
    public static void main(String[] args) {
        int arr[]={4,9,9};
        int n=arr.length;
        int sum=0;
        StringBuilder r=new StringBuilder();
        for(int num:arr)
        {
            r.append(num);
        }
        String s=String.valueOf(r);
        int val=Integer.parseInt(s);
        sum=val+1;
        // System.out.println(sum);
        int size=String.valueOf(sum).length();
        int narr[]=new int[size];
        int i=size-1;
        while(sum>0)
        {
            int digit=sum%10;
            narr[i]=digit;
            sum=sum/10;
            i--;
        }
    
        
       
       System.out.println(Arrays.toString(narr));
       
    }
    
}
