import java.util.*;
public class wrongsumAndcorrectsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[]={-1,2,-3,4,-5};
        int abssum=0;int asum=0;
        for(int i=0;i<n;i++)
        {
            abssum+=Math.abs(arr[i]);
            asum+=arr[i];
        }
        System.out.print(abssum+" "+asum);
    }
}
