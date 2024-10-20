public class Sum_arr {
    public static void main(String[] args) {
        int [] arr_sum= {2,5,1,6,9,8};
        int sum=0;
        for(int i=0; i< arr_sum.length; i++)
        {
            sum=sum+arr_sum[i];
        }
        System.out.println("Sum of array elements is "+sum);
    }
}
