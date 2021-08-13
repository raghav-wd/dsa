void main(){
        int arr1[] = {1,2,4,5,3};
        int arr2[] = {2,6,8,10,3};
        int n1 = 5, n2 = 4;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr1){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else map.put(i, 1);
        }
        
        for(int i : arr2){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else map.put(i, 1);
        }
        
        for(int i: arr1)
            if(map.get(i) == 1)
                System.out.print(i+" ");
        
        for(int i: arr2)
            if(map.get(i) == 1)
                System.out.print(i+ " ");
}
