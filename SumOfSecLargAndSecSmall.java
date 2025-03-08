public class SumOfSecLargAndSecSmall {
    public static void main(String[] args) {
        int n=6;
        int arr[]={3,2,1,7,5,4};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                smax=max;
                max=arr[i];
        
            }
            else if(arr[i]>smax)
                smax=arr[i];
            if(arr[i]<min)
            {
                smin=min;
                min=arr[i];
            }
            else if(arr[i]<smin)
                smin=arr[i];

        }
        int sum=smin+smax;
        System.out.print(sum);
    }
    
}
