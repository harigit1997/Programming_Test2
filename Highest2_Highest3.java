public class Highest2_Highest3 {
    public static void main(String[] args) {
        int [] arr={2,5,1,6,9,8};
        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    int swap;
                    swap=arr[j];
                    arr[j]=arr[i];
                    arr[i]=swap;
                }
            }
            System.out.println("Iteration "+(i+1));
        }
//        for(int i=0; i<arr.length; i++)
//        {
//            System.out.print(arr[i]);
//        }
        System.out.println(" 2nd Highest Element is "+arr[1]);
        System.out.println(" 3rd Highest Element is "+arr[2]);
    }
}
