public class Probability {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6};
        int newarr[]={1,2,3,4,5,6};
        int k=3;
        int l=4;
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            
            for(int j=0;j<newarr.length;j++)
            {
                int sum=arr[i]+newarr[j];
                if(sum==k || sum==l)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
