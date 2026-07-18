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
1. Create a hashMap
    to store all duplicate node address
    {org: dup}   {2000: 9000}
2. when ever we access a node,
    if its already present in map
    we dont create a new node again, we return its address
3. start from 1st node && check if already extist in map
    create a new node for it
    return its address
4. explore its neighbours
*/

class Solution {
    HashMap<Node,Node> map=new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null){
            return node;
        }

        if(map.containsKey(node)==true){
            return map.get(node);
        }
    
        Node newnode=new Node(node.val);
        map.put(node,newnode);
        for(Node neigh: node.neighbors){
            newnode.neighbors.add(cloneGraph(neigh));
        }

        return newnode;
    }
}