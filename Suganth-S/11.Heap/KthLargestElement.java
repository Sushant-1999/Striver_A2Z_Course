class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue pq = new PriorityQueue<>();
        for(int ele:nums)
        {
            pq.offer(ele);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        return(int) pq.peek();
    }
}
