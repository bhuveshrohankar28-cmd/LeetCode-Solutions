class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++){
        int k=0;
        for(int j=0;j<accounts[i].length;j++){
            k+=accounts[i][j];
        }if(k>maxWealth){
            maxWealth=k;
        }

    }return maxWealth;

        
    }
}
