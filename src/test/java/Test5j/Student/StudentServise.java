package Test5j.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServise {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents(){
        return this.students;
    }

    public void addStudents(Student student){
        students.add(student);

    }


}
