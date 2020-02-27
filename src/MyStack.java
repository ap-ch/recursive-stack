public class MyStack {

    private Node top;
    private int capacity;

    public MyStack() {
        this.top = null;
        this.capacity = 0;
    }


    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node aux = new Node(value, this.top);
        this.top = aux;
        this.capacity++;
    }

    public int pop() {
        int num;
        if (this.isEmpty()) {
            System.out.println("Error: Stack is empty!");
            num = -9999;
        } else {
            num = this.top.getValue();
            this.top = this.top.getNext();
            this.capacity--;
        }
        return num;
    }

    public int peek() {
        int valor;
        if (this.isEmpty()) {
            System.out.println("Error: Stack is empty!");
            valor = -9999;
        } else {
            valor = this.top.getValue();
        }
        return valor;
    }

    public void removeTop() {
        if (this.isEmpty()) {
            System.out.println("Error: Stack is empty!");
        } else {
            this.top = this.top.getNext();
            this.capacity--;
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void printContents() {
        Node aux = this.top;
        System.out.println("Stack contents:");
        while (aux != null) {
            System.out.println(aux.getValue());
            aux = aux.getNext();
        }
        System.out.println("END");
    }

}

