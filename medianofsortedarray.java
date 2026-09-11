// import java.util.Arrays;

public class medianofsortedarray {
    // public static int[] findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int len1 = nums1.length;
    //     int len2 = nums2.length;
    //     double result;
    //     int i=0,j=0;
    //     int[] merged = new int[len1+len2];
    //     int k=0;
    //     while(i<len1 && j<len2){
    //         if(nums1[i] <= nums2[j]){
    //             merged[k++] = nums1[i++];
    //         }else{
    //             merged[k++] = nums2[j++];
    //         }
    //     }
    //     while(i<len1){
    //         merged[k++] = nums1[i++];
    //     }
    //     while(j<len2){
    //         merged[k++] = nums1[j++];
    //     }
    //     // int len = merged.length;
    //     // if(len % 2 == 0){
    //     //     result = (double)(merged[len/2] + merged[(len/2)-1])/2;
    //     // }else{
    //     //     result = (double)merged[len/2];
    //     // }
    //     return merged;
    // }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        // int[] nums2 = {2,4};
        // int[] res = new int[20];
        // res = findMedianSortedArrays(nums1,nums2);
        int len = nums1.length;
        double res = (double)(nums1[len/2] + nums1[(len/2)-1])/2.0d;
        System.out.println(res);
    }
}

