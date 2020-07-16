class Solution {
    public double power(double x,long n){
        if(n ==0){return 1.00;}
        if(n == 1){return x;}
        if(n < 0){return power(1/x,-n);}
        if(n%2 == 0){return power(x*x,n/2);}
        else{return x*power(x,n-1);}
    }
    public double myPow(double x, int n) {
        return power(x,(long)n);
    }
}
