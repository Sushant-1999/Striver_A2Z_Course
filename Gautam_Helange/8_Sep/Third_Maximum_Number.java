class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(
            new Comparator<Integer>(){
                @Override
                public int compare(Integer a, Integer b){
                    return Integer.compare(b, a);
                }
            }
        );
        
        for(int num : set.toArray(new Integer[0]))
            queue.add(num);
        
        int k = 0;
        if(queue.size() < 3)
            k = 1;
        else
            k = 3;
        
        return getKthMaxNumber(queue, k);        
    }
    
    public int getKthMaxNumber(PriorityQueue<Integer> queue, int k){
        for(int i = 1; i < k; i++)
            queue.remove();
        
        return queue.remove();
    }
}
