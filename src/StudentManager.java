import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    List<Student> students=new ArrayList<Student>();

    public void addStudent(Student st){
        students.add(st);
    }

    public List<Student> allStudents(){
        //System.out.println("here all three students "+students);

return students;
    }

}
