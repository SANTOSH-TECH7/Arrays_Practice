public class Substitute {
    public static void main(String[] args) {
        int arr[]={1,100,200,1,100};
        int k=1;
        int val1=0;
        int val2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                val1=arr[i+1];
                val2=val1;
            }
            if(val1==val2)
            {
                System.out.print(val2);
                return;
            }
            System.out.println("not");
           
        }
       
    }
    
}
