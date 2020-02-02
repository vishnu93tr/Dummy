import java.util.HashMap;
import java.util.Map;

public class Occurences
{
    //I love love you you me
    public static Map<String, Integer> Occurences(String sentence)
    {
        Map<String,Integer> map=new HashMap<>();
        String[] words=sentence.split(" ");
        for(int i=0;i<words.length;i++)
        {
            if(map.containsKey(words[i]))
            {
                int count=map.get(words[i]);
                map.put(words[i],count+1);
            }
            else{
                map.put(words[i],1);
            }
        }
        return map;
    }

    public static void main(String[] args)
    {
        String sentence="I love love you you me";
        System.out.println(Occurences(sentence));
    }
}
