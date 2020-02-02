import java.util.HashMap;
import java.util.Map;

public class OccurencesInAString
{
    //AcbAcbmmmuuu
    public static Map<Character, Integer> Occurences(String string)
    {
        Map<Character,Integer> map=new HashMap<>();
        char[] chars=string.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            if(map.containsKey(chars[i]))
            {
                int count=map.get(chars[i]);
                map.put(chars[i],count+1);
            }
            else{
                map.put(chars[i],1);
            }
        }
        return map;
    }

    public static void main(String[] args)
    {
        System.out.println(Occurences("Java Hungry"));
    }
}
