import java.util.Stack;

class StackImp2 {
    int[] arr;
    int capacity;
    int top;

    StackImp2(int size) {
        top = -1;
        capacity = size;
        int[] arr = new int[capacity];
    }

    void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack is overflow");
            return;
        }
        top++;
        arr[top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is underflow");
            return Integer.MIN_VALUE;
        }
        int res = arr[top];
        top--;
        return res;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is underflow");
            return Integer.MIN_VALUE;
        }
        return arr[top];
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }


        public static void main(String[] args) {

            Stack s = new Stack();

            s.push(5);
            s.push(10);
            s.push(15);
            s.push(20);

            System.out.println(s.peek() + " Element peek ");

            System.out.println(s.pop() + " Element popped form the stack ");

            System.out.println(s.size()+ " tHE size is");

            System.out.println(s.peek()+ " Again the peek is ");
            
            System.out.println(s.isEmpty() ? "Stack is full" : "Stack is empty");

        }
    }
