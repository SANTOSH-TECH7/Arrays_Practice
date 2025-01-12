import java.util.*;
class Main{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int digits=1;
    int res=0;
    while(digits<=n)
    {
      digits*=10;
    }
    // digits/=10;
    while(digits>0)
    {
      int digit=(int) (n/digits);
      if(digit ==2 || digit ==3 || digit ==5 || digit==7)
      {
        System.out.print(digit+" ");
      }
      n%=digits;
      digits/=10;
    }
  }
}