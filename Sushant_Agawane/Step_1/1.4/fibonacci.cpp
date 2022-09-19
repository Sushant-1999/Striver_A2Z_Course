//{ Driver Code Starts
//Initial function template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++


class Solution
{
    public:
    //Function to return list containing first n fibonacci numbers.
    
    
    vector<long long> printFibb(int n) 
    {
        //code here.
        //using recursion we will solve this fibonacci Number Problem.
        vector<long long> res;
        long long o = 1, s = 0, sum = 1, i;

    for(i = 1; i <= n; i++)
    {
       sum = o + s;
       o = s;
       s = sum;
       res.push_back(sum);
    }
        return res;
    }
};

//{ Driver Code Starts.
int main()
 {
     //taking total testcases
    int t;
    cin>>t;
    while(t--)
    {
        //taking number of elements
        int n;
        cin>>n;
        Solution obj;
        //calling function printFibb()
        vector<long long> ans = obj.printFibb(n);
        
        //printing the elements of vector
        for(long long i:ans)cout<<i<<' ';
        cout<<endl;
    }
	return 0;
}

// } Driver Code Ends