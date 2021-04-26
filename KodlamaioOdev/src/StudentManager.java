
public class StudentManager {
	public void addToCourse(Student student) {
		System.out.println(student.fullName + " " + student.joinedCourse + " kursuna eklendi.");
	}
	
	public void leaveCourse(Student student) {
		System.out.println(student.fullName +" " + student.joinedCourse + " dan çıkarılmıştır." );
		student.joinedCourse = "Yok";
	}
}
