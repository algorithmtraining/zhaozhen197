import java.util.HashMap;

public class CopyRandomList {
    public Node copyRandomList(Node head) {

        if(head == null){
            return null;
        }
        HashMap<Node,Node> nodeRelationMap = new HashMap<>();
        Node curr =head;
        while(curr != null){    
            nodeRelationMap.put(curr,new Node(curr.val));
            curr = curr.next;
        }

        curr = head;

        while(curr != null){
            nodeRelationMap.get(curr).next = nodeRelationMap.get(curr.next);
            nodeRelationMap.get(curr).random = nodeRelationMap.get(curr.random);
            curr = curr.next;
        }
        return nodeRelationMap.get(head);
    }
}