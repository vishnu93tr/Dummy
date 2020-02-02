import java.util.Arrays;

public class Anagram
{
    public static boolean AreAnagram(char[] original, char[] anagram)
    {
     int n1= original.length;
     int n2=anagram.length;
     if(n1!=n2)
         return false;
        sort(original);
        sort(anagram);
         for (int i = 0; i < n1; i++)
                if(original[i]!=anagram[i])
                    return false;
                return true;
    }
    public static void sort(char[] chars)
    {
        for(int i=0;i<chars.length;i++){
            for(int j=i+1;j<chars.length;j++)
            {
                if(chars[i]<chars[j])
                {
                        swapchars(i,j,chars);
                }
            }
        }
    }
    //i=a,j=b
    //i=b,j=a
    public static void swapchars(int i,int j,char[] chars)
    {
      char temp=chars[i];//temp=a
      chars[i]=chars[j];//i=b
      chars[j]=temp;//i=a
    }

    public static void main(String[] args)
    {
        String original="abcd";
        String anagram="dabc";
        char[] ori=original.toCharArray();
        char[] ana=anagram.toCharArray();
        System.out.println( AreAnagram(ori,ana));
        System.out.println();
    }
}
