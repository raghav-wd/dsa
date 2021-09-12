public static void main(){
  int ar[] = { 1, 2, 3, 4, 5 };
        int len = ar.length, t = 1;

        int l = 0, u = len;

        while (l <= u) {
            int mid = l + (u - l) /2;
            if (ar[mid] == t) {
                System.out.print(mid);
                break;
            }
            if(ar[mid] > t)
                u = mid - 1;
            if(ar[mid] < t)
                l = mid + 1;
        }
}
