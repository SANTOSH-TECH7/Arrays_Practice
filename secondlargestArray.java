//Option -1
// import java.util.*;
// class secondlargestArray {
//     public static void main(String[] args) {
//        int arr[]={1,2,3};
//        Arrays.sort(arr);
//        int l=arr[arr.length-1];
//        int s=arr[arr.length-2];
//        System.out.print(l+" ");
//        System.out.print(s);
       
//     }
// }
//option-2
import java.util.*;
class Main {
    public static void main(String[] args) {
       int arr[]={1,3,3,4};
       int l=Integer.MIN_VALUE;
       int s=Integer.MIN_VALUE;
    //    int t=Integer.MIN_VALUE;
       for(int num : arr)
       {
           if(num>l)
           {
            //    t=s;
               s=l;
               l=num;
           }
           else if(num>s && num!=l)
           {
            //    t=s;
               s=num;
               
           }
        //    else if(num>t && num!=s)
        //    {
        //        t=num;
        //    }
       }
       System.out.print(l+" ");
       System.out.print(s+" ");
       System.out.print(t);
       
    }
}