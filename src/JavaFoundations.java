import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaFoundations {
    public static void main(String[] args) {



        //public static void arrayLists(){
            // Arrays are a data structure that can hold a fixed number of values of a single type
           // ArrayLists is a List
           // List is an interface
            //  ArrayLists have a starting capacity of 10
            // it is still a continuous blick of memory, like an array
            // everytime it needs to resize it grows by 50%


            ArrayList<String> names = new ArrayList<>();

            // in the arrows I need to specify the type of data I want to store in the array
           // lists can only store objects, not primitives

            String[] names2 = new String[3];

            names2[0] = "Alice";
            names2[1] = "Bob";
            names2[2] = "Sue";
            //names2[3] = "Joe"; // This will throw an error -- index out of bounds

            String[] temp = new String[4];
            for (int i = 0; i < names2.length; i++){
                temp[i] = names2[i];
            }

            names2 = temp;
            names2[3] = "Joe";

            // with array lists on the other had, you just add them

            names.add("Alice");
            names.add("Bob");
            names.add("Sue");
            names.add("Joe");

            // Array.length is the max number of elements it can hold
            // ArrayList.size() is the number of elements it currently holds
            System.out.println(names2.length);
            System.out.println(names.size()); // size() is the number of elements it currently holds

            // arrays have me tell them how large I want them to be and they never change
            // ArrayLists can grow and shrink in size as needed

            System.out.println(names2[2]);
            System.out.println(names.get(2)); // can still get index out of bounds exception

        // Java has auto-boxing and auto-unboxing for primitives
        // auto-boxing is when a primitive is automatically converted to an object
        // auto-unboxing is when an object is automatically converted to a primitive
        // the object and primitive forms are two different things, but they are the same value

        // object forms of primitives
        // Integer = int
        // Short = short
        // Long = long
        // Double = double
        // Float = float
        // Boolean = boolean
        // Character = char
        // Byte = byte

        // does not throw on the heap like a normal object
        // it is stored in the stack
        Integer val = 3; // auto-boxing
        int sameVal = 3;

        // auto-unboxing
        int result = val + sameVal;

        // Lists works off of generics, and generics can only be objects
        // ArrayList<int> nums = new ArrayList<int>(); // this will not work
        // ArrayList<Integer> nums = new ArrayList<Integer>(); // this will work
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(3);
        nums.add(5);
        nums.add(62);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

            System.out.println("nums.contains(3) = " + nums.contains(3));
            System.out.println(nums.get(1));

        // remove takes the first instance of the element
        // if you want to remove a specific element, you need to use the index
        // returns a boolean as to whether or not it was successful
        nums.remove(3); // removes the element at index 3

        // arraylist is an order collection
        // it is not a sorted collection
        // maintains the order in which you add the elements

        // Collections.sort(nums); // this will not work because nums is an ArrayList of Integers


        //public static void shortCircuiting(){
            // short circuiting is when the second part of a boolean expression is not evaluated
            // if the first part of the boolean expression is enough to determine the result
//
//            Sedan cyclone = null;
//            int variable = 3;

            // if you call a method on a null object, you will get a null pointer exception
            // cyclone.start(); // this will throw a null pointer exception

//
//                val= 0;
//                val = condition % 2 == 0 ? 1 : 2;
                // this is a ternary operator
                // it is a shorthand for an if statement
                // it is a conditional operator
                // it is a one line if statement
                // if true - return the part immediately after the ?
                // if false - return the part immediately after the :
            }

        }
    }
    public static void moreArrayLists(){

        Sedan[] carArray = new Sedan[3]{new Sedan(), new Sedan(), new Sedan()};
        // this is an array of Sedans

        ArrayList<Sedan> carList = new ArrayList<Sedan>();
        // this is an ArrayList of Sedans

        carList.add(new Sedan());
        carList.add(new Sedan());

    }

    public static void linkedLists(){
        // linked lists are a data structure that can hold a variable number of values of a single type
        // linked lists are a list
        // list is an interface
        // linked lists are a collection of nodes
        // each node has a value and a reference to the next node
        // the last node has a reference to null
        // linked lists are not stored in a continuous block of memory
        // linked lists are not indexed
        // linked lists are not ordered
        // linked lists are not sorted
        // linked lists are not continuous
        // linked lists are not resizable
        // linked lists are not thread safe

        List<Sedan> carArrayist = new ArrayList<>();
        List<Sedan> carLinkedList = new LinkedList<>();

        carArrayist.add(new Sedan());
        carArrayist.add(new Sedan("black"));
        carArrayist.add(new Sedan("red"));

        carLinkedList.add(new Sedan());
        carLinkedList.add(new Sedan("black"));
        carLinkedList.add(new Sedan("red"));
        carLinkedList.add(new Sedan("blue"));

        System.out.println(carArrayist);
        System.out.println(carLinkedList);

        // LinkList implements the List methods
        System.out.println(carArrayist.size());
        System.out.println(carLinkedList.size());

        // linked lists are not indexed

        // Arraylist vs LinkedList
        /*
        ArrayLists:
        - are indexed
        - are ordered
        - are sorted
        - slow inserts and deletes
        - generally have more space than needed
        - fast random access

        LinkedLists:
        - In Java, doubly linked
        - very fact inserts and deletes

        - are not indexed
        - are not ordered
        - are not sorted
        - fast inserts and deletes
        - slow random access
         */

        System.out.println(((LinkedList<Sedan>) carLinkedList).peek());
        System.out.println(carLinkedList.peekFirst());



    }


}
