package homeworkday3;

public class Main {

	public static void main(String[] args) {

     Instructor instructor = new Instructor();
		    instructor.setId(1);
			instructor.setFirstName("Ali ");
			instructor.setLastName("Deniz ");
			instructor.setEmail("ali@gmail.com");
			instructor.setCoursesInstructor("Java");
			
	 Student student1 = new Student( 2, "Ay�e ", "Y�ld�z ", "ayse@gmail.com", "67890","Java");
	 Student student2 = new Student( 3, "Elif ", "Y�ksel ", "elif@gmail.com", "66666", "Python");
	 Student student3 = new Student( 4, "Veli ", "G�nd�z ", "veli@gmail.com", "89789", "Java");
     
	 StudentManager student = new StudentManager();
	 student.addLesson(student3); 
	 
	 InstructorManager instructor2= new InstructorManager();
	 instructor2.teachCourses(instructor);
		
	 UserManager user=new UserManager();
		 user.login(student1);
		 user.logout(instructor);
		 user.signup(student2);
		 user.deleteSign(student3);
		
	}
		
}

