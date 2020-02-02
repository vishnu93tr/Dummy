public class LargestSumofSubArray
{
    //1,-1,10,20,-3-10,-20,15,17
    public static int LargestSum(int[] arr)
    {
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;
        for(int i=0;i<arr.length;i++)
        {
            max_ending_here=max_ending_here+arr[i];
            if(max_so_far<0){
                max_so_far=0;
            }
           else  if(max_ending_here>max_so_far)
            {
                max_so_far=max_ending_here;
            }
        }
        return max_so_far;
    }

    public static void main(String[] args)
    {
        int[] arr={1,-1,10,20,-3-10,-20,15,17};
        System.out.println(LargestSum(arr));
    }
}
