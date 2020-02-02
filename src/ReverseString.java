public class ReverseString
{
    //I love you
    public static void reverse(String sentence)
    {
        String[] words=sentence.split(" ");
        for(int i=words.length-1;i>=0;--i)
        {
            System.out.print(words[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        reverse("I love you");
    }
}
