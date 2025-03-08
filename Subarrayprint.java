public class Subarrayprint {
    public static void main(String args[])
    {
        int [] arr={1,2,3,-2,5};
        int n=arr.length;
        int max=0;
        int newarr[]=new int[n+1];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<j;k++)
                {
                    int sum=arr[i]+arr[j];
                    max=sum;
                    if(sum>max)
                    {
                        for(int index=0;index<n;index++)
                        {
                            newarr[index]=arr[k];
                            System.out.print(newarr[index]+ " ");
                        }
                    }
                    // System.out.print(arr[k]+ " ");
                    
                }
                // System.out.println(max);
            }
        }
        System.out.println(max);
    }
    
}
