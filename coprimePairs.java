public class coprimePairs {
    public static void main(String[] args) {
        int n=3;
        int arr[]={1,2,3};
        System.out.print(countPair(arr));
        
    }
    public static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static int countPair(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            
            for(int j=i+1;j<arr.length;j++)
            {
                if(gcd(arr[i],arr[j])==1)
                    count++;
            }
        }
        return count;
    }

}
