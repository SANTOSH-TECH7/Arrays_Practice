import java.util.*;
public class MovingZerosToFront   
{
    //Zeroes to end
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int index = 0;
        //initialise;
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        int newarr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                newarr[index++]=0;
            }
            
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                newarr[index++]=arr[i];
            }
        }
        System.out.print(Arrays.toString(newarr));
        
        
        
    }
       
        
    
}
////less time and space complexity

//import java.util.*;
// public class Main    
// {
//     //Zeroes to end
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         int index = n-1;//from reverse
//         //initialise;
//         for(int i=0;i<=n-1;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         // int newarr[]=new int[n];
//         for(int i=n-1;i>=0;i--)
//         {
//             if(arr[i]!=0)
//             {
//                 arr[index--]=arr[i];//adds from re
//             }
            
//         }
//         while(index>=0)
//         {
//                 arr[index--]=0;
//         }
//         System.out.print(Arrays.toString(arr));
        
        
        
//     }
       
        
    
// }

