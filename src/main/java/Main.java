import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Viktoria", "Bunk", 11));
        studentList.add(new Student("Eva", "Remme", 12));
        studentList.add(new Student("Julia", "Raschke", 13));
        studentList.add(new Student("Frank", "Meyer", 14));

        for (Student student : studentList) {
            System.out.println(student);
        }
        //  method to find a student by their ID
        public boolean findStudent;(int studentId){
            for (Student student : studentList) {
                if (student.getStudentId() == studentId){
                    findStudent = true;
                }

            }
        }
    }
}
