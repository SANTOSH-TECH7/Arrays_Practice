import java.util.*;
public class subarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,6,7,2,3,4,6,8,9,8,7,6,3,1,5};
        System.out.print("Enter the starting index");
        int start=sc.nextInt();
        System.out.print("Enter the ending index");
        int end=sc.nextInt();
        for(int i=start;i<end;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
