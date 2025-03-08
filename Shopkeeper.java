public class Shopkeeper {
    public static void main(String args[])
    {
        int n=19;
        int m1=3,p1=10,m2=4,p2=15;
        int mincost=Integer.MAX_VALUE;
        for(int i=0;i*m1<=n;i++)
        {
            int rem=n-(i*m1);
            if(rem%m2==0)
            {
                int b=rem/m2;
                int cost=(i*p1)+(b*p2);
                mincost=Math.min(mincost,cost);
            }
        }
        System.out.print(mincost);
    }

}
