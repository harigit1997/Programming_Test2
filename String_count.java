//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class String_count {
    public static void main(String[] args) {
        String str="Java programming";
        int count=0;
        char [] ch= str.toCharArray();
        for(int j=0; j< ch.length; j++) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch[j]) {
                    count++;
                }
            }
            System.out.println(ch[j]+" is "+count+" times in string ");
            count=0;
        }
    }
}