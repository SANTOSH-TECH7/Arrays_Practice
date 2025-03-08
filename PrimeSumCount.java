import java.util.*;
public class PrimeSumCount   
{
    public static boolean isPrime(int num)
    {
        if (num<2) return false;
        for(int i=2;i*i<=num;i++)
        {
                if(num%i==0)
                {
                    return false;
                }
            }
            return true;
    }
    //Zeroes to end
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(isPrime(i))
            {
                sum+=i;
                if (sum < n && isPrime(sum))
                {
                    count++;
                }
                if (sum >= n) {
                    break;  // Exit the loop once sum exceeds n
                }
            }
            
        }
        
        
        System.out.print(count);

    }
       
        
    
}
