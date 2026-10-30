class Solution {
    public int trap(int[] heights) {
         int n=heights.length;
        int leftMax[] = new int[n];
        leftMax[0]=heights[0];
        for(int i=1; i<n;i++){
            leftMax[i]=Math.max(heights[i], leftMax[i-1]);
        }
        //Calculate right max boundary
        int rightMax[]= new int [heights.length];
        rightMax[n-1]=heights[n-1];
    
        for(int i=n-2; i>=0; i--){
            rightMax[i]=Math.max(heights[i], rightMax[i+1]);
        }

        int trapped_water=0;
        for(int i=0; i<n; i++){
            trapped_water= trapped_water+ (Math.min(rightMax[i], leftMax[i]))-(heights[i]);
        }

        return trapped_water;
    }

}
