import java.util.*;

public class reverseofstring{
    public static void main(String args[]){
        String str ="worldcup";
        String result = reverse(str);

        System.out.println(result);

    }
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int ind =0;
        while(ind<str.length()){
            s.push(str.charAt(ind));
            ind++;
        }

        StringBuilder result = new StringBuilder("");

        while(!s.isEmpty()){
            char curr = s.pop();
            result = result.append(curr);
        }

        return result.toString();
    }
}