class Student 
{
    int rolllno;
    String name;
    int marks;
}
public class ArrayDua {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rolllno = 101;
        s1.name = "John";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rolllno = 102;
        s2.name = "Jane";
        s2.marks = 95;

        Student s3 = new Student();
        s3.rolllno = 103;
        s3.name = "Doe";
        s3.marks = 85;

        // Creating an array of Student objects
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Displaying student details using traditional for loop
        // for(int i = 0; i < students.length; i++) {
        //     System.out.println("Student " + (i+1) + " Details:");
        //     System.out.println("Roll No: " + students[i].rolllno);
        //     System.out.println("Name: " + students[i].name);
        //     System.out.println("Marks: " + students[i].marks);
        //     System.out.println();
        // }

        // Displaying student details using enhanced for loop
        for (Student n : students)
        {
            System.out.println("Roll No: " + n.rolllno);
            System.out.println("Name: " + n.name);
            System.out.println("Marks: " + n.marks);
            System.out.println();
        }

        // int nums[] = new int[4]; 
        
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for(int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i]);
        // }

        // for(int n : nums) {
        //     System.out.println(n);
        // }
    }
}
