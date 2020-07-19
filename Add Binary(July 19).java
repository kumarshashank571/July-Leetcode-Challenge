class Solution {
    public String addBinary(String a, String b) {
        //== naive approach
        /*
        int i = a.length()-1;
        int j = b.length()-1;
        String ans = "";
        int carry = 0;
        while(i>=0 && j>=0){
            int sum = (a.charAt(i)-'0')+(b.charAt(j)-'0')+carry;
            int rem = sum%2;
            carry = sum/2;
            ans = rem+ans;
            i--;j--;
        }
        while(i>=0){
            
         int sum = (a.charAt(i)-'0')+carry;
            int rem = sum%2;
            carry = sum/2;
            ans = rem+ans;
            i--;
        }
        while(j>=0){
            int sum = (b.charAt(j)-'0')+carry;
            int rem = sum%2;
            carry = sum/2;
            ans = rem+ans;
            j--;
        }
        if(carry>0){
            ans = carry+ans;
        }
        return ans;*/
        
        
        //== method - 2 better approach
        
        StringBuilder ans = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){sum+=a.charAt(i--)-'0';}
            if(j>=0){sum+=b.charAt(j--)-'0';}
         carry = sum>1 ? 1:0;
            ans.append(sum%2);
        }
        if(carry>0){ans.append(carry);}
        return ans.reverse().toString();
    }
}
