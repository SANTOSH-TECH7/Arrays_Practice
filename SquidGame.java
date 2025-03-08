import java.util.*;
public class SquidGame{
    public static void main(String[] args)
    {
        String comm="GRRGG";
        int arr[]={1,0,1,1,0};
        String narr[]=new String [arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]==1 && comm.charAt(i)=='R') ||(arr[i]==0 && comm.charAt(i)=='G'))
            {
                narr[i]="ELIMINATE";
            }
            else    
                narr[i]="SAFE";

        }
        for(String val:narr)
        {
            System.out.print(val+" ");
        }


    }
}
