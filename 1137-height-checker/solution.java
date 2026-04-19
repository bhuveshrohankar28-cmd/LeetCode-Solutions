class Solution {
    public int heightChecker(int[] arr) {
        int[] freqArr =new int[101];
        for(int ele:arr) freqArr[ele]++;
        int currEle=0;
        int result=0;
        for(int ele:arr){
            while(freqArr[currEle]==0) currEle++;
            if(currEle!=ele) result++;
            freqArr[currEle]--;
        }return result;
    }

}

