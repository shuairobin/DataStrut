package List;

/**
 * Created by Robin on 2017/7/3.
 */
public class Solution {
    public static void printCommonPart(Node head1,Node head2){
        System.out.print("Common Part:");
        while (head1 != null && head2 != null){
            if(head1.value < head2.value){
                head1 = head1.next;

            }else if(head1.value > head2.value){
                head2 = head2.next;
            }else {
                System.out.print(head1.value + " ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        System.out.println();
    }

    public static void printList(Node node){
        while (node != null){
            System.out.println(node.next + " ");
            node = node.next;
        }

    }

    public static void main(String[] args){
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(6);
        head2.next.next.next.next = new Node(7);

        printList(head1);



    }
}
