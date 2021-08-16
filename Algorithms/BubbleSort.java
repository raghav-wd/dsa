void bubbleSort() {
  int arr[]  = {8, 4, 7, 9, 1};
        
  for(int i = 0; i<arr.length-1; i++){
    for(int j = i+1; j<arr.length; j++){
       if(arr[j] > arr[i]){
          int tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
    }
  for(int item : arr)
  System.out.println(item);
}

//Or
for (int i = 0; i < n-1; i++)
   for (int j = 0; j < n-i-1; j++)
       if (arr[j] < arr[j+1])
       {
         // swap arr[j+1] and arr[j]
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }

//Optimised
//Worst Case O(n^2)
//Best Case O(n) if array already sorted
static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) 
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
  
            // IF no two elements were 
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }
