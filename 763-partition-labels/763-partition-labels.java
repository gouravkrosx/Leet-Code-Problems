class Solution {
    public List<Integer> partitionLabels(String S) {
          if(S == null || S.length() == 0){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        int[] map = new int[26];  // record the last index of the each char

        for(int i = 0; i < S.length(); i++){
            map[S.charAt(i)-'a'] = i;
        }
        // record the end index of the current sub string
        int last = 0;
        int start = 0;
        for(int i = 0; i < S.length(); i++){
            last = Math.max(last, map[S.charAt(i)-'a']);
            if(last == i){  //it means the max end has been reached in the curr substring hence it can be a partition
                list.add(last - start + 1);
                start = last + 1;
            }
        }
        return list;
    }
}