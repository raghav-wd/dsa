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
entry.setEntry();

//Stack
Stack<Integer> stack = new Stack<Integer>();
stack.push(1);
top = stack.pop();
top = stack.peek();
stack.search(1); // return -1 if not found or index of the searched element


//Queue
Queue<Integer> queue = new LinkedList<>();
queue.add(1);
queue.remove("Lebasi");
queue.poll(); // removes head
queue.peek(); // returns top element


//List
List<String> list = new LinkedList<>();
list.size();
list.add("Lebasi");
list.remove(<index>);


//String
char ch[] = new char[10]; ch = <string>.toCharArray(); //converts string to array
