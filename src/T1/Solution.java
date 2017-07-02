package T1;

import java.util.ArrayList;

import java.util.Stack;

/**
 * Created by Robin on 2017/6/28.
 */
public class Solution {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
    public static void printLinkedList(ListNode listNode){
        System.out.print("Linked list: ");
        while (listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        printLinkedList(listNode);
       ArrayList<Integer> list =  printListFromTailToHead(listNode);


    }
}
