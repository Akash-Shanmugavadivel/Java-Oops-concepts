

public class StackByLL {
    Node head;

    StackByLL() {
        this.head = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        System.out.println("Pushed: " + data);
    }


    public void pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Popped element: " + head.data);
        head = head.next;
    }


    public void peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("The top value is: " + head.data);
    }


    public void display() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("2022503041");
        StackByLL stack = new StackByLL();
        stack.push(10);
        stack.push(20);
        stack.push(80);
        stack.display();
        stack.peek();
        stack.pop();
        stack.display();
        stack.peek();
    }
}