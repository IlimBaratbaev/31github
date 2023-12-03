package dataStructures.queue;
// реализация очереди без счетчика элементов
public class QueueLong2 {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    public QueueLong2(int size) {
        maxSize = size + 1; //для решения одновременно пустой и полной очереди
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
    }
    public void insert(long num) {
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = num;
    }
    public long remove() {
        long temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        return temp;
    }
    public long peek() {
        return queArray[front];
    }
    public boolean isEmpty() {
        return (rear + 1 == front || front + maxSize -1 == rear);
    }
    public boolean isFull() {
        return (rear + 2 == front || front + maxSize - 2 == rear);
    }
    public int size() {
        if (rear >= front)
            return rear - front + 1;
        else
            return (maxSize - front) + (rear - 1);
    }
}
