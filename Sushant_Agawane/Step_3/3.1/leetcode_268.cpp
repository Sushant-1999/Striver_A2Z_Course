class Solution {
public:
    int missingNumber(vector<int>& nums) {
        //here using maths formula
        int max = nums.size();
        int temp = (max * (max+1))/2;
        int sum = 0;
        //find sum of array elements
        for(int i = 0; i < nums.size(); i++) {
            sum = sum + nums[i];
        }
        return temp - sum;

    }
};