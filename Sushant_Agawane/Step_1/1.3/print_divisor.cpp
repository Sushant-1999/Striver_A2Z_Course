//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function Template for C++
class Solution
{
public:
    long long sumOfDivisors(int N)
    {
        // Write Your Code here.
        long long ans = 0, sum = 0;
        for(int j = 1; j <= N; j++) {
            ans = 0;
            for(int i = 1; i <= sqrt(j); i++) {
                if(j % i == 0) {
                    ans = ans + i;
                    if(i != (j/i)) {
                        ans = ans + (j/i);
                    }
                }
            }
            sum = sum + ans;
        }
        return sum;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int N;
        cin>>N;
        Solution ob;
        long long ans  = ob.sumOfDivisors(N);
        cout<<ans<<endl;
    }
    return 0;
}
// } Driver Code Ends