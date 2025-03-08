import java.util.*;

class Max&min {

    public static void main(String[] args) 
    {
        int []a={1,3,5,6,3,0};
        int n=a.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.print(max);
        System.out.print(min);
    }
}
    

