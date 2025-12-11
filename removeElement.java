class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
         Arrays.sort(nums);
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]!=val) {
            nums[count]=nums[i];
            count++;
            }
        }
        return count;
    }
}

