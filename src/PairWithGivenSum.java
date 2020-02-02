import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum
{
    //1,9,8,2,3 sum=10
    public static void Pair(int[] arr,int sum)
    {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
            int temp=sum-arr[i];
            if(set.contains(temp))
            {
                System.out.println("pair with given sum(" +sum+ ")is:"+temp +" and "+arr[i]);
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr={1,9,8,2,3};
        int sum=10;
        Pair(arr,sum);
    }
}
