import java.util.HashMap;
import java.util.Map;

public class HashMap1{
    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Add some students and their grades to the HashMap
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);
        studentGrades.put("David", 90);

        // Retrieve and print the grade of a specific student
        String studentName = "Alice";
        Integer grade = studentGrades.get(studentName);
        if (grade != null) {
            System.out.println(studentName + "'s grade: " + grade);
        } else {
            System.out.println("Student not found: " + studentName);
        }

        // Iterate over the HashMap and print all student names and their grades
        System.out.println("\nAll student grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if a specific student is in the HashMap
        studentName = "Eve";
        if (studentGrades.containsKey(studentName)) {
            System.out.println("\n" + studentName + " is in the HashMap.");
        } else {
            System.out.println("\n" + studentName + " is not in the HashMap.");
        }

        // Remove a student from the HashMap
        studentGrades.remove("Charlie");

        // Print the updated HashMap
        System.out.println("\nUpdated student grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
