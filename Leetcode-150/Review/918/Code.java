class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum=nums[0];
        int currSum=nums[0];
        int minSum=nums[0];
        int total=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            currSum=Math.max(nums[i],currSum+nums[i]);
            maxSum=Math.max(currSum,maxSum);
            total+=nums[i];
        }

        currSum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            currSum=Math.min(nums[i],currSum+nums[i]);
            minSum=Math.min(currSum,minSum);
            
        }

        if(total-minSum==0)
        {
            return maxSum;
        }

        return Math.max(maxSum,total-minSum);
        
    }
}

public class Code{
    public static void main(String[] args) {
        int[] nums={3,1,2,4,-5};
        Solution s=new Solution();
        s.maxSubarraySumCircular(nums);
    }
}