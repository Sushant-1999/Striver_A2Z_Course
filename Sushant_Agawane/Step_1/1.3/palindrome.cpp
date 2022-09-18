class Solution {
public:
    
    int getReverse(long int num) {
        long int ans = 0;
        while(num > 0) {
            long int rem = num % 10;
            ans = (ans * 10) + rem;
            num = num / 10;
        }
        return ans;
    }
    
    
    bool isPalindrome(int x) {
        //Here we have to reverse the integer and check if no and its reverse are both equal or not.
        long int reverse = getReverse(x);
        if(x == reverse) return true;
        return false;
        
    }
};