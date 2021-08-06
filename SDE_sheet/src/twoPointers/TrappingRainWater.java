package twoPointers;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] arr = {3,1,2,4,0,1,3,2};
		System.out.println(trapRainWater(arr));
//		System.out.println(rainWater(arr));
	}
	
	/*
	** Optimal Solution: Two pointer approach 
	*/
	
	public static int trapRainWater(int[] height) {
	        
	        int n = height.length;
	        int left=0, right=n-1;
	        int res=0;
	        int maxleft=0, maxright=0;
	        
	        while(left<=right) {
	            
	            if(height[left] <= height[right]) {
	                
	                if(height[left] >= maxleft) maxleft=height[left];
	                else res+=maxleft-height[left];
	                
	                left++;
	            }
	            
	            else {
	                
	                if(height[right] >= maxright) maxright=height[right];
	                else res+=maxright-height[right];
	                
	                right--;
	            }
	        }
	        
	        return res;
	}
	 
	/*
	** Better Solution: Dynamic programming (Bottom-up) approach (Array pre processing) 
	*/
	
	public static int rainWater(int a[]) {
		int n = a.length;
		int left[] = new int[n];
		int right[] = new int[n];
		
		left[0] = a[0];
		for(int i=1; i<=n-1; i++) {
			left[i] = Math.max(left[i-1], a[i]);
		}
		
		right[n-1] = a[n-1];
		for(int i=n-2; i>=0; i--) {
			right[i] = Math.max(right[i+1], a[i]);
		}
		
		int ans = 0;
		for(int i=0; i<n; i++) {
			ans += Math.min(left[i], right[i]) - a[i]; 
		}
		
		return ans;
	}
}
