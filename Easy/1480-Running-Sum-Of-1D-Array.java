class Solution {

    public void main(String[] args)

    {

    int[] nums={1,2,3,4};

    int[] newnums=new int[4];

    newnums=runningSum(nums);

    System.out.println(newnums);

    }

    public int[] runningSum(int[] nums) {

            



           

            int i;

            for(i=nums.length-1;i>=0;i--)

            {

                

                for(int j=i-1;j>=0;j--)

                {

                   nums[i]=nums[i]+nums[j];

                }

            }

        

        return nums;

    }

}16