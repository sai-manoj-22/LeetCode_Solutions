class Solution {
    public boolean canAliceWin(int n) {
        int i=0;
        
        while(n>=(10-i)){
         n=n-(10-i);
         i++;

        }
        
        if (i % 2 == 0) {
            return false;
        }
        return true;
        

    }
}