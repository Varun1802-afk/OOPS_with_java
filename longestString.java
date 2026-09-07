import java.util.*;

public class longestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();

        System.out.println(longestPalindrome(s));
        sc.close();
    }

    public static String longestPalindrome(String s){

        if(s.length()<=1){
            return s;
        }
        int i;
        int start=0 ,end =0;
        for(i=0;i<s.length();i++){
            int len1 = expand(s,i,i);
            int len2 = expand(s,i,i+1);

            int len = Math.max(len1, len2);
            if(len>end-start+1){
                start =  i-(len-1)/2;
                end = i+len/2;
            }

        }

        return s.substring(start,end+1);
    }

    public static int expand(String s, int left,int right){
        while(s.charAt(left) == s.charAt(right) && left >=0 && right<s.length()){
            left--;
            right++;
        }
        return right - left - 1;
    }
}