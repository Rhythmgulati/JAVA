public class Stack {
    int[] stack = new int[10];
    int top = -1;

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(7);
        s.push(5);
        s.push(9);
        s.push(7);
        s.display();
        s.pop();
        s.display();
    }

    void push(int num) {
        if (top >= stack.length) {
            System.out.println("stack is full");
        } else {
            top++;
            stack[top] = num;
        }
    }

    void pop() {
        if (top <= -1) {
            System.out.println("stack is empty");
        } else {
            System.out.println(stack[top]);
            top--;
        }
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i]);
        }
        System.out.println();
    }
}