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

    //the short version of the test returnTrueIfTheRunTimeExceptionIsThrown
    @Test
    void returnTrueIfTheRunTimeExceptionIsThrownShortV() {
        Student student=new Student("1234","Mike","Maths");
        StudentRepo studentRepo=new StudentRepo();
        studentRepo.save(student);
        // If exception is thrown, the test should be true.
        assertThrows(NoStudentRunTimeException.class,()->{ studentRepo.findStudentById("3456");});
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

    //the short version of the test returnTrueIfTheRunTimeExceptionIsNotThrown
    @Test
    void returnTrueIfTheRunTimeExceptionIsNotThrownShortV() {
        Student student=new Student("1234","Mike","Maths");
        StudentRepo studentRepo=new StudentRepo();
        studentRepo.save(student);
        // If exception is not thrown, the test should be true.
        assertDoesNotThrow(()->{ studentRepo.findStudentById("1234");});
    }



}