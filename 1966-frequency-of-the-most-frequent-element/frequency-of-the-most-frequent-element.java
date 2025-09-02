class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long currSum = 0;
        int maxFrequency = 0;
        
        for(int right = 0; right < nums.length; right++){
            currSum += nums[right];
            while((long)nums[right]*(right-left+1) - currSum>k){
                currSum -= nums[left];
                left++;
            }
            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }
        return maxFrequency;

    }
}