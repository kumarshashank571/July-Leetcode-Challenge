class Solution {
    public String reverseWords(String s) {
        if(s.length() == 0){return "";}
       String ans = "";
        int n = s.length();
        int i =0;
        while(i<n){
            while(i<n && s.charAt(i) == ' '){i++;}
            if(i>=n){break;}
            int j = i+1;
            while(j<n && s.charAt(j) != ' '){
                j++;
            }
            String word = s.substring(i,j);
            if(ans.length() == 0){ans = word;}
            else{ans = word + " " + ans;}
            i = j+1;
            }
        return ans;
    }
}
