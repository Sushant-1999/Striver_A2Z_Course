//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution
{
	public:
    int gcd(int A, int B) 
	{ 
	    // code here.
	    //here we will solve this problem using Euclidean Algorithm used for GCD 
	    // gcd(a,b) = gcd(b, a%b);
	    // so this will give us GCD with having b == 0 as return case;
	    if(B == 0) return A;
	    
	    gcd(B, A%B);
	      
	} 
};

//{ Driver Code Starts.

int main() 
{
   	int t;
    cin >> t;
    while (t--)
    {
        int A, B;
        cin >> A >> B;
        Solution ob;
       	cout <<  ob.gcd(A, B) << "\n";
    }
    return 0;
}
// } Driver Code Ends