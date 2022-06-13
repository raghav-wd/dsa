public class binarysearch {
    public static void main(String args[]) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int l = 0, r = arr.length, target = 10, index = -1;
        while(l+r > 1) {
            int mid = (l + r)/2;
            if(arr[mid] < target) {
                l = mid + 1;
            }
            if(arr[mid] > target) {
                r = mid - 1;
            }
            if(arr[mid] == target) {
                System.out.println(mid);
            }
        }
    }
}
