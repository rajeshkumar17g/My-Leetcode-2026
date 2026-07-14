/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


1. Creat hashmap to store nodes
    map { org_node: clone_node} //address
2. if node is already present in map // means its created
    return node address
3. if its not present in map
    creat a new node with org.val
    Node(org.val)
    make an entry into map
4. repeat the same process for all the neighbours
5. return the org nodes duplicate clone address

*/

class Solution {
    HashMap<Node,Node> map=new HashMap<>(); // {}

    public Node cloneGraph(Node node) {
        if(node==null){
            return node;
        }

        if(map.containsKey(node)){
            return map.get(node);
        }

        Node clone=new Node(node.val);
        map.put(node,clone);

        for(Node neigh: node.neighbors){
            clone.neighbors.add(cloneGraph(neigh));
        }

        return clone;
    }
}