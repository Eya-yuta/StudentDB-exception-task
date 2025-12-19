public class NoStudentRunTimeException extends RuntimeException{

    public NoStudentRunTimeException(String id){

        super("Student with ID " + id + " not found!");
    }
}
