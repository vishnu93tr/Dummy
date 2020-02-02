import java.util.Arrays;

public class SecondLargest
{
    //10,60,20,30,40
    public static int Largest(int[] arr)
    {
        Arrays.sort(arr);
        int res=arr[arr.length-2];
        return res;
    }

    public static void main(String[] args)
    {
        int[] arr={10,20,60,30,40};
        System.out.println(Largest(arr));
    }
}
