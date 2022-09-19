//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function Template for C++
class Solution
{
public:
    
    long long fact(long long num) {
        if(num == 1 || num == 0) return 1;
        return fact(num * (num-1));
    }

    vector<long long> factorialNumbers(long long N)
    {
        // Write Your Code here.
        //function to find factorial of a number;
        long long ans, i;
        vector<long long> res;
        i = 1;
        do {
            
            ans = fact(i);
            res.push_back(ans);
            i++;
        }while(ans <= N);
        res.pop_back();
        return res;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        long long N;
        cin>>N;
        Solution ob;
        vector<long long> ans = ob.factorialNumbers(N);
        for(auto num : ans){
            cout<<num<<" ";
        }
        cout<<endl;
        
    }
    return 0;
}
// } Driver Code Ends