package graph;

import java.util.LinkedList;

public class Queue {

    private LinkedList<Integer> antrian;

    public Queue() {
        this.antrian = new LinkedList<>();
    }

    public void add(Integer e) {
        Enqueue(e);
    }

    public Integer remove() {
        return Dequeue();
    }

    public void Enqueue(Integer e) {
        antrian.addLast(e);
    }

    public Integer Dequeue() {
        return antrian.removeFirst();
    }

    public boolean isEmpty() {
        return antrian.isEmpty();
    }
}
