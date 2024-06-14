import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//A class that implements Comparable
class Student implements Comparable<Student>
{
    String name;
    int rollNo;

    Student(String name, int rollNo)
	{
        this.name = name;
        this.rollNo = rollNo;
    }

    //Implement the compareTo method to define natural ordering
    @Override
    public int compareTo(Student other) 
	{
        return this.rollNo - other.rollNo; // Sort by roll number
    }

    @Override
    public String toString()
	{
        return "Student{name='" + name + "', rollNo=" + rollNo + '}';
    }

    public static void main(String args[])
	{
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 2));

        //Sort using Comparable's compareTo method
        Collections.sort(students);

        //Print the sorted list
        for(Student student : students)
		{
            System.out.println(student);
        }
    }
}
