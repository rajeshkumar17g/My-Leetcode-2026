class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        if (a.length > b.length)
            return findMedianSortedArrays(b, a);
        int m = a.length, n = b.length;
        int low = 0, high = m;
        while (low <= high) {
            int i = (low + high) / 2;
            int j = (m + n + 1) / 2 - i;
            int leftA = (i == 0) ? Integer.MIN_VALUE : a[i - 1];
            int rightA = (i == m) ? Integer.MAX_VALUE : a[i];
            int leftB = (j == 0) ? Integer.MIN_VALUE : b[j - 1];
            int rightB = (j == n) ? Integer.MAX_VALUE : b[j];
            if (leftA <= rightB && leftB <= rightA) {
                if ((m + n) % 2 == 0)
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                else
                    return Math.max(leftA, leftB);
            } else if (leftA > rightB)
                high = i - 1;
            else
                low = i + 1;
        }
        return -1;

    }
}