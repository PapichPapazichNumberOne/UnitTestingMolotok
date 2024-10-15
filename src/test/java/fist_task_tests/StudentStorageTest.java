package fist_task_tests;

import first_task.Student;
import first_task.StudentStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentStorageTest {
    private StudentStorage storage;
    private Student student1;
    private Student student2;

    @BeforeEach
    public void setUp() {
        storage = new StudentStorage();
        student1 = new Student("Алиса", "1");
        student2 = new Student("Даня", "2");
    }

    @Test
    public void testAddStudent() {
        storage.addStudent("1", student1);
        assertEquals(student1, storage.getStudent("1"));
    }

    @Test
    public void testGetStudent() {
        storage.addStudent("2", student2);
        assertEquals("Даня", storage.getStudent("2").getName());
    }

    @Test
    public void testGetNonExistentStudent() {
        assertNull(storage.getStudent("3"));
    }

    @Test
    public void testOverwriteStudent() {
        storage.addStudent("1", student1);
        Student newStudent = new Student("Андрей", "1");
        storage.addStudent("1", newStudent);
        assertEquals("Андрей", storage.getStudent("1").getName());
    }

    @Test
    public void testAddMultipleStudents() {
        storage.addStudent("1", student1);
        storage.addStudent("2", student2);
        assertEquals(student1, storage.getStudent("1"));
        assertEquals(student2, storage.getStudent("2"));
    }
}
