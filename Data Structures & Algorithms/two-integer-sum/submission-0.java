class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = (i + 1); j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    if (i < j) {
                        indices[0] = i;
                        indices[1] = j;
                    } else {
                        indices[0] = j;
                        indices[1] = i;
                    }
                };
            };
        };
        return indices;
    };
};
