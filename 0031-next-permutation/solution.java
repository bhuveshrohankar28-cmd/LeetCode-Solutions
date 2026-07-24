class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1, justGrt = 0, i = 0;
        for (i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                pivot = i - 1;
                break;
            }

        }
        if (pivot == -1) {
            reverseArr(0, n - 1, nums);
        } else {

            for (i = n - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    justGrt = i;
                    break;
                }

            }
            int temp = nums[pivot];
            nums[pivot] = nums[justGrt];
            nums[justGrt] = temp;

            int low = pivot + 1, high = n - 1;
            reverseArr(low, high, nums);
        }
    }

    public static void reverseArr(int low, int high, int[] nums) {
        while (low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}
