class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max=0;
        int n=arr1.length;
        int m=arr2.length;
        for(int i=0;i<n;i++) {
            max = Math.max(max,arr1[i]);
        }
        int countArr[] = new int[max+1];
        for(int i=0;i<n;i++) {
            int ele = arr1[i];
            countArr[ele]++;
        }
        int j=0;
        for(int i=0; i<m; i++) {
            int ele = arr2[i];
            while(countArr[ele] > 0) {
                arr1[j] = ele;
                j++;
                countArr[ele]--;
            }
        }
        for(int i=0; i<max+1; i++) {
            while(countArr[i] > 0) {
                arr1[j] = i;
                j++;
                countArr[i]--;
            }
        }
        return arr1;
    }
}