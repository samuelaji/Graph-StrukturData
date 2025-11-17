package graph;

import java.util.LinkedList;

public class Antrian<E> {

    private LinkedList<E> antrian;

    public Antrian() {
        this.antrian = new LinkedList<E>();
    }

    public void add(E e) {
        Enqueue(e);
    }

    public E remove() {
        return Dequeue();
    }

    public void Enqueue(E e) {
        antrian.addLast(e);
    }

    public E Dequeue() {
        return antrian.removeFirst();
    }

    public boolean isEmpty() {
        return antrian.isEmpty();
    }
}