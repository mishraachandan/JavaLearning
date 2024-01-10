public class SinglyLinkedList {
    private ListNode head;
    public static class ListNode {
        private int data;
        public ListNode nextNode;

        //Constructor
        public ListNode(int data){
            this.data = data;
            nextNode = null;
        }
    }

    public void display(){
        ListNode current  = head;
        while(current != null){
            System.out.println(current.data);
            current = current.nextNode;
        }
        System.out.println("End of the data.");
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList  = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        singlyLinkedList.head.nextNode = second;
        second.nextNode = third;
        singlyLinkedList.display();
    }
}
