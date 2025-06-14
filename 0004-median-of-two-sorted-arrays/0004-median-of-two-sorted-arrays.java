class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        // median: middle value, if the index is even, get the 2 middle values, add them together then divide by 2 to get the median
        // initial thought: merge the two string together, then turn the merged array into an ordered array
        // then find the median

        // use IntStream to merge array of int
        int[] mergedArr = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
        Arrays.sort(mergedArr);
        double median = 0;

        if (mergedArr.length % 2 == 0){
            int mid1 = mergedArr[mergedArr.length / 2 -1];
            int mid2 = mergedArr[mergedArr.length / 2];
            median = (mid1 + mid2) / 2.0;
        }else{
            median = mergedArr[mergedArr.length / 2];
        }
        return median;
    }
}