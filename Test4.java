import java.util.*;
public class Test4 {
    //Find the element in  array
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //initialise
        for(int i=0;i<=n-1;i++)
        {
            System.out.println("Enter the values");
            arr[i]=sc.nextInt();
        }
        //conditions
        System.out.print("Enter the element to find:");
        int k=sc.nextInt();
        for(int i=0;i<=arr.length-1;i++)
        {
            if(k==arr[i])
            {
                System.out.print("Is present");
                break;
            }
        }
        
            
    }
}
