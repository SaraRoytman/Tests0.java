package Test5j.Student;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiseTest {
    @Test
    public void getStudentsTest(){
        StudentServise studentServise = new StudentServise();
        List<Student> listofstudents = studentServise.getStudents();
        assertTrue(listofstudents.isEmpty());


    }
    @Test
    public void getStudentTest2(){
        StudentServise studentServise = new StudentServise();
        Student student2 = new Student(5, "Noa");
        studentServise.addStudents(student2);
        List<Student> listofstudents = studentServise.getStudents();
        assertFalse(listofstudents.isEmpty());

    }
    @Test
    public void getStudentTest3(){
        StudentServise studentServise = new StudentServise();
        Student student3 = new Student(7, "Coral");
        studentServise.remove(student3);
        List<Student> listofstudents = studentServise.getStudents();
        assertTrue(listofstudents.isEmpty());

    }

}