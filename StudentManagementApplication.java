package raisetech.StudentManagement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
class StudentManagementApplication {

	@Autowired
	private StudentRepository repository;


	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	/*@GetMapping("/studentList")
	public  List<Student> getStudentList(){
		return repository.search();
	}*/

	@GetMapping("/students_courses")
	public  List<studentsCourses>getCoursesList(){
		return repository.search();
	}



	/*@PostMapping("/studentInfo2")
	public void updateStudentInfo2(String name2,String age2){
		this.name2=name2;
		this.age2=age2;
	}*/

}
//Win版コマンドプロンプトでは' 'ではなく" "で打つこと推奨
