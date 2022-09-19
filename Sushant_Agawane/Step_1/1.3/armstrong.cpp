//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
  
  bool checkArm(int num) {
      int no_dig = 0, sum = 0, orig = num;
      int temp = num;
      while(temp > 0) {
          no_dig++;
          temp = temp / 10;
      }
      //Now find out the total no of digits in an integer.
      while(num > 0) {
          int rem = num % 10;
          sum = sum + pow(rem,no_dig);
          num = num / 10;
      }
      return (orig == sum);
  }
  
    string armstrongNumber(int n){
        // code here.
        // Here first of all we have to calculate the number of digits in integger
        // then we nned to sum them up with power.
        bool ans;
        ans = checkArm(n);
        if(ans) return "Yes";
        return "No";
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        Solution ob;
        cout << ob.armstrongNumber(n) << endl;
    }
    return 0;
}

// } Driver Code Ends