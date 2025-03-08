import java.util.*;
public class Removeduplicate {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int arr[]={1,1,2,3,4,5,5};
        int n=arr.length;
        int newarr[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                newarr[index++]=arr[i];
            }
            
            
        }
        //removes the unused spaces based on the only used index
        int []res=Arrays.copyOf(newarr,index);
        
        
        System.out.print(Arrays.toString(res));
    }
    
}
