import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter
{
    //madam
    public static Character NonRepeat(String string)
    {
        Map<Character,Integer> characterIntegerMap=new LinkedHashMap<>();
        for(int i=0;i<string.length();i++)
        {
            Character  c=string.charAt(i);
            if(characterIntegerMap.containsKey(c)){
                int count=characterIntegerMap.get(c);
                characterIntegerMap.put(c,count+1);
            }
            else{
                characterIntegerMap.put(c,1);
            }
        }
        for(int i=0;i<string.length();i++)
        {
            Character c=string.charAt(i);
            if(characterIntegerMap.get(c)==1)
                return c;
        }

        return null;
    }

    public static void main(String[] args)
    {
        System.out.println( NonRepeat("ppppphmp"));
    }
}
