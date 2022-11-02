import java.util.*;
import java.io.*;
public class K_Largest_Element{
  public static void main(String []args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int[] arr = new int[n];

       for (int i = 0; i < n; i++) {
          arr[i] = Integer.parseInt(br.readLine());
       }

       int k = Integer.parseInt(br.readLine());
       //Time complexity of priority queue is logn
       PriorityQueue<Integer>pq = new PriorityQueue<>();
       int i =0 ;
       while(i<arr.length){
         if(i<k){
           pq.add(arr[i]);
         }
         else{
           if(pq.peek() < arr[i]){
             pq.remove();
             pq.add(arr[i]);
           }
         }
         i++;
       }

      while(pq.size()>0){
         System.out.println(pq.peek());
         pq.remove();
       }

     }
}
