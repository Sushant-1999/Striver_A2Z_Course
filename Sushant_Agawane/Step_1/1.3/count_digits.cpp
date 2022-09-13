// } Driver Code Ends
class Solution{
public:
    int evenlyDivides(int N){
        //code here.
        int count = 0, temp = N;
        while(N > 0) {
            int val = N % 10;
            if(val != 0 && temp % val == 0) count++;
            N = N / 10;
        }
        return count;
    }
};