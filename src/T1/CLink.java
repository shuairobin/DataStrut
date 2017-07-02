package T1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robin on 2017/5/18.
 */
public class CLink {
    Node head;

    public CLink(){
        head = new Node();
        head.next = null;
    }
    public void addNode(String data){
        Node p = head.next;
        if(p == null){
            Node temp = new Node(data);
            p.next = temp;
            temp.next = temp;
            return;
        }
        while(p.next != p){
            p=p.next;
        }
        Node temp = new Node(data);
        p.next = temp;
    }

    public void delNode(String data){
        Node p = head;
        if(p.next==null){
            return;
        }
        while (p.next!=null){
                if(p.next.name.equals(data)){
                p.next = p.next.next;
                break;
            }else {
                p = p.next;
            }
        }
    }

    public void display(){
        Node p = head;
        while(p.next!=null){
            System.out.println(p.next.name+"->>");
            p = p.next;
        }
    }
    public void findNode(String data){
        Node p = head;
        if(p.next==null){
            return;
        }
        while (p.next!=null){
            if(p.next.name.equals(data)){
                System.out.println("data="+p.next.name);
                break;
            }else {
                p = p.next;
            }
        }
    }

    //插入
    public void insertNode(String param,String data){
        Node p = head;
        while(p.next != null){
            if(p.next.name.equals(param)){
                Node t = p.next;
                Node insertNode = new Node(data);
                insertNode.next = t.next;
                t.next = insertNode;

                break;
            }else {
                p = p.next;
            }
        }
    }
    //链表大小
    public int size(){
        int n = 0;
        Node p = head;
        while (p.next != null){
            p = p.next;
            n++;
        }
        return n ;
    }
    public static void main(String[] args){
        CLink link = new CLink();
        link.addNode("组长");
        link.addNode("部门经理");
        link.addNode("主管副总");
        link.addNode("总经理");
        link.display();
        System.out.println("size="+link.size());
        link.delNode("部门经理");
        link.display();
        link.insertNode("组长","部门经理");
        System.out.println("=================================");
        link.display();
    }
    List<String> lits = new ArrayList<>();
List<String> lits1 = new ArrayList<>();


}
