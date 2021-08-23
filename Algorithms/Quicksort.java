class RightVibe {
    static int a[] = { 4, 6, 2, 5, 9, 1, 3 };

    static int partition(int l, int h) {
        int i = l-1, pivot = a[h];
        for (int j = l; j < h; j++) {
            if (a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, h);
        return i + 1;
    }

    static void quicksort(int l, int h){
        if (l < h) {
            int pivot = partition(l, h);
            quicksort(l, pivot-1);
            quicksort(pivot+1, h);
        }
    }
    
    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        quicksort(0, 6);

        for (int i : a)
            System.out.print(i + " ");

        System.out.println("\n");
    }
    
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
