
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Java + React", "Engin Demirog");
		
		Course course2 = new Course(2,"C# + Angular", "Engin Demirog");
		
		Course[] courses = {course1, course2};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		Student student1 = new Student(1, "Uğur Kaan Yeşil", course1.name);
		
		Student student2 = new Student(2, "Anıl İmrek", course2.name);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addToCourse(student1);
		studentManager.addToCourse(student2);
		studentManager.leaveCourse(student1);

	}

}
