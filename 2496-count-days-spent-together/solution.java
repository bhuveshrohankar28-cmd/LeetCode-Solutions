class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int aAlice = days(arriveAlice, arr);
        int lAlice = days(leaveAlice, arr);
        int aBob = days(arriveBob, arr);
        int lBob = days(leaveBob, arr);

        int start = Math.max(aAlice, aBob);
        int end = Math.min(lAlice, lBob);

        if (start > end)
            return 0;
        else
            return end - start + 1;
    }

    public int days(String date, int[] arr) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        for (int i = 0; i < month - 1; i++) {
            day += arr[i];
        }
        return day;
    }
}

