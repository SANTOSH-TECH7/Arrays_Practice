public class ProdOfMidd {
    public static void main(String[] args) {
        int a=5,b=10,c=9;
        int max=(a>b)?(a>c?a:c):(b>c ? b:c);
        int min=0;
        if(a<b)
        {
            if(a<c)
                min=a;
            else
                min=c;

        }
        else
        {
            if(b<c)
                min=b;
            else
                min=c;
        }
        int mid=(a+b+c)-(min+max);
        int res=max*mid;
        System.out.println(res);
        
        
    }
}
