class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length;i++) {
            int re = target - nums[i];

            if (map.containsKey(re)) {
                return new int[]{map.get(re),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
