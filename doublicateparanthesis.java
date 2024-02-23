import java.util.*;

public class doublicateparanthesis{
    public static void main(String args[]){
        String str = "((a+b))";
        String str2 = "(a+b)";

        System.out.println(isdoublicate(str));
        System.out.println(isdoublicate(str2));
    }
    public static boolean isdoublicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch==')'){

                int count =0 ;

                while(s.peek() != '('){  // if any element is between th open and close paranthesis
                    s.pop();
                    count++;
                }
                if(count<1){       // if no element is between
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }

        return false;
    }
}