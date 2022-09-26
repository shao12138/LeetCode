package SuanFa_600;

public class MyCircularQueue_622 {
    private int[] element;
    private int front, rear;

    public MyCircularQueue_622(int k) {
        this.element = new int[k];
        this.front = this.rear = 0;
    }

    public boolean enQueue(int value) {
        if (this.isFull()) {
            return false;
        }
        this.element[this.rear] = value;
        this.rear = (this.rear + 1) % this.element.length;
        return true;
    }

    public boolean deQueue() {
        if (this.isEmpty()) {
            return false;
        }
        int temp = this.element[this.front];
        this.front = (this.front + 1) % this.element.length;
        return true;

    }

    public int Front() {
        return this.element[this.front];
    }

    public int Rear() {
        return this.element[(rear - 1 + this.element.length) %  this.element.length];
    }

    public boolean isEmpty() {
        return this.front == this.rear;
    }

    public boolean isFull() {
        return this.front == (this.rear + 1) % this.element.length;
    }

    public static void main(String[] args) {
        MyCircularQueue_622 circularQueue = new MyCircularQueue_622(3); // 设置长度为 3
        System.out.println(circularQueue.enQueue(1));
        System.out.println(circularQueue.enQueue(2));
        System.out.println(circularQueue.enQueue(3));
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
        System.out.println(circularQueue.isFull());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
    }
}
