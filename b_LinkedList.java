// b) Linked List - The link shows a program to find the nth element of a linked list.  https://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/

// Find a way to find the kth to the last element of linked list ( assume length of linked list is not known) 
// Bonus 1: 
// Can you minimize the number of times you run through the loop. 

//Code
// I declare that all the solutuions given are my own and are not taken from internet or any other source
public class B_LinkList {

    B_Node head;
    static void insertAtEnd(B_LinkList l, int d)
    {
        B_Node n = new B_Node(d);
        if (l.head == null)
        {
            l.head = n;
        }
        else
        {
            B_Node ptr = l.head;
            int len = 1;
            while (ptr.next != null) {
                ptr = ptr.next;
                len++;
            }

            if (ptr.next == null) {
                ptr.next = n;
                len++;
            }
        }
    }


    static void display(B_LinkList l)
    {
        if(l.head==null)
        {
            System.out.println("linkList not present");
        }
        else
        {

            B_Node ptr=l.head;
           // System.out.println(ptr.data);
            while(ptr.next!=null)
            {
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }
    }
    static B_Node KthFromLast(B_LinkList li, int k)
    {
        B_Node ptr=li.head;
        B_Node temp=li.head;
        for(int i=1;i<=k;i++)
        {
            temp=temp.next;
        }
        while(temp.next!=null)
        {
            ptr=ptr.next;
            temp=temp.next;
        }
        return ptr;
    }
    public static void main(String[] args)
    {
        B_LinkList li=new B_LinkList();
        int temp=1;

            for(int i=0;i<=10;i++)
            {
                temp=temp+(i*temp); // just some random calculation generating a new number;
                insertAtEnd(li,temp);
            }
            System.out.println(KthFromLast(li,3).data);
            display(li);
        }

}