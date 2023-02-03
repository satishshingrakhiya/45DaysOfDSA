package com.stasih;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stack <T> {
    List<T> stack = new ArrayList<>();

    public void push(T data){
        stack.add(data);
    }

    public T pop(){
        System.out.println(stack.get(stack.size()-1));
        return stack.remove(stack.size()-1);
    }

    public T peek() {
        System.out.println(stack.get(stack.size()-1));
        return stack.get(stack.size()-1);
    }

    public boolean isEmpty(){
        if (stack.isEmpty()){
            System.out.println("Stack is Empty.");
            return true;
        }
        System.out.println("Stack is not Empty.");
        return false;
    }
}
