package first_task;

import java.util.HashMap;

public class StudentStorage {
    private HashMap<String, Student> studentsMap = new HashMap<>();

    public void addStudent(String id, Student student) {
        studentsMap.put(id, student);
    }
    public Student getStudent(String id) {
        return studentsMap.get(id);
    }
}
