public class Marble {
    public static void main(String[] args) {
        int arr[]={10,7,15,4,20};
        int n=5;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[i]=(arr[i]/2);
            }
            if(arr[i]>5)
            
                System.out.println("Survive!");
                
            else
                System.out.println("Eliminated! ");

        }
    }
    
}
