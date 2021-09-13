//HashMap
HashMap<String, Integer> map = new HashMap<String, Integer>();
map.put("A", 1);
map.get("A"); //Returns 1
map.containsKey("A"); //Returns true
map.putAll(map1); //copies data from map1 into map - map and map1 should hava same data variables declaration
map.clear(); //emties the map

map.entrySet(); // returns map as a set/array
map.values(); // returns collection view of values in map


//Hashtable
Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
table.put('I', 10);
table.put('R', 1);
//can iterate same way as maps

// Hashmap vs Hashtable 

// HashMap is non-synchronized. It is not thread-safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
// HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
// HashMap is generally preferred over HashTable if thread synchronization is not needed

  //Map.Entry inteface enables working with map entry
Map.Entry<Integer, Integer> entry = null;
entry.getKey();
entry.getValue();
entry.setEntry();


//Set
Set<Integer> set = new Set<Integer>();
set.add(1);
set.contains(1); // returns true if 1 is present
set.iterator();
set.remove(1); // returns true if removed
set.clear();
set.toArray(); // returns equivalent array of the set
set.size();


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

List<Integer> v = vowels.asList(); // vowels = ['a', 'e', 'i', 'o', 'u'];
v.contains('a'); // returns true


//Iterator
Iterator itr = <Collection Object>.iterator();
itr.hasNext();
itr.next();
itr.remove();


//String
char ch[] = new char[10]; ch = <string>.toCharArray(); //converts string to array


//Array
