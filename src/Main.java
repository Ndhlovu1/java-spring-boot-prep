import java.util.Locale;

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



    }

    public static void arrays(){


    }

}