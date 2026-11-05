class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int i=0;i<arr1.length;i++){
            int j=0;
            
            while(j<arr2.length && Math.abs(arr1[i]-arr2[j])>d){
             j++;
            }
             
            
            if(j==arr2.length){
                c++;
            }
             
        }
     return c;
    }
}
