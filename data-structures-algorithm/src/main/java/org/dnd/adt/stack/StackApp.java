package org.dnd.adt.stack;

import java.util.Arrays;

public class StackApp {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(80);
        stack.push(81);
        stack.push(82);
        System.out.println("Peek - "+stack.peek());
        stack.push(83);
        stack.push(84);
        stack.push(85);
        System.out.println("Peek - "+stack.peek());
        System.out.println("Pop - "+stack.pop());
        System.out.println("Pop - "+stack.pop());
        System.out.println("Pop - "+stack.pop());
        System.out.println("Pop - "+stack.pop());
        System.out.println("Pop - "+stack.pop());
        System.out.println("Pop - "+stack.pop());
        System.out.println("Pop - "+stack.pop());

        System.out.println(reverseString("Hello"));
    }

    /**
     * reverse a string using stack ds
     * @param str
     * @return
     */
    private static String reverseString(String str){
        Stack stack = new Stack(str.length());
        str.chars().forEach(i -> stack.push(i));
        char[] a = new char[str.length()];
        int i = 0;
        while (stack.isNotEmpty()){
            a[i] = (char)stack.pop();
        }
        String reversedString = String.valueOf(a);
        return reversedString;
    }
}
