class Solution {
    public int heightChecker(int[] heights) {
        int[] freqArr = new int[101];
        for(int ele:heights){
            freqArr[ele]++;
        }
        int currentEle=0;
        int count=0;
        for(int ele:heights){
            while(freqArr[currentEle]==0) currentEle++;
            if(currentEle!=ele) count++;
            freqArr[currentEle]--;
        }
        return count;
    }
}
