import java.util.*;

class InsValAtDup{
    public static void main(String[] args) {
        int arr[]={1,1,2,4,7,3,3};
        int ins_pos=3;
        int val=9;
        HashSet<Integer> unique=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            unique.add(arr[i]);
        }
        List<Integer> narr=new ArrayList();
        narr.add(ins_pos,val);
        System.out.println(narr);
    }

}
