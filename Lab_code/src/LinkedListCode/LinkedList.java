

public class LinkedList {
    Node head;
    LinkedList(){
        head=null;
    }
    public Node current=null;
    //INSERT  ELEMENT AT LAST TO LINKED LIST;
    public void add(int data){
        Node newNode =new Node(data);
        if(head==null){
           head=newNode;
           current=newNode;
        }
        else{
            current.next=newNode;
            current=newNode;
        }
    }
    //INSERT THE ELEMENT AT BEGINING OF LINKED LIST
    public void insertAtBeg(int data){

        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
        }
        else {

        }
    }
    public void insertAtSpecPos(int pos,int data){
        int i=1;
        Node prev= null;
        Node current=head;
        while(i<pos)
        {
            prev=current;
            current=current.next;
            i++;
        }
        Node newNode=new Node(data);
        newNode.next=current;
        prev.next=newNode;
    }
    //INSERT AFTER THE NODE
    public void insertAftNode(int val,int data){
        Node current=head;
        while(current!=null)
        {

            if(current.data==val)
            {
                 Node newNode =new Node(data);
                 newNode.next = current.next;
                 current.next = newNode;
                 return;
            }
            current=current.next;
        }
        System.out.println("Entered Element not present in the list ");
    }
    //INSERT BEFORE THE NODE
    public void insertBefNode(int val,int data){
        if(head.next==null){
            insertAtBeg(data);
        }
        Node current=head;
        Node prev =null;
        while(current!=null)
        {

            if(current.data==val)
            {
                Node newNode =new Node(data);
                prev.next=newNode;
                newNode.next = current;
                return;
            }
            prev=current;
            current=current.next;
        }
        System.out.println("Entered Element not present in the list ");
    }

    //DISPLAY THE LINKED LIST
    public void display(){
        Node current =head;
        if(head==null){
            System.out.println("Linked List is Empty");
            return ;
        }
        else{
            System.out.print("Linked List Elements:");
            while(current!=null) //ONLY CURRENT TO GET LAST ELEMENT
            {

                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
    }
    //DELETE THE LAST  NODE OF THE LINKED LIST
    public void deleteLastNode(){
        if(head==null)
        {
            System.out.println("Linked List is Empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node current=head;
        Node prev=null;
        while(current.next!=null){
            prev=current;
            current=current.next;
        }
        if(prev!=null) prev.next=null;
    }
    public void deleteAtBeg(){
//        Node current=head;
        if(head==null)
        {
            System.out.println("Linked List is Empty");
            return;
        }
        head=head.next;
    }
    public void deleteAtpos(int pos){
        int i=1;
        Node current=head;
        Node prev=null;
        while(i<pos)
        {
            prev=current;
            current=current.next;
            i++;
        }
        prev.next=current.next;
    }
    public void deleteByValue(int val){
        Node current=head;
        Node prev=null;
        while(current!=null)
        {
            if(current.data==val)
            {
                prev.next=current.next;
            }
            prev=current;
            current=current.next;
        }


    }
    public void searchByVal(int val){
        Node current=head;
        int count =0;
        while(current!=null)
        {
            count++;
            if(current.data==val)
            {
                System.out.println("Element found at pos : "+count);
            }
            current=current.next;
        }
    }
    public void AccessEleByPos(int pos){
        int i=1;
        Node current=head;
        while(i<pos)
        {
            current=current.next;
            i++;
        }
        System.out.println("Element at pos"+pos+"is : "+current.data);
    }
    public void reverse(){
        Node current =head;
        Node prev =null;

        Node post =null;
        while(current!=null)
        {
            post = current.next;
            current.next = prev;
            prev = current;
            current = post;
        }
        head =prev;
    }
    public void length(){
        Node current=head;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }
        System.out.printf("Lenght of Linked List:%d\n", count);
    }
    public void countOcc(int val){
        Node current=head;
        int count =0;
        while(current!=null)
        {
            if(current.data==val)
            {
                count++;
            }
            current=current.next;
        }
        System.out.printf("Length of Linked List:%d\n", count);
    }
    // SORT THE LINKED LIST USING BUBBLE SORT
    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            Node prev = null;

            while (current != null && current.next != null) {
                if (current.data > current.next.data) {

                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                prev = current;
                current = current.next;
            }
        } while (swapped);
    }

    // CONCATENATE TWO LINKED LISTS
    public void concatenate(LinkedList list2) {
        if (head == null) {

            head = list2.head;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = list2.head;
    }




}
