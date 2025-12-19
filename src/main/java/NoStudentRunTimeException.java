public class NoStudentRunTimeException extends RuntimeException{

    public NoStudentRunTimeException(String id){

        super("Student with id " + id + " not found!");
    }
}
