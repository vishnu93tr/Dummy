public class Leaders
{
    public static void leaders(int[] arr)
    {
       int n= arr.length;
        int max_from_right=arr[n-1];
        System.out.println(max_from_right);
        for(int i=n-2;i>=0;i--)
        {
            if(max_from_right<arr[i])
            {
                max_from_right=arr[i];
                System.out.println(max_from_right+" ");
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr={100,3,10,4,3,7};
        leaders(arr);
    }
}
