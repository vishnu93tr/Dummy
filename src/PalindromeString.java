public class PalindromeString
{
    public boolean Palindrome(String string)
    {
        String reverse="";
        for(int i=string.length()-1;i>=0;i--)
        {
           reverse+= string.charAt(i);
        }
        if(reverse.equals(string))
            return true;
        return false;
    }

    public static void main(String[] args)
    {
        PalindromeString palindromeString=new PalindromeString();
        System.out.println(palindromeString.Palindrome("madam"));
        System.out.println(palindromeString.Palindrome("sehwag"));
    }
}
