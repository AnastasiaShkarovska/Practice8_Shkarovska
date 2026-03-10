package ua.university.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentRegistry {
    private List<Student> students = new ArrayList<>();
    private Set<String> emails = new HashSet<>();
    private Map<String, Student> studentsById = new HashMap<>();

    public boolean addStudent(Student student) {
        if (emails.contains(student.getEmail())) {
            return false;
        }

        students.add(student);
        emails.add(student.getEmail());
        studentsById.put(student.getId(), student);
        return true;
    }

    public Student findById(String id) {
        return studentsById.get(id);
    }

    public boolean containsEmail(String email) {
        return emails.contains(email);
    }

    public boolean removeById(String id) {
        Student removedStudent = studentsById.remove(id);

        if (removedStudent == null) {
            return false;
        }

        students.remove(removedStudent);
        emails.remove(removedStudent.getEmail());
        return true;
    }

    public List<Student> getStudents() {
        return students;
    }
}