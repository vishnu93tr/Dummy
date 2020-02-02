import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesinSentence
{
    //I love you you me love
    public static StringBuffer  remove(String sentence)
    {
       StringBuffer stringBuffer=new StringBuffer();
       String[] words=sentence.split(" ");
       Set<String> set=new LinkedHashSet<>();
       for(int i=0;i<words.length;i++)
       {
           set.add(words[i]);
       }
       for(String ref:set)
       {
           stringBuffer.append(ref+" ");
       }
       return stringBuffer;
    }

    public static void main(String[] args)
    {
        System.out.println(remove("I love you you you love love"));
    }
}
