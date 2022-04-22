class MyHashMap {

    final ListNode[]nodes;
    
    public MyHashMap() {
        nodes = new ListNode[10000];    
    }
    
    public void put(int key, int value) {
        int i = idx(key);
        if(nodes[i]==null){
            nodes[i]=new ListNode(-1,-1);
        }
        ListNode prev = find(nodes[i],key);
        if(prev.next==null){
            prev.next = new ListNode(key,value);
        }else{
            prev.next.val = value; //updating key's value
        }
    }
    
    public int get(int key) {
        int i = idx(key);
        if(nodes[i]==null){
            return -1;
        }else{
            ListNode prev = find(nodes[i],key);
            return (prev.next==null)?-1:prev.next.val;
        }
    }
    
    public void remove(int key) {
        int i = idx(key);
        if(nodes[i]==null){
            return;
        }else{
            ListNode prev = find(nodes[i],key);
            if(prev.next!=null){
                prev.next = prev.next.next;
            }
        }
    }
    
    public int idx(int key){return Integer.hashCode(key) % nodes.length;}
    
    public ListNode find(ListNode bucket,int key){
        ListNode node = bucket, prev = null;
        for(;node!=null && node.key!=key; node=node.next){
            prev = node;
        }
        return prev;
    }
    public class ListNode{
        int key;
        int val;
        ListNode next;
        public ListNode(int k,int v){
            key=k;
            val=v;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */