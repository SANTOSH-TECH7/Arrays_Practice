
import java.util.*;
class DuplicateEle{
    public static void main(String[] args) {
       int s1[]={1, 2, 4, 4, 2, 5, 4};
       Arrays.sort(s1);
       int count=0;
       for(int i=0;i<s1.length-1;i++)
       {
           if(i==0 || s1[i]!=s1[i-1])
           {
               if(s1[i]==s1[i+1])
               {
                 
                   
                   System.out.println("val"+s1[i]);
                   
               }
           }
           while(i<s1.length -1 && s1[i]==s1[i+1])
           {
               System.out.println("pos"+i);
               i++;
           }
           if(s1[i]==s1[i+1])
             count++;
               
       }
       System.out.println("count"+count);
       
    //   System.out.print(s3);
    }
}