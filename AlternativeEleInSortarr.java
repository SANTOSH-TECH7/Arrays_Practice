import java.util.*;
public class AlternativeEleInSortarr {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i+=2) //i+=2 skips one element in the array
        {
            System.out.print(arr[i]+" ");
        }
    }
}
