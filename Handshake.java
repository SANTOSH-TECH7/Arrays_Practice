import java.util.*;
public class Handshake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<10;i++)
        {
            sc.nextLine();
        }
        System.out.print(CountHandShake(n));
    }
    public static int CountHandShake(int a)
    {
        if(a<10)
        {
            return 0;
        }
        int totalhandshake=(a*(a-1))/2;
        int losthandshake=(10*9)/2;
        return totalhandshake-losthandshake;
    }
    
}
