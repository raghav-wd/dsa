//HashMap
HashMap<String, Character, Integer> map = new HashMap<>();
map.put("A", 1);
map.get("A"); //Returns 1
map.containsKey("A"); //Returns true
map.putAll(map1); //copies data from map1 into map - map and map1 should hava same data variables declaration
map.clear(); //emties the map

map.entrySet(); // returns map as a set/array
map.values(); // returns collection view of values in map

  //Map.Entry inteface enables working with map entry
Map.Entry<Integer, Integer> entry = null;
entry.getKey();
entry.getValue();
