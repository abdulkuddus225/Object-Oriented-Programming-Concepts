package association;

import java.util.ArrayList;
import java.util.List;

//Student class
class Student{
	String name;
	int id;
	String dept;
	
	Student(String name, int id, String dept){
		this.name = name;
		this.id  = id;
		this.dept = dept;
	}
	
}

// Department class contains list of student objects. It is associated with student class
// Through its object

class Department {
	
	String name;
	private List<Student> students;
	
	Department(String name, List<Student> students){
		this.name = name;
		this.students = students;
	}
	
	public List<Student> getStudent(){
		return students;
	}
	
	
}

class Institute{
	
	String instituteName;
	private List<Department> departments;
	
	Institute(String instituteName, List<Department> departments){
		this.instituteName = instituteName;
		this.departments = departments;
	}
	
	public int getTotalStudentInInstitute() {
		int noOfStudents = 0;
		List<Student> students;
		for (Department dept: departments) {
			students = dept.getStudent();
			for (Student s: students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
	
}

public class Aggregation_association {
	public static void main(String[] args) {
		
		Student s1 = new Student("Mia", 1, "CSE");
		Student s2 = new Student("Priya", 2, "CSE");
        Student s3 = new Student("John", 1, "EE");
        Student s4 = new Student("Rahul", 2, "EE");
        
        List <Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s2);
        
        List <Student> ee_students = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);
        
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
        
        List <Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);
        
        Institute institute = new Institute("BITS", departments);
        
        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudentInInstitute());
		
	}
}
