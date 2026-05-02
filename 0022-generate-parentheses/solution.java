class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(n,0,0,"",list);
        return list;
    }public void generate(int n,int left,int right,String s,List<String> list){
        if(right==n) {
            list.add(s);
            return;
        }
        if(left<n) generate(n,left+1,right,s+"(",list);
        if(right<left) generate(n,left,right+1,s+")",list);

    }
}
