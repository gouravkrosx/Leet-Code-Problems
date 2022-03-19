class FreqStack {
    HashMap<Integer,Integer>freq;
    HashMap<Integer,Stack<Integer>>map;
    int maxFreq = 0;
    
    public FreqStack() {
       freq = new HashMap<>();
       map = new HashMap<>();
    }
    
    public void push(int val) {
       
        int f = freq.getOrDefault(val,0)+1;
        freq.put(val,f);
       
        maxFreq = Math.max(maxFreq,f);
        
        map.computeIfAbsent(f, x-> new Stack<>()).push(val);                
    }
    
    public int pop() {
        int x = map.get(maxFreq).pop();
        
        if(freq.get(x)>1){
            freq.put(x,freq.get(x)-1);
        }else{
            freq.remove(x);
        }
        
        if(map.get(maxFreq).size()==0)maxFreq--;
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */