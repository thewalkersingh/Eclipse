package list;

public class ListDemo {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Node head = ListMethods.createList();
      ListMethods.pringList(head);
      ListMethods.length(head);
      ListMethods.insertAtLast(head, 45);
      ListMethods.pringList(head);

   }

}
