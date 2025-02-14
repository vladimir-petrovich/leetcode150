public class MergeSortedArray {
}

class Solution {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);
        for(int i = 0; i < nums1.length; i++){
            System.out.println(nums1[i]);
        }
    }
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] tmp = new int[m + n];
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                tmp[k] = nums1[i];
                i++;
            }else{
                tmp[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < m){
            tmp[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            tmp[k] = nums2[j];
            j++;
            k++;
        }
        for(i = 0; i < m + n; i++){
            nums1[i] = tmp[i];
        }
    }
}
