//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        
        for(int a = 0;a<nums.length;a+=1)
        {
            for(int j=0;j<nums.length;j+=1)
            {
                if (nums[a]+nums[j]== target && a!=j) 
                {
                    int[] ab = {a,j};
                    return ab;
                }
            }
        }

            
        return new int[0];
    }
}