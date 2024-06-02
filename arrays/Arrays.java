package arrays;

public class Arrays {
    public static void main(String[] args) {
        int age[]; // *declaration of array
        age = new int[5]; // * allocation of memory
        // or
        // int[] age=new int[20]

        age[0] = 5;
        age[1] = 10;
        // System.out.println(age[0]);
        // System.out.println(age[1]);
        // System.out.println(age[2]);

        // System.out.println(age.length);

        int[] marks = { 98, 12, 45, 12, 65 };
        // System.out.println(marks[marks.length - 1]);

        String[] names = { "Shubham", "Anjali", "Smita", "Ankita", "Vishal" };

        for (String name : names) {
            // System.out.println(name);

            // System.out.println(name.length());

        }

        int[] numbers = { 23, 12, 6, 7, 3, 14, 56, 15 };
        int min = Integer.MAX_VALUE;   //* to store the minimum */
        for (int number : numbers) {
            if (number < min) {
                min = number;

            }
        }
        //  System.out.println("minimun is"+ " " + min);



        //* <----------- Multi-Dimensional Array ----------->


        int[][] stu_marks={
            {98,45,65},
            {12,78,45},
            {45,12,89},
            {58,78,16}
        };
        // stu_marks[0][0]=5;
        // stu_marks[0][1]=5;
        // stu_marks[0][2]=8;

        // stu_marks[1][0]=5;
        // stu_marks[1][1]=5;
        // stu_marks[1][2]=8;

        // stu_marks[2][0]=5;
        // stu_marks[2][1]=5;
        // stu_marks[2][2]=8;

        // stu_marks[3][0]=5;
        // stu_marks[3][1]=5;
        // stu_marks[3][2]=8;
       

     System.out.println(stu_marks[1][2]);  // index out of bounds
     
            for (int[] is : stu_marks) {
                System.out.println(is[2]);
            }

          
    }
}
