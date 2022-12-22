class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        int[] l = new int[26];
        for(int i =0; i<s.length(); ++i){
            l[s.charAt(i)-'a'] = i;
        }

        int i =0, st =0, e =0;

        List<Integer> a = new ArrayList<>();
        while(i<n){
            e = Math.max(e, l[s.charAt(i)-'a']);
            if(i == e){
                a.add(e-st+1);
                st = e = e+1;
            }

            ++i;
        }

        return a;
    }
}
//tc=O(n)
//sc=O(n)
