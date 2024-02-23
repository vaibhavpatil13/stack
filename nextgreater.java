import java.util.*;

public class nextgreater{
    public static void main(String args[]){
        int arr[] = {5,3,6,7,3,0};
        int nextg[] =  new int[arr.length];

        Stack<Integer> s =new Stack<>();

        for(int i=arr.length-1;i>=0;i--){

            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextg[i]=-1;
            }
            else{
                nextg[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for(int i=0;i<nextg.length;i++){
            System.out.print(nextg[i]+" ");
        }

    }
   
          
   
}