class Solution {
public:
    void moveZeroes(vector<int>& arr) {
        int i = 0, j = 1, len = arr.size();
        while(j < len) {
            if(arr[i] == 0 && arr[j] != 0) {
                swap(arr[i], arr[j]);
            }
            else if(arr[i] == 0 && arr[j] == 0) {
                j++;
            }
            else if(arr[i] != 0 && arr[j] != 0) {
                i++; j++;
            }
            else if(arr[i] != 0 && arr[j] == 0) {
                i++; j++;
            }
        }
        
    }
};