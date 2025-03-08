import java.util.*;
public class arrSameEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1[]={1,2,3};
        int a2[]={0,5,3};
        int a3[]={7,8,4,3};
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a2.length;j++)
            {
                for(int k=0;k<a3.length;k++)
                {
                    if(a1[i]==a2[j] && a2[j]==a3[k])
                    {
                        
                        System.out.print(a1[i]);
                    }
                  
                }
            }
        
            
        }
        
    }
    
}
