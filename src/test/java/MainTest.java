import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void returnTrueIfTheRunTimeExceptionIsThrown() {
            Student student=new Student("1234","Mike","Maths");
            StudentRepo studentRepo=new StudentRepo();
            studentRepo.save(student);
        try{
            studentRepo.findStudentById("3456");

            // If no exception is thrown, the test should fail.
            fail();
        }catch(NoStudentRunTimeException e){

        }
    }

    @Test
    void returnTrueIfTheRunTimeExceptionIsNotThrown() {
        Student student=new Student("1234","Mike","Maths");
        StudentRepo studentRepo=new StudentRepo();
        studentRepo.save(student);
        try{
            studentRepo.findStudentById("1234");

        }catch(NoStudentRunTimeException e){
            // If exception is thrown, the test should fail.
            fail();
        }
    }



}