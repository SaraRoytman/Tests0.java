package Test5j.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServise {
    public Object remove;
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents(){
        return this.students;
    }

    public void addStudents(Student student){
        students.add(student);

    }


    public void remove(Student student3) {
        students.remove(student3);
    }
    public Student getstudentbyid(int studentid){
        return students.stream()
                .filter((student) -> student.getId() == studentid)
                .findFirst()
                .orElse(null);


    }
}
