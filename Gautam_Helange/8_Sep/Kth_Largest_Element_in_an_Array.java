class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(
            new Comparator<Integer>(){
                @Override
                public int compare(Integer a, Integer b){
                    return Integer.compare(b, a);
                }
            }
        );
        
        for(int num : nums)
            queue.add(num);
        
        return getKthMaxNumber(queue, k);
    }
    
    public int getKthMaxNumber(PriorityQueue<Integer> queue, int k){
        for(int i = 1; i < k; i++)
            queue.remove();
        
        return queue.remove();
    }
}
