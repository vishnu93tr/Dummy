import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInArray
{
    //1,1,1,1,3
    public static Set<Integer> RemoveDuplicates(int[] arr)
    {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        return set;
    }

    public static void main(String[] args)
    {
        int[] arr={1,1,1,1,3};
        System.out.println(RemoveDuplicates(arr));
    }
}
