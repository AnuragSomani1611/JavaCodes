//applications of binary search -
//continues 1's in sorted array -> n - firstOccurance
//floor root of a number 26 -> 5, 26/2, 26/4
//search in infinite sorted array, going through the intervals 1, 2, 4, 8, 16, 32
//search in sorted rotated array - we will see which one is
// peak element in an array

package DSA_Searching;

public class binary_search {
//    public static double medianOfTwoSorted(int arr1[], int arr2[]){
//        int n1 = arr1.length, n2 = arr2.length;
//        int begin1 = 0, end1 = n1;
//        while(begin1 < end1){
//            int i1 = (begin1+end1)/2;
//            int i2 = (n1+n2+1)/2 - i1;
//            int mini1 = i1==n1 ? Integer.MAX_VALUE:arr1[i1];
//            int max1 = i1==0 ? Integer.MIN_VALUE:arr1[i1-1];
//
//        }
//    }
    //for triplet with given sum -> fix one value and then perform pair with remaining sum on rest of the elements
    public static void pairWithGivenSumInSortedArray(int arr[], int n, int sum){
        int low = 0, high = n-1;
        while(low < high){
            int sum1 = arr[low] + arr[high];
            if(sum1 == sum){
                System.out.println("indexes are" + low + " " + high);
            }
            else if(sum1 > sum){
                high = high-1;
            }
            else{
                low = low-1;
            }
        }
    }
    public static int peakElement(int arr[], int n){
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(mid == 0|| arr[mid-1]<=arr[mid] && mid==n-1 || arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > 0 && arr[mid-1] >= arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static int firstOccurance(int arr[], int target, int low, int high){
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > target){
                high = mid-1;
            }
            else if (arr[mid] < target){
                low = mid + 1;
            }
            else{
                if (mid == 0 || arr[mid-1] != target){
                    return mid;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static int lastOccurance(int arr[], int target, int low, int high){
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > target){
                high = mid-1;
            }
            else if (arr[mid] < target){
                low = mid + 1;
            }
            else{
                if (mid == arr.length-1 || arr[mid+1] != target){
                    return mid;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static int findOccurance(int arr[], int target, int low, int high){
        int first = firstOccurance(arr, target, low, high);
        if(first == -1){
            return -1;
        }
        return lastOccurance(arr, target, low, high) - first + 1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 60, 70};
        int find = 50;
        int low = 0, high = arr.length;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == find){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] < find){
                low = mid+1;
            }
            else if(arr[mid] > find){
                high = mid-1;
            }
        }
        System.out.println(-1);
        int[] arr1 = {10, 20, 40, 40, 40, 50, 50, 50, 60, 70};
        int target = 50;
        System.out.println(firstOccurance(arr1, target, 0, arr1.length - 1));
        System.out.println(lastOccurance(arr1, target, 0, arr1.length - 1));
        System.out.println(findOccurance(arr1, target, 0, arr1.length - 1));

    }
}
