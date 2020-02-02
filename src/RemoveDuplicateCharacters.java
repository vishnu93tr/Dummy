import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters
{
    //abcabde
    private static StringBuilder removeDuplicates(String string)
    {
        StringBuilder stringBuilder=new StringBuilder();
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<string.length();i++)
        {
            set.add(string.charAt(i));
        }
        for(Character ref:set)
        {
            stringBuilder.append(ref);
        }
        return stringBuilder;
    }

    public static void main(String[] args)
    {
        System.out.println( removeDuplicates("abcabde"));
    }
}
