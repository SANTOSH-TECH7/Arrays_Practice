public class Ifsubsetpresent {//return truw
    public static void main(String args[])
    {
        int []a={2,4,5,6,7};
        int []b={4,7,2};
        boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println("True");
                }
            }
        }
    }
}
