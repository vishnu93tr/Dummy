import java.util.HashMap;
import java.util.Map;

public class OccurencesinArray
{
    //1,1,1,1,3
    public static Map<Integer, Integer> Occurences(int[] arr)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int count=map.get(arr[i]);
                map.put(arr[i],count+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        return  map;
    }

    public static void main(String[] args)
    {
        int[] arr={1,1,1,1,3};
        System.out.println(Occurences(arr));
    }
}
