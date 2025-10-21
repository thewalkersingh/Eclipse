package list;

public class ListMethods {
   public static void pringList(Node head) {
      System.out.println("All values in List");
      while (head != null) {
	 System.out.println(head.val);
	 head = head.next;
      }
   }

   public static Node createList() {
      Node n1 = new Node((int) (Math.random() * 100));
      Node n2 = new Node((int) (Math.random() * 100));
      Node n3 = new Node((int) (Math.random() * 100));
      Node n4 = new Node((int) (Math.random() * 100));
      Node n5 = new Node((int) (Math.random() * 100));
      Node n6 = new Node((int) (Math.random() * 100));
      Node n7 = new Node((int) (Math.random() * 100));
      n1.next = n2;
      n2.next = n3;
      n3.next = n4;
      n4.next = n5;
      n5.next = n6;
      n6.next = n7;
      n7.next = null;
      return n1;
   }

   public static int length(Node head) {
      Node current = head;
      int len = 0;
      if (head == null)
	 return len;
      while (current != null) {
	 len++;
	 current = current.next;
      }
      System.out.println("Length of List: " + len);
      return len;
   }

   public static Node insertAtLast(Node head, int data) {
      Node current = head;
      if (head == null)
	 return head;
      while (current != null)
	 current = current.next;
      Node toInsert = new Node(data);
      current = toInsert;
      toInsert.next = null;
      System.out.println("Node inserted with value: " + data);
      return head;
   }
}
