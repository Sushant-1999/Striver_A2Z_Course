//User function Template for Java
class Triplet implements Comparable<Triplet>{
    int val, aPos, vPos;
    Triplet(int v, int ap, int vp)
    {
        val = v;
        aPos= ap;
        vPos = vp;
    }
    public int compareTo(Triplet t)
    {
        if(val<=t.val)
        {
            return -1;
        }
        else
            return 1;
    }
}

class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        PriorityQueue<Triplet> pq = new PriorityQueue<Triplet>();
        
        for(int i=0; i<K; i++)
        {
            pq.add(new Triplet(arr[i][0], i, 0));
        }
        
        while(pq.isEmpty() == false)
        {
            Triplet curr = pq.poll();
            arrList.add(curr.val);
            int ap = curr.aPos, vp = curr.vPos;
            if(vp+1<arr[ap].length)
            {
                pq.add(new Triplet(arr[ap][vp+1],ap,vp+1));
            }
        }
        return arrList;
    }
}
