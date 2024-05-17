package ShisirAssignment;

import java.util.Scanner;
public class DoubleLinkedList {
Node start;
public DoubleLinkedList() {
start = null;
}
public Node getNode() {
Node newNode = new Node();
Scanner input = new Scanner(System.in);
System.out.println("Enter Data: ");
newNode.data = input.nextInt();
newNode.prev = null;
newNode.next = null;
return newNode;
}

 public void insertFirst() {
 Node newNode = getNode();

if (start == null) {
 start = newNode;

 } else {

 newNode.next = start;
 start = newNode;

 }
 }

 public void insertMiddle() {
 Node newNode = getNode();
 if(start==null) {
 start=newNode;
 }
 else {

 System.out.println("\nEnter Position: ");
 Scanner inp = new Scanner(System.in);
 int position = inp.nextInt();
 int nodeCounter = nodeCounter();
 if(position>1 && position < nodeCounter) {
 int c=1;
 Node temp =start;
 while(c<position-1) {
 temp=temp.next;
 c++;
 }
 temp.next.next.prev = newNode;
 newNode.next = temp.next;
 newNode.prev = temp;
 temp.next= newNode;

 }
 }
 }

 public void insertLast() {
 Node newNode = getNode();
 if (start == null) {
 System.out.println("List Empty");
 }

 else {
 Node temp = start;

 while(temp.next != null) {

 temp= temp.next;

 }
 temp.next = newNode;
 }
 }

 public void deleteFirst() {
 if (start == null) {
 System.out.println("List empty");
 }
 else {

 start = start.next;
 }

 }

 public void deleteLast() {
 if (start == null) {
 System.out.println("List empty");

 }
 Node temp = start;
 while(temp.next.next!= null) {
 temp=temp.next;
 }

 temp.next = null;
 }

 public void deleteMiddle() {
 if (start== null) {
 System.out.println("List empty");

 }
else {

 System.out.println("\nEnter Position: ");
 Scanner inp = new Scanner(System.in);
 int position = inp.nextInt();
 int nodeCounter = nodeCounter();
 if(position>1 && position <= nodeCounter) {
 int c=1;
 Node temp =start;
 while(c<position-1) {
 temp=temp.next;
 c++;
 }

 temp.next = temp.next.next;


 }
 else {
 System.out.println("This is not middle position");
 }

}
 }
 public int nodeCounter() {
 Node temp = start;
 int ctr = 1;
 while(temp.next != null) {
 temp = temp.next;
 ctr++;
 }
 return ctr;
}




 public void traverseList() {
 Node temp = start;
 if (start == null) {
 System.out.println("Double linked list is empty");
 return;
 }
 System.out.println("\n\nNodes of double linked list: ");
 while (temp != null) {
 System.out.print(temp.data + " <--> ");
 temp = temp.next;

 }

 }
 public void checkList() {
 Node newNode = getNode();
 Node temp = start;
 while(temp!=null) {
 if(temp.data==newNode.data) {
 System.out.println("already exist");
 }
 temp = temp.next;
 }
}

}