package ShisirAssignment;


public class Main{
public static void main(String[] args) {
 DoubleLinkedList dll = new DoubleLinkedList();

 System.out.println("--Linked List--");

 dll.insertFirst();
 dll.insertFirst();
 dll.insertFirst();
 dll.insertFirst();
 dll.insertFirst();
 dll.checkList();
 dll.traverseList();

 System.out.println("\nInserting at Middle: ");
 dll.insertMiddle();
 System.out.println("After Inserting at Middle: ");
 dll.traverseList();
 System.out.println("\nInserting at Last: ");
 dll.insertLast();
 System.out.println("After Inserting at Last: ");
 dll.traverseList();
 System.out.println("\n\nDelete at First: ");

 dll.deleteFirst();
 System.out.println("After Delete at First: ");
 dll.traverseList();


 System.out.println("\nDelete at Middle: ");
 dll.deleteMiddle();
 System.out.println("After Delete at Middle: ");
 dll.traverseList();

 System.out.println("\nDelete at Last: ");
 dll.deleteLast();
 System.out.println("\nAfter Delete at Last: ");
 dll.traverseList();
 }
}