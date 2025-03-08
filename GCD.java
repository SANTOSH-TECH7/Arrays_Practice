public class GCD {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n=4;
        int arr[]={12,36,72,144};
        for(int i=0;i<n-1;i++)
        {
           int res=gcd(arr[i],arr[i+1]);
            System.out.print(res);
            return;
        }
        
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}