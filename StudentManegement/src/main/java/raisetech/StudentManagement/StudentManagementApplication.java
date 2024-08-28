package raisetech.StudentManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	private String name = "Enami Kouji";
	private String age = "37";

	private String name2="Tanaka";
	private String age2 = "30";


	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	@GetMapping("/studentInfo")
	public  String getStudentInfo(){
		return name+ " " + age + "歳" +" "+ name2+" " + age2 + "歳";
	}

	//ターミナルでnameとage両方変更可
	@PostMapping("/studentInfo")
	public void setStudentInfo(String name , String age,String name2 , String age2){
		this.name=name;
		this.age=age;
		this.name2=name2;
		this.age2=age2;
	}

	//ターミナルでnameのみ変更可
	@PostMapping("/studentname")
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
