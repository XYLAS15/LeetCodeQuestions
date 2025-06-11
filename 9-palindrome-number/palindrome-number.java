class Solution {
    public boolean isPalindrome(int x) {
        // if(x<0 ) return false;
        // if(xReverse(x)==x) return true;
        if(xReverse(x)==x){
            return true;
        }
        else if(x<0){
            return false;
        }
        else return false;
    }
    public static int xReverse(int x){
        int xCopy=0;
        while(x>0){
             xCopy = (xCopy * 10) + (x % 10);
            x /= 10;
        }
        return xCopy;
    }
}