
// Generics
// https://docs.oracle.com/javase/tutorial/java/generics/index.html
// https://docs.oracle.com/javase/tutorial/java/generics/types.html

// They are a placeholder
// They are a way to make your code more flexible
// They are a way to make your code more reusable
// They are a way to make your code more type safe

// Generics can be any class, but not a primitive type

public class MyLinkedList<T> { /// <T> is a generic type. It is a placeholder for a type.
    // It can be any class, but not a primitive type
    // Generally denotes by
    // T - Type
    // E - Element
    // K - Key
    // N - Number
    // V - Value
    // S, U, V, etc. - 2nd, 3rd, 4th types

    // can use any of the about to demote a Generic, the letter used does not matter.

    // rough implementation singly linked list

    private class Node{
        private Node next; // reference to the next node
        private T data; // each node knows what its data is.
    }

}
