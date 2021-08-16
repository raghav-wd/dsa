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
