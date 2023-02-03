package com.stasih;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Queue<T> {
    List<T> queue = new ArrayList<>();

    public void enqueue(T data) {
        queue.add(data);
    }

    public T dequeue() {
        return queue.remove(0);
    }

    public T front() {
        System.out.println(queue.get(0));
        return queue.get(0);
    }

    public T rear() {
        System.out.println(queue.get(queue.size()-1));
        return queue.get(queue.size()-1);
    }

    public boolean isEmpty() {
        if (queue.isEmpty()) {
            System.out.println("Queue is Empty.");
            return true;
        }
        System.out.println("Queue is not Empty.");
        return false;
    }
}
