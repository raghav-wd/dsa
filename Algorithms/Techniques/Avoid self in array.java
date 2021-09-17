// element avoids iterating on iteself inside the nested loop
// use j != i in loop condition or if(j != i) inside inner loop
public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++)
            for(int j = 0; j<nums.length && j != i; j++){
                if(nums[i] == nums[j])
                    return true;
            }
        return false;
    }
