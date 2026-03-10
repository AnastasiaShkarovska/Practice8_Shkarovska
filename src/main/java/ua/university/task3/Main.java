package ua.university.task3;

public class Main {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();

        Student s1 = new Student("1", "Katya", "katya@gmail.com");
        Student s2 = new Student("2", "Olga", "olga@gmail.com");
        Student s3 = new Student("3", "Ivan", "katya@gmail.com"); // дубль email

        System.out.println("Add Katya: " + registry.addStudent(s1));
        System.out.println("Add Olga: " + registry.addStudent(s2));
        System.out.println("Add Ivan (duplicate email): " + registry.addStudent(s3));

        System.out.println("Find by id 1: " + registry.findById("1"));
        System.out.println("Contains katya@gmail.com: " + registry.containsEmail("katya@gmail.com"));

        System.out.println("Remove id 1: " + registry.removeById("1"));
        System.out.println("Find by id 1 after remove: " + registry.findById("1"));
        System.out.println("Contains anna@gmail.com after remove: " + registry.containsEmail("katya@gmail.com"));

        Student s4 = new Student("4", "Maria", "katya@gmail.com");
        System.out.println("Add Maria with reused email: " + registry.addStudent(s4));

        System.out.println("All students:");
        for (Student student : registry.getStudents()) {
            System.out.println(student);
        }
    }
}