
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sum3 {
    public static void main(String[] args) {
        int n=6;
        int arr[]={-1,0,1,2,-1,-4};
        int narr[]=new int[3];
        Set<String> uniqueTriplets = new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum=arr[i]+arr[j];
                for(int k=j+1;k<n;k++)
                {
                    if(sum+arr[k]==0)
                    {
                        narr[0]=arr[i];
                        narr[1]=arr[j];
                        narr[2]=arr[k];
                        Arrays.sort(narr);
                        String triplet=Arrays.toString(narr);
                        if(!uniqueTriplets.contains(triplet))
                        {
                            uniqueTriplets.add(triplet);
                            System.out.print(triplet);
                        }
                        
                    }
                    
                }
            }
        }
    }
}
