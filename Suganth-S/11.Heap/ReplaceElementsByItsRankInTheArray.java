import java.util.*;

public class Main{
	public static void main(String args[])
{
	int arr[] = {20,15,26,2,98,6};
	HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
	int temp = 1;
	int brr[]  =new int[n];
	for(int i=0; i<arr.length; i++)
	{
	  brr[i] = arr[i];
	}
	Arrays.sort(brr);
	for(int i=0; i<brr.length; i++)
	{
	   if (hm.get(brr[i]) == null) 
	    {
		    hm.put(brr[i],temp);
		    temp++;
	     }
	}
	for (int i = 0; i < n; i++) {
      System.out.print(hm.get(arr[i]) + " ");
    }
  }
}
