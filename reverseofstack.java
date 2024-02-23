import java.util.*;

public class reverseofstack{
    public static void pushatbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(s,data);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushatbottom(s,top);
    }
    public static void main(String args[]){
        Stack<Integer> s =new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }
}