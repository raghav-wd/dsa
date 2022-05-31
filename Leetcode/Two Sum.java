// First attempt Hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.isEmpty()) {
                if (map.get(target - nums[i]) != null) {
                    arr[0] = i;
                    arr[1] = map.get(target - nums[i]);
                } else {
                    map.put(nums[i], index++);
                }
            } else {
                map.put(nums[i], index++);
            }
        }
        return arr;
    }
}