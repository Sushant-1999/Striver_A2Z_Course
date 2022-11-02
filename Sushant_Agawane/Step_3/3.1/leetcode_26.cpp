class Solution {
public:
    int removeDuplicates(vector<int>& arr) {
        //will solve this using comparing two pointers approach
        int i = 0, j = 1, count = 1, n = arr.size();
        while(i < n-1 && n > 1) {
            if(arr[i] == arr[i+1]) {
                i++;
            }
            else if(arr[i] != arr[i+1]) {
                arr[j] = arr[i+1];
                j++; count++;
                i++;
            }
        }
        return n > 1 ? count : 1;
    }
};