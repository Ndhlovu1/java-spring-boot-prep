import java.util.*;



//TODO : USING STACKS TO REVERSE A STRING
class StringReverser{

    public String reverseString(String input){

        //TODO : DECLARE A STACK
        Stack<Character> stack = new Stack<Character>();

        for(Character character : input.toCharArray())
            //Save the item to the stack with LIFO
            stack.push(character);

        String reversed = "";

        while (!stack.empty())
            reversed += stack.pop();


        return reversed;

    }

}


public class Main {

    public static void main(String[] args) {

        /**
         *  ONE DIMENSIONAL ARRAY - SIMPLEST ARRAY TYPE
         *
         */

        System.out.println("TWO DIMENSIONAL ARRAY\n");
        //DECLARE AN EMPTY ARRAY
        int[] results;

        //Setting a value for marks
        results = new int[5];

        // ALTERNATIVELY
        int[] marks = new int[] {98,20,35,49};

        //DECLARE AND STATE THE SIZE
        int[] scores = new int[5];

        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;
        scores[3] = 40;
        scores[4] = 50;

        //ACCESSING THE VALUES IN THE ARRAY WE MUST USE A FOR LOOP
        for (int i = 0; i<scores.length;i++){
            System.out.println("Position "+i+" : "+scores[i]);
        }

        System.out.println("-------------------");

        //USING A FOR EACH LOOP
        for (int value : marks){
            System.out.println(value);
        }

        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("TWO DIMENSIONAL ARRAY\n");

        /*
        ARRAY CONTAINS MORE THAN ONE ROW TO STORE DATA IN IT

        e.g the development of a 3 x 3 Array
        int[][] arr = new int[3][3] // 3 Rows and 3 Columns
        s[row][column]

        s[0][1]     s[0][1]     s[0][2]
        s[1][0]     s[1][1]     s[1][2]
        s[2][0]     s[2][1]     s[2][3]

         */

        int[][] names_grades = {
                {1,2,123,43,2},
                {2,3,45,6,124},
                {1,23,45,6,10},

        };

        //[3][5]
        //Accessing the variables
        for (int i = 0; i < names_grades.length; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print(names_grades[i][j]+" \t");

            }
            System.out.println();

        }

        String name = "Tinomudaishe Ndhlovu ";

        System.out.println(name.replace(" ","-"));

        System.out.println(name.indexOf("a"));

        System.out.println(name.trim());

        System.out.println(name.length());

        System.out.println(name.charAt(2));

        System.out.println(name.subSequence(0,3));

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        long start_time = System.currentTimeMillis();

        StringBuffer buffer = new StringBuffer("Welcome");
        System.out.println(buffer.capacity());

        for (int i = 0; i < 10000; i++) {
            buffer.append("Home");
            //System.out.println(buffer);
        }
        System.out.println("TIME TAKEN : "+(System.currentTimeMillis() - start_time));


        long start_time2 = System.currentTimeMillis();

        StringBuffer builder = new StringBuffer("Hello");
        System.out.println(buffer.capacity());

        for (int i = 0; i < 10000; i++) {
            builder.append("World");
            //System.out.println(builder);
        }
        System.out.println("\nTIME TAKEN BUILDER : "+(System.currentTimeMillis() - start_time2));

        /**     COLLECTION FRAMEWORK
         *
         * INTERFACES - GROUP OF RELATED METHODS WITH EMPTY BODIES(ABSTRACT-HIDING IMPLEMENTATION DETAILS)
         *
         * CLASSES - IMPLEMENTATION OF THE COLLECTION INTERFACES
         *
         * ALGORITHMS - USEFUL FOR CALCULATION, COMPUTATION AND SORTING & SEARCCHING (ITERATIONS TO FIND BEST OPTION AS PER TIME AND SPACE COMPLEXITY)
         *
         */

        /**         TODO : COLLECTION INTERFACE IS THE ROOT INTERFACE OF THE JAVA COLLECTIONS FRAMEWORK
         * TODO : IT IS IMPLEMENTED THROUGH ITS' SUB INTERFACES
         *
         * 1. LIST (Interface) - ALL Implement the LIST Interface
         *      ARRAYLIST, LINKEDLIST, VECTOR, STACK(These are all classes)
         *
         * 2. QUEUE (Interface)
         *      PriorityQue - Implements the QUEUE Interface
         *      Dequeue(Interface)
         *      ArrayDeque
         *
         * 3. SET (Interface)
         *      HashSet(CLASS) Implements the Set Interface
         *      LinkedHashSet(CLASS) Implements the Set Interface
         *
         */

        /** TODO : LIST INTERFACE - Is an ordered collection of elements that allows duplicate elements
         *
         * TODO : AVAILABLE IN THE java.util package and inherits the collection interface. BELOW ARE THE CLASSES THAT IMPLEMENT THE LIST INTERFACE
         *  ARRAYLIST,
         *  LINKEDLIST,
         *  VECTOR
         *
         */

        List<Integer> linkedList = new LinkedList<Integer>();



        List<Integer> vectors = new Vector<Integer>();

        // TODO : ARRAYLIST(DYNAMIC ARRAYS) - SIMILAR TO AN ARRAY BUT CAN DYNAMICALLY INCREASE OR DECREASE IT'S SIZE AS ELEMENTS ARE ADDED OR REMOVED

        /**                             TODO : ARAYLIST METHODS
         *
         *  boolean add(Collection c) - Appends to the specified element to the end of a list
         *
         *  void add(int index, Object element) - Inserts the specified element at the specified position
         *
         *  Void clear() - Removes all the elements from the list
         *
         *  int lastIndexOf(Object o) - Return the index in this list of the last occurence of the specified element, or -1 if the list does not contain this element
         *
         *  Object clone() - Return a shallow copy of an arrayList
         *
         *  Object[] to Array() - Return a shallow copy of an ArrayList
         *
         *  void trimToSize() - Trims the capacity of this ArrayList instance to be list's current size
         *
         *  size() - Tell us how many are inside
         *
         *  remove(index) - TO remove an item
         *
         */

        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : ARRAY LIST \n\n");

        List<String> arrayList = new ArrayList<>();

        arrayList.add("Sultan");
        arrayList.add("Tinomudaishe");
        arrayList.add("24");



        //TODO : ITERATE THROUGH THE LIST
        System.out.println("LIST SIZE :"+arrayList.size());
        for(String value : arrayList){
            System.out.println("REMOVED : "+value);

        }

        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : LINKED LIST \n\n");

        LinkedList<String> linkedList1 = new LinkedList<String>();

        linkedList1.add("Python");
        linkedList1.add("Javascript");
        linkedList1.add("Kotlin");
        linkedList1.add("C#");

        for(String item : linkedList1){
            System.out.println(item);
        }

        //Add an item to a position
        linkedList1.add(2,"PHP");

        for(String item : linkedList1){
            System.out.println(item);
        }

        System.out.println(linkedList1.size());


        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : VECTOR LIST \n\n");

        //TODO : SYNCHRONIZED - ONLY 1 OPERATION AT A TIME
        // DYNAMIC SIZE, LEGACY SUPPORT, SYNCHRONIZATION
        // VECTOR METHODS

        /** TODO : VECTOR METHODS
         *      add() - IT IS USED TO APPEND THE SPECIFIED ELEMENT IN THE GIVEN VECTOR
         *      addAll() - USED TO APPEND ALL ELEMENTS IN THE SPECIFIED COLLECTION TO THE END OF THIS VECTOR
         *      addElement() - IT IS USED TO APPEND TO THE END OF THE VECTOR
         *      capacity() - IT IS USED TO GET THE CURRENT CAPACITY OF THIS VECTOR
         *      contains() - RETURNS TRUE IF THE VECTOR HAS THE SPECIFIED ELEMENT
         *      equals() - USED TO COMPARE THE SPECIFIED OBJECT WITH THE VECTOR FOR EQUALITY
         *      get() - USED TO GET AN ELEMENT AT SPECIFIC POSITION IN VECTOR
         *      indexOf() - GET THE INDEX OF THE 1ST OCCURENCE
         *
         *
         */

        // VECTOR
        Vector<String> vector = new Vector<String>();
        vector.add("LEADERSHIP AND MANAGEMENT");
        vector.add("WEB APPLICATION PROGRAMMING");
        vector.add("GAME DEVELOPMENT");
        vector.add("MOBILE APPLICATION DEVELOPMENT");

        System.out.println("VECTOR SIZE :"+vector.size());
        for(String item : vector){
            System.out.println(item);
        }

        vector.remove(2);
        System.out.println("VECTOR SIZE :"+vector.size());

        vector.clear();
        System.out.println("VECTOR SIZE :"+vector.size());

        //TODO : STACK - IT IS THREAD SAFE

        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("SIZE : "+stack.size());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        for(Integer item : stack){
            System.out.println(item);
        }

        System.out.println("SIZE : "+stack.size());

        System.out.println("POPPED : "+stack.pop());

        System.out.println("Element Ready to Be Popped : "+stack.peek());

        System.out.println("SIZE : "+stack.size());

        System.out.println(stack);

        System.out.println("----------------------------------------------------");
        System.out.println("\t\tSTACK REVERSE");

        String nam = "Tinomudaishe";

        StringReverser reverser = new StringReverser();

        String revs = reverser.reverseString(nam);

        System.out.println("ORIGINAL STRING : "+nam);
        System.out.println("REVERSED STRING : "+revs);

        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : QUEUE LIST \n\n");

        /** TODO : BASIC QUEUE OPERATIONS
         *      enqueue()       - Adding an element to the end of the queue
         *      dequeue()       - Removing or accessing an element from the front of the queue
         *      peek()          - Used to get the item at the front of the line without removing it
         *      initialize()    - Creates an empty queue
         *      isfull()        - Checks if the queue is full
         *      isempty()       - Checks if the queue is empty
         *
         */

        //USING A PRIORITY QUEUE
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        System.out.println(queue.size());

        queue.add(10);
        queue.add(50);
        queue.add(100);

        System.out.println(queue);

        System.out.println("QUEUE : ELEMENT AT FRONT OF THE LIST :"+queue.peek());

        System.out.println("QUEUE : ELEMENT TO BE REMOVED : "+queue.poll());

        System.out.println("QUEUE EMPTY : "+queue.isEmpty());

        //TODO : REVERSE A STRING WITH A QUEUE

        Queue<Integer> queue1 = new ArrayDeque<Integer>();
        queue1.add(10);
        queue1.add(20);
        queue1.add(30);
        queue1.add(40);
        System.out.println("STRING REVERSAL\nNORMAL QUEUE : "+queue1);
        rev(queue1);
        System.out.println("REVERSED QUEUE : "+queue1);

        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : HASHMAP \n\n");

        /** TODO : BASIC MAP METHOD OPERATIONS
         *      Object put(Object Key, Object value)        - Inserts an entry in the map
         *      void putAll(Map map)                        - Insets the specified map in the map
         *      Object remove(Object key)                   - Deletes an entry for the specified key
         *      boolean containsKey()                       - Returns the value for the specified key
         *      Set keyset()                                - Returns the Set view containing all the keys
         *      Set entrySet()                              - Returns the Set view containing all the keys and values
         *      Object getKey()                             - Used to obtain key
         *      Object getValue()                           - Used to obtain value
         *
         */

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(24, "Tino");
        map.put(25, "Ndhlovu");
        map.put(26, "Mr T Ndlovu");
        map.put(27, "Dark Phoenix");
        map.put(28, "Phoenix Global");

        for(Map.Entry<Integer, String> map_ : map.entrySet()){
            //System.out.println(map_);
            System.out.println(map_.getKey() +" : "+map_.getValue());
        }

        String value = map.get(24);
        System.out.println("HASHMAP"+value);
        System.out.println("ALL KEYS IN OUR MAP : "+map.keySet());
        System.out.println("ALL VALUES IN OUR MAP : "+map.values());
        System.out.println("REMOVING : "+map.remove(24));
        System.out.println("CURRENT MAP : "+ map);
        map.clear();
        System.out.println("CLEARING EVERYTHING : "+map.size());



        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : LINKED HASHMAP \n\n");

        LinkedHashMap<String,Integer> even_numbers = new LinkedHashMap<String, Integer>();

        even_numbers.put("Two",2);
        even_numbers.put("Four",4);
        even_numbers.put("Six",6);
        even_numbers.put("Eight",8);

        System.out.println(even_numbers);

        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<String,Integer>(even_numbers);

        numbers.put("Ten",10);

        System.out.println("NUMBERS : "+numbers);

        numbers.putIfAbsent("Six",6);
        numbers.putIfAbsent("Twelve",12);

        System.out.println("NUMBERS AFTER ADDING "+numbers);


        /** TODO : WEAK HASMAP METHODS
         *      clear()
         *      containsKey()
         *      size()
         *      isEmpty()
         *
         */

        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : WEAK HASHMAP \n\n");

        WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<String , Integer>();

        weakHashMap.put("ONE", 1);
        weakHashMap.put("TWO", 2);
        weakHashMap.put("THREE", 3);
        weakHashMap.put("FOUR", 4);
        weakHashMap.put("FIVE", 5);

        String six = new String("SIX");

        Integer six_Value = 6;

        weakHashMap.put(six,six_Value);
        System.out.println(weakHashMap);

        //ADD NULL VALUE
        six = null;

        System.gc();
        System.out.println("WEAK HASHMAP : "+weakHashMap);


        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : ENUMMAP \n\n");

        EnumMap<Size, Integer> enum_size = new EnumMap<>(Size.class);

        enum_size.put(Size.SMALL, 20);
        enum_size.put(Size.MEDIUM, 40);
        enum_size.put(Size.LARGE, 80);
        enum_size.put(Size.EXTRALARGE, 160);

        System.out.println("ENUM PIZZA SIZES : "+enum_size);
        System.out.println("MEDIUM VALUES : "+Size.MEDIUM);
        System.out.println("ENTRY SET : "+enum_size.entrySet());
        System.out.println("KEY SET : "+enum_size.keySet());
        System.out.println("VALUE SET : "+enum_size.values());


        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : SORTEDMAP INTERFACE \n\n");

        /**TODO : SORTED MA
         *  comparator()        -   Returns a comparator that can be used to order keys in a map
         *  firstKey()          -   Returns the first key of the sorted map
         *  lastKey()           -   Returns the last key of the sorted map
         *  headMap(key)        -   returns all the entries of a map whose keys are less than the specified
         *  tailMap(key)        -   returns all entries of a map whose keys are greater than or equal to specified key
         *  subMap(key1, key2)  -   Returns all entries of a map whose keys lie in between key1 and key2 including key1
         */

        SortedMap<String, Integer> num = new TreeMap<String, Integer>();

        num.put("Zimbabwe", 1);
        num.put("Angola", 2);
        num.put("Namibia", 3);
        num.put("Uganda", 4);
        num.put("Zambia", 5);
        num.put("Sychelles", 6);

        System.out.println("Sorted Map : "+num);
        System.out.println("First Key : "+num.firstKey());
        System.out.println("Last Key : "+num.lastKey());
        System.out.println("Tail Map : "+num.tailMap("Uganda"));
        System.out.println("Sub Map : "+num.subMap("Namibia", "Sychelles"));


        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : NAVIGABLEMAP \n\n");

        /** TODO : NAVIGABLE MAP - ASCENDING ORDER IS THE DEFAULT
         *      ceilingEntry(K, key)    - RETURNS A KEY-VALUE MAPPING WHICH IS ASSOCIATED WITH THE LEAST KEY WHICH IS GREATER THAN OR EQUAL TO THE SPECIFIED KEY
         *      ceilingKey(K key)       - Returns the least key that is greater than or equal to the specified key
         *      descendingKeySet()      - Returns the reverse order NavigableSet view for the given keys
         *      descendingMap()         - Returns the reverse order view of the mapping present in the map
         *      firstEntry()            - Returns a key-value mapping which is associated with the least key in the given map
         *      floorEntry(K key)            - Returns a key-value mapping which is associated with the greatest key which is less than or equal to the given key
         *
         */

        NavigableMap<String, Integer> nav_map = new TreeMap<String, Integer>();
        nav_map.put("Russia",1);
        nav_map.put("Turkey",2);
        nav_map.put("China",3);
        nav_map.put("Indonesia",4);
        nav_map.put("Thailand",5);

        System.out.println("NAVIGABLE MAP : "+nav_map);
        System.out.println("FIRST ENTRY : "+nav_map.firstEntry());
        System.out.println("LAST ENTRY : "+nav_map.lastEntry());
        System.out.println("POLL FIRST ENTRY : "+nav_map.pollFirstEntry());
        System.out.println("POLL LAST ENTRY : "+nav_map.pollLastEntry());




        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : TREEMAP \n\n");

        /** TODO - TREE MAP EXTENDS THE NAVIGABLE MAP INTERFACE
         *      1. NO NULL KEYS, BUT NULL VALUES
         *      2. DO NOT SUPPORT ENTRY.SET.VALUE ORDER
         *      METHODS
         *      Map.Entry<K, V> ceilingEntry(K key)     -   RETURNS THE KEY VALUE PAIR HAVING THE LEAST KEY, GREATER THAN OR EQUAL TO THE SPECIFIED KEY, OR NULL IF THERE'S NO SUCH KEY
         *      K ceilingKey(K key)                     -   Returns the least key, greater than or null if there is no such key
         *      void clear()                            -   Removes all k-v pairs from the map
         *      Object clone()                          -   Returns a shallow copy of TreeMap instance
         *      Comparator<?super K> , comparator       -   Returns the comparator that arranges the key in order
         *      NavigableSet<K>descendingKeySet()       -   It returns order NavigableSet view of the keys contained in map
         *
         *
         */

        TreeMap<String , Integer> treeMap = new TreeMap<String,Integer>();
        treeMap.put("Brazil",1);
        treeMap.put("Argentina",2);
        treeMap.put("Columbia",3);
        treeMap.put("Venezuala",4);
        treeMap.put("Nicaragua",5);

        treeMap.putIfAbsent("Brazil",1);
        treeMap.putIfAbsent("Uruguay",6);

        System.out.println("TREEMAP : "+ treeMap);
        System.out.println("TREEMAP VALUES : "+ treeMap.values());
        System.out.println("TREEMAP KEYS : "+ treeMap.keySet());
        System.out.println("TREEMAP ENTRY SET : "+ treeMap.entrySet());



        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : SET INTERFACE \n\n");

        /**TODO - SET INTERFACE
         *  We cant create direct implementations of a set
         *  We can use : EnumSet, HashSet, LinkedHashSet, TreeSet
         *  It is also extended by the SortedSet and the NavigableSet
         *
         *  METHODS TO BE USED WITH THE SET INTERFACE
         *
         *  add()           -   Adds an element to the set
         *  addAll()        -   Adds all elements of the specified collection to the set
         *  iterator()      -   Returns an iterator that can be used to access elements of the set sequentially
         *  remove()        -   Removes a specified element
         *  removeAll()     -   Removes a all elements from the set that are present in another specified set
         *  retainAll()     -   Retains all elements in the set that are also present in another specified set
         *  contains()      -   Returns true if the set contains specified element
         *  containsAll()   -   Returns true if the set contains all the elements of the specified collection
         *  toArray()       -   Returns an array containing all the elements of the set
         *
         */

        // Union, Intersection and Subset
        //Verify util package
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);
        set1.add(400);
        set1.add(500);

        System.out.println("HASHSET : "+set1);

        //Use Iterator
        Iterator<Integer> iterator = set1.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : HASHSET INTERFACE \n\n");

        HashSet<String> numb = new HashSet<String >();

        numb.add("100");
        numb.add("200");
        numb.add("300");
        numb.add("400");

        System.out.println(numb);

        Iterator<String> iterator1 = numb.iterator();

        while (iterator1.hasNext()){
            System.out.println("Item : "+iterator1.next());
        }

        HashSet<String> set2 = new HashSet<String>();

        set2.add("Zambia");
        set2.add("Zimbabwe");
        set2.add("Angola");
        set2.add("Malawi");
        set2.add("Namibia");

        System.out.println("SET 2 : "+set2);

        System.out.println("SET 2 SIZE : "+set2.size());

        set2.addAll(numb);

        System.out.println("Removed All In Numb : "+numb.removeAll(numb));

        System.out.println("UNION OF SET 2 AND NUMB : "+set2);

        //set2.removeAll(numb);

        System.out.println("REMOVED ALL NUMBERS : "+set2);

        //System.out.println("NUMB VALUES : "+numb);

        set2.removeAll(numb);

        System.out.println("SET 2 : "+set2);


        System.out.println("\n\n\n\n\nCOLLECTIONS FRAMEWORK : ENUMSET INTERFACE \n\n");

        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println("SIZES : "+sizes);

        EnumSet<Size> sizes1 = EnumSet.noneOf(Size.class);
        System.out.println("SIZES 1 :"+sizes1);

        EnumSet<Size> sizes2 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
        System.out.println("SIZES 2 : "+sizes2);

        //CREATE A SPECIFIC SET AND ADD ELEMENTS
        EnumSet<Size> sizes3 = EnumSet.of(Size.SMALL, Size.LARGE);
        System.out.println("SIZES 3 : "+sizes3);

        Iterator<Size> iterator2 = sizes3.iterator();

        while (iterator2.hasNext()){
            System.out.println("VALUE: "+ iterator2.next());
        }

        sizes2.add(Size.EXTRASMALL);
        Iterator<Size> sizeIterator =sizes2.iterator();

        while (sizeIterator.hasNext()){
            System.out.println("ITEM : "+sizeIterator.next());
        }





    }

    enum Size{
        EXTRASMALL,SMALL, MEDIUM, LARGE, EXTRALARGE
    }



    public static void rev(Queue<Integer> queue){

        Stack<Integer> stack = new Stack<Integer>();

        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }

    }

}