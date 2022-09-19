#include <iostream>
#include <bits/stdc++.h>

using namespace std;



int main() {
	//code.
	int T,n, temp;
	cin >> T;
	while(T--) {
	    cin >> n;
	    int arr[n];
	    for(int i = 0; i < n; i++) {
	        cin >> temp;
	        arr[i] = temp;
	    }
	    //now taken the array, reverse it, print it using Recursion
	    for(int i = n-1; i >= 0; i--) {
	        cout << arr[i] << " ";
	    }
	    cout << endl;
	    
	}
	return 0;
}