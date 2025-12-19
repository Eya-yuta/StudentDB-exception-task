import java.util.*;

public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }
    //findStudentById with optional (if student not found)
    /*public Optional<Student> findStudentById(String id) {
        return Optional.ofNullable(students.get(id));
        }*/
    //findStudentById with an unchecked exception (if student not found)
    public Student findStudentById(String id) {

            Student student = students.get(id);
            if (student == null) {
                throw new NoStudentRunTimeException(id);
            }
            System.out.println(student);
            return student;
    }
}
