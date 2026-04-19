class Solution {
    public int minimumSum(int num) {
        int[] digiCnt=new int[10];
        while(num>0){
            digiCnt[num%10]++;
            num/=10;
        }
        int[] sorted=new int[4];
        int pos=0;
        for(int i=0;i<=9;i++){
            while(digiCnt[i]>0){
                sorted[pos++]=i;
                digiCnt[i]--;
            }
        }return (sorted[0]*10+sorted[2])+(sorted[1]*10+sorted[3]);
}
}
