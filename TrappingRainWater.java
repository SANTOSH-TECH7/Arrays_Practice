public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[]={4,2,0,3,2,5};
        int n=arr.length;
        int res=0;
        for(int i=1;i<=n-2;i++)
        {
            int lb=arr[i];
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>lb)
                {
                    lb=arr[j];
                }
            }
            int rb=arr[i];
            for(int j=i+1;j<=n-1;j++)
            {
                if(arr[j]>rb)
                {
                    rb=arr[j];
                }
            }
            int wl=Math.min(lb,rb);
            int tw=wl-arr[i];
            res+=tw ;

        }
        System.out.print(res);
    }    
}
