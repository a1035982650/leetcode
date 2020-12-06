import java.util.*;

public class NextGreaterElement2 {
	 public int[] nextGreaterElements(int[] nums) {
	        Stack<Integer> stack = new Stack();
	        int n = nums.length;
	        List<Integer> list = new ArrayList();
	        for(int i=0;i<n-1;i++){
	            if(nums[i]>=nums[i+1])
	                stack.push(nums[i]);
	            else{
	                while(!stack.empty()){
	                    stack.pop();
	                    list.add(nums[i+1]);
	                }
	            }
	        }
	        while(!stack.empty()){
	                    stack.pop();
	                    list.add(list.get(0));
	                }
	        int[] res=	new int[n];
	        for(int i=0;i<n;i++) {
	        	  res[i]=list.get(i);
	        }
	        return  res;
	    }
}
