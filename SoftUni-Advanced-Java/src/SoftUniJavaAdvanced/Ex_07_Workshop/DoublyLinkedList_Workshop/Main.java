package SoftUniJavaAdvanced.Ex_07_Workshop.DoublyLinkedList_Workshop;

import SoftUniJavaAdvanced.Ex_07_Workshop.DoublyLinkedList_Workshop.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();


        list.addFirst(77);
        list.addFirst(66);
        list.addFirst(55);
        list.addFirst(44);
        list.addFirst(33);
        list.addFirst(22);
        list.addFirst(11);
        list.addFirst(0);


//        System.out.println(list.get(5));

//        System.out.println(list.removeFirst());

//        System.out.println(list.removeLast());

//        list.forEach(System.out::println);

        int[] listToArr = list.toArray();


        System.out.println();               // debug
    }
}
