class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int maxArea=0,area=0;
        while(i<j){
            if(height[i]<height[j]){
                area=height[i]*(j-i);
                i++;
            }else {
                area=height[j]*(j-i);
                j--;
            }
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}
