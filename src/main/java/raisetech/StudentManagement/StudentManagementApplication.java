package raisetech.StudentManagement;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
class StudentManagementApplication {

	@Autowired
	private StudentRepository repository;


	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	@GetMapping("/student")
	public  String getStudent(@RequestParam String name){
		Student student= repository.searchByName(name);
		return student.getName()+" " + student.getAge() + "歳";
	}

	//ターミナルでnameとage両方変更可
	@PostMapping("/student")
	public void registerStudent(String name , int age){
		repository.registerStudent(name,age);
	}

	//ターミナルでnameのみ変更可
	@PatchMapping("/student")
	public void updateStudentName(String name, int age){
		repository.updateStudent(name,age);
	}

	@GetMapping("/studentlist")
	public List<Student> getAllStudents() {
		return repository.findAllStudents();
	}

	@DeleteMapping("/student")
	public void deleteStudent(String name){
		repository.deleteStudent(name);
	}



	/*@PostMapping("/studentInfo2")
	public void updateStudentInfo2(String name2,String age2){
		this.name2=name2;
		this.age2=age2;
	}*/

}
//Win版コマンドプロンプトでは' 'ではなく" "で打つこと推奨
