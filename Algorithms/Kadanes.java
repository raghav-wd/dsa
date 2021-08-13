int maxSubArray(int[] nums) {
        int n = nums.length,
            max_sum = nums[0], // using this is slow Integer.MIN_VALUE,
            cur_sum = 0;
        
        for(int i : nums){
            cur_sum += i;
            if(max_sum < cur_sum) max_sum = cur_sum;
            if(cur_sum < 0) cur_sum = 0;
        }
        return max_sum;    
    }
