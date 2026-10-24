class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb= new StringBuilder("");
        int i=0;
        while(i<word1.length() && i<word2.length()){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
           

        }
        int k=i;
        if(word1.length()<word2.length()){

            while(k<word2.length()){
                sb.append(word2.charAt(k));
                k++;

            }
        }
        if(word1.length()>word2.length()){

            while(k<word1.length()){
                sb.append(word1.charAt(k));
                k++;

            }
        }

        return sb.toString();
    }
}