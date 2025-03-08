public class OptimizedTrapRainWater {
    public static void main(String[] args) {
        int arr[]={4,2,0,3,2,5};
        int n=arr.length;
        int res=0;
        int right=n-1;
        int left=0;
        int leftmax=arr[left],rightmax=arr[right];
        while(left<=right)
        {
            if(leftmax<rightmax)
            {
                int wl=leftmax;
                int tw=wl-leftmax;
                res+=tw;
                left++; 
                right--;
            }
            else if(leftmax>rightmax)
            {

            }
        }
        
        
    }
    
}
