import java.util.*;

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


    }

}