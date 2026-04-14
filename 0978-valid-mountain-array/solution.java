class Solution {
    public boolean validMountainArray(int[] A) {
      if (A.length < 3) return false;
      int low = 0;
      int high = A.length-1;
      while (low < high) {
        if (A[low+1] > A[low]) {
          low++;
        } else if (A[high-1] > A[high]) { 
          high--;
        } else {
          break;
        }
      }
      return low != 0 && high != A.length-1 && low == high;
    }
}
