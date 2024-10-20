public class word_count {
    public static void main(String[] args) {
        String str = "Java is fun and easy to learn";
        System.out.println("Given String is "+str);
//        char[] ch = new char[str.length()];
        String [] strArr  = new String[100];
        int start=0, end=0, l=0;
        int count = 0;
        str=str+" ";
        str= str.replace(' ', ',');
        for (int i = 0; i< str.length(); i++) {
            if(str.charAt(i)==',') {
                end=i;
                strArr[l] = str.substring(start, end);
                l++;
                start=i+1;
            }
//            if(start>end)
//            {
//                end=str.charAt(str.length()-1);
//            }
        }
        System.out.println(start);
        System.out.println(end);
        for(int i=0; i<l ;i++)
        {
            if(str.contains(strArr[i]))
            {
                count++;
            }
            System.out.println(strArr[i]+" is "+count+" times ");
            count=0;
        }
    }
}
