import java.util.Arrays;
import java.util.Scanner;

public class StudentsData {
    StudentManager manager=new StudentManager();
    Scanner sc= new Scanner(System.in);
    Student student ;
       public void enteringStudentsData(){
           for (int i=0;i<3;i++){

               System.out.println("Enter details for student " + (i + 1));



               sc.nextLine();
               System.out.println("enter your name");
               String name= sc.nextLine();

               System.out.println("enter roll number");
               int rollNo= sc.nextInt();



               int[] marks=new int[3];

               System.out.println("enter maths marks");
               int maths=sc.nextInt();
               marks[0]=maths;
               System.out.println("enter physics marks");
               int physics=sc.nextInt();
               marks[1]=physics;
               System.out.println("enter chemistry marks");
               int chemistry =sc.nextInt();
               marks[2]=chemistry;

               student=new Student(name,rollNo,marks);

               manager.addStudent(student);
               manager.allStudents();


           }
       }

public void gettingStudentsData(){
    for (Student s: manager.allStudents()){
        System.out.println("marks of "+s.getName()+" = "+ Arrays.toString(s.getMarks())+"average ="+s.averageMarksOfStudents());

    }
}

}
