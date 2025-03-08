public class ReplacewithSum {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int n=a.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(sum-a[i]+" ");
        }
    }
    
}
