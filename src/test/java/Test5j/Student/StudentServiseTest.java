package Test5j.Student;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiseTest {
    @Test
    public void getStudentsTest(){
        StudentServise studentServise = new StudentServise();
        Student student = new Student(1, "dan");
        studentServise.addStudents(student);


        List<Student> listofstudents = studentServise.getStudents();


        assertFalse(listofstudents.isEmpty());


    }

}