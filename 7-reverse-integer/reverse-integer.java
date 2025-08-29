class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while(x != 0){
            int lastDigit = x%10;
            int previous = reverse;
            reverse = reverse*10+lastDigit;
            if((reverse-lastDigit)/10 != previous){
                return 0;
            }
            x = x/10;
        }
        return reverse;
    }
}