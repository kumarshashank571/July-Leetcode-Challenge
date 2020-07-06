class Solution {
    
    // === method 1 - naive approach gets submitted in 0 ms
//     public static int[] removeTheElement(int[] arr,int index) 
//     { 
//         if (arr == null
//             || index < 0
//             || index >= arr.length) { 
  
//             return arr; 
//         } 
//         int[] anotherArray = new int[arr.length - 1]; 
  
//         for (int i = 0, k = 0; i < arr.length; i++) { 
//             if (i == index) { 
//                 continue; 
//             } 
//             anotherArray[k++] = arr[i]; 
//         }  
//         return anotherArray; 
//     } 
//     public int[] plusOne(int[] digits) {
//         if(digits[digits.length-1] <9){
//             digits[digits.length-1] += 1;
//              return digits;
//         }
//        else{
//           int n = digits.length;
//            int[] ans = new int[n+1];
//            int i = n-2;       // digits pointer
//            int j = n-1;       // answer pointer
           
//            ans[n] = (digits[n-1]+1)%10;
//            int carry = (digits[n-1]+1)/10;
//            while(i >=0 && j >= 0){
//                int sum = digits[i]+carry;
//                ans[j] = sum%10;
//                carry = sum/10;
//                i--; j--;
//            }
//            if(carry!= 0){
//                ans[0] = carry;
//            }
//            else{
//                ans = removeTheElement(ans,0);
//            }
//            return ans;
//        }
//     }
    
    
    //=== Method - 2 == optimized short code 
    public int[] plusOne(int[] digits){
        int n = digits.length;
        for(int i = n-1;i>=0;i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }
            else{
                digits[i]++;
                return digits;
            }
        }
        digits = new int[n+1];
        digits[0] = 1;
        return digits;
    }
}
