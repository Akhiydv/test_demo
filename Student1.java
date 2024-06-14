import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1
{
    String name;
    int rollNo;

    Student1(String name, int rollNo) 
	{
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString()
	{
        return "Student1{name='" + name + "', rollNo=" + rollNo + '}';
    }

    public static void main(String args[])
	{
        List<Student1> Students = new ArrayList<>();
        Students.add(new Student1("Alice", 3));
        Students.add(new Student1("Bob", 1));
        Students.add(new Student1("Charlie", 2));

        // Sort by roll number using Comparator
        Collections.sort(Students, new Comparator<Student1>() 
		{
            @Override
            public int compare(Student1 s1, Student1 s2)
			{
                return s1.rollNo - s2.rollNo;
            }
        });

        System.out.println("Sorted by roll number:");
        for (Student1 Student1 : Students)
		{
            System.out.println(Student1);
        }

        // Sort by name using Comparator
        Collections.sort(Students, new Comparator<Student1>()
		{
            @Override
            public int compare(Student1 s1, Student1 s2)
			{
                return s1.name.compareTo(s2.name);
            }
        });

        System.out.println("Sorted by name:");
        for (Student1 Student1 : Students) 
		{
            System.out.println(Student1);
        }
    }
}
