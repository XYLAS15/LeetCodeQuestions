class Solution {
    public double myPow(double x, int n) {
        return power(x, (long) n);   
    }

    private double power(double b, long e) {
        if (e == 0) return 1;

        if (e < 0) {
            return 1.0 / power(b, -e);  // safe now, -e fits in long
        }

        double half = power(b, e / 2);

        if (e % 2 == 0) {
            return half * half;
        } else {
            return b * half * half;
        }
    }
}