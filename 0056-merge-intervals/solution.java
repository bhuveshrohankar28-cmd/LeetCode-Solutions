class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> arr = new ArrayList<int[]>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int curStart = intervals[0][0];
        int curEnd = intervals[0][1];
        for (int i = 0; i < intervals.length - 1; i++) {
            int nextStart = intervals[i + 1][0];
            int nextEnd = intervals[i + 1][1];
            if (curEnd >= nextStart) {
                curEnd = Math.max(nextEnd, curEnd);
            } else {
                arr.add(new int[] { curStart, curEnd });
                curStart = nextStart;
                curEnd = nextEnd;
            }

        }
        arr.add(new int[] { curStart, curEnd });
        return arr.toArray(new int[0][]);
        
    }
}
