package practice;

public class LL {

    public static class ListNode{
        private String data;
        private ListNode next;

        //Constructor for adding up the values in LL
        public ListNode(String data){
            this.data = data;
            this.next = null;
        }
    }

    //fields in LL

    //Head
    private ListNode head;


    //method to display values in LL
    public void display(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public int sizeOfLL(ListNode head){
        int count = 0;
        ListNode current = head;
        while(current != null){
            count+=1;
            current = current.next;
        }
        return count;
    }

    public void insertBegin(ListNode node){
        node.next = head;
        head = node;
    }
    public void insertEnd(ListNode node){
        // if nothing is present , then add a node and return

        if(head == null){
            insertBegin(node);
            return;
        }

        //Travel to the end
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }

    public void insertMiddle(ListNode node, int index){
        //1 > 2 > 3> 4> null
        // 1  > 2 > 5 >3> 4 > null

        // 2.next = new node
        // 5.next = existing node 4

        ListNode temp = head;

        int count = 0;
        while(count < index){
            temp = temp.next;
            count++;
        }
        ListNode nextNode = temp.next;
        temp.next = node;
        node.next = nextNode;
    }

    public static void main(String[] args) {
        LL ll = new LL();
       ll.head = new ListNode("A");
       ListNode second = new ListNode("B");
       ListNode third = new ListNode("C");
       ListNode fourth = new ListNode("D");

       ll.head.next = second;
       second.next = third;
       third.next = fourth;

//       ll.display();
//        System.out.println(ll.sizeOfLL(ll.head));
        ListNode begin = new ListNode("Begin");
        ll.insertBegin(begin);
//        ll.display();
        ListNode end = new ListNode("end");
        ll.insertEnd(end);
        ListNode newBegin = new ListNode("newBegin");
        ListNode newEnd = new ListNode("newEnd");
        ll.insertBegin(newBegin);
        ll.insertEnd(newEnd);
//        ll.display();

        ll.insertMiddle(new ListNode("Middle"), 3);
        ll.display();
    }
}
