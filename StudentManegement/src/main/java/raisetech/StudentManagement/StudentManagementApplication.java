package raisetech.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
class StudentManagementApplication {

	@Autowired
	private StudentRepository repository;

	private String name = "Enami Kouji";
	private String age = "37";


	private String name2="Tanaka";
	private String age2 = "30";


	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	@GetMapping("/student")
	public  String getStudent(){
		Student student= repository.searchByName("kouchi");
		return student.getName()+" " + student.getAge() + "歳";
	}

	//ターミナルでnameとage両方変更可
	@PostMapping("/student")
	public void registerStudent(String name , int age){
		repository.registerStudent(name,age);
	}

	//ターミナルでnameのみ変更可
	@PostMapping("/studentName")
	public void updateStudentName(String name){
		this.name=name;
	}

	@PostMapping("/studentInfo2")
	public void updateStudentInfo2(String name2,String age2){
		this.name2=name2;
		this.age2=age2;
	}

}
//Win版コマンドプロンプトでは' 'ではなく" "で打つこと推奨
