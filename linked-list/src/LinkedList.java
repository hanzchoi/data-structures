public class LinkedList {
    private Node head;

    public LinkedList(){

    }

    //Insert at the head
    public void insertAtHead(int data){
        // Create new node
        Node newNode = new Node(data);

        // make the next of this newNode to point to current head
        newNode.setNextNode(this.head);

        //then we make the head of the linked list point to the new node
        // making it the new head element
        this.head = newNode;
    }

    @Override
    public String toString(){
        String result = "{";
        Node current = this.head;

        while(current != null){
            result += current.toString() + ", ";
            current = current.getNextNode();
        }

        result += "}";
        return result;
    }
}
