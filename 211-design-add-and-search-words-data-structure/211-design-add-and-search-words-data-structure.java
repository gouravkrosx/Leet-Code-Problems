class Node {
    HashMap<Character, Node> children;
    boolean isEnd;
    Node() {
        this.children = new HashMap<>();
        this.isEnd = false;
    }
}

class WordDictionary {

    private Node root;
    
    public WordDictionary() {
        this.root = new Node();
    }
    
    public void addWord(String word) {
        Node curr = this.root;
        
        for(char ch : word.toCharArray()) {
            if(!curr.children.containsKey(ch))
                curr.children.put(ch, new Node());
            curr = curr.children.get(ch);
        }
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        return search(word, this.root, 0);
    }
    
    private boolean search(String word, Node curr, int index) {
        
        for(int i=index;i<word.length();i++) {
            char ch = word.charAt(i);
            if(ch == '.') {
                // look for the word ahead
                for(char c : curr.children.keySet()) {
                    Node trieNode = curr.children.get(c);
                    if(search(word, trieNode, i+1))
                        return true;
                }
                return false;
            } else {
                if(!curr.children.containsKey(ch))
                    return false;
                curr = curr.children.get(ch);
            }
        }
        return curr.isEnd;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */