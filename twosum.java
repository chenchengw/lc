int[] twoSum(int[] nums, int target) {
    int[] result = new int[]{-1, -1};
    Map<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (hm.containsKey(target-nums[i])) {
            result[0] = hm.get(target-nums[i]);
            result[1] = i;
        } else {
            hm.put(nums[i], i);
        }
    }
    return result;
}
