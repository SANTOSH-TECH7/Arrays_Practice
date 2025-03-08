
import java.util.Arrays;

public class ProductOfSmallPair {
    public static void main(String[] args) {
        int n=7;
        int sum=9;
        int arr[]={5,2,4,3,9,7,1};
        Arrays.sort(arr);
        int mul=-1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int val=arr[i] + arr[j];
                
                if(val<sum)
                {
                    mul=arr[i] * arr[j];
                    System.out.println(mul);
                    return;
                }
            }
        }
        
    }
        
    
}
