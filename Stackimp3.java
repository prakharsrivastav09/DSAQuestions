import java.util.ArrayList;
import java.util.Stack;

class Stackimp3 {
    ArrayList<Integer> list = new ArrayList<>();
    
    boolean push(int x){
        
        return list.add(x);
    }
    int pop(){
        
        if (isEmpty()){
            
            System.out.println("Sorry stack is empty");
        }
        int res = list.get(list.size()-1);
        
        return list.size() - 1;
    }
    
    int peek(){
        
        return list.size() - 1;
    }
    int size(){
        
        return  list.size();
    }
    boolean isEmpty(){
        
        return list.isEmpty();
    }


    public static void main(String[] args) {
        
        Stack s = new Stack<>();
        
        s.push(5);
        
        s.push(10);
        
        s.push(15);
        
        s.push(20);

        System.out.println(s.peek());

        System.out.println(s.pop());
        
        System.out.println(s.pop());
        
        System.out.println(s.pop());
        
        System.out.println(s.pop());
        
        System.out.println(s.pop());


        System.out.println(s.size());

        System.out.println(s.pop());

        System.out.println(s.isEmpty() ?  "Stack is empty" : "Stack is not empty");
    }
}