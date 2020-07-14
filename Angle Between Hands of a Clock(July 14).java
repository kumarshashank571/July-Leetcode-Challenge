  class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour == 12){hour = 0;}
       double ans1 = Math.abs((minutes*6)-(hour*30)-(minutes*0.5));
       double ans2 = 360-ans1;
        return Math.min(ans1,ans2);
    }
}
