class FizzBuzz{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        String newarr[]=new String [a.length];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%3==0 && a[i]%5==0)
            {
                newarr[i]="FizzBuzz";
            }
            else if(a[i]%3==0)
            {
                newarr[i]="Buzz";
            }
            else if(a[i]%5==0)
            {
                newarr[i]="Fizz";
            }
            else 
            {
                newarr[i]=String.valueOf(a[i]);
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(newarr[i]+" ");
        }

    }
}