import org.junit.jupiter.api.Test;
import ua.university.task3.Student;
import ua.university.task3.StudentRegistry;
import static org.junit.jupiter.api.Assertions.*;

public class StudentRegistryTest {

    @Test
    void removeById_shouldMakeFindByIdReturnNull() {
        StudentRegistry registry = new StudentRegistry();
        Student student = new Student("1", "Katya", "katya@gmail.com");

        registry.addStudent(student);
        registry.removeById("1");

        assertNull(registry.findById("1"));
    }

    @Test
    void removeById_shouldMakeContainsEmailReturnFalse() {
        StudentRegistry registry = new StudentRegistry();
        Student student = new Student("1", "Katya", "katya@gmail.com");

        registry.addStudent(student);
        registry.removeById("1");

        assertFalse(registry.containsEmail("katya@gmail.com"));
    }

    @Test
    void removeById_shouldAllowAddingSameEmailAgain() {
        StudentRegistry registry = new StudentRegistry();
        Student student1 = new Student("1", "Katya", "katya@gmail.com");
        Student student2 = new Student("2", "Maria", "katya@gmail.com");

        registry.addStudent(student1);
        registry.removeById("1");

        assertTrue(registry.addStudent(student2));
    }
}