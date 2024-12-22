package raisetech.StudentManagement;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StudentRepository {



  //@Select("SELECT * FROM students ")
  //List<Student> search();

  @Select("SELECT * FROM students_courses")
  List<studentsCourses>search();



  @Insert("INSERT flag values(#{name}, #{age})")
  void registerStudent(String name, int age);

  @Update("UPDATE flag SET age= #{age} WHERE name = #{name}")
  void updateStudent(String name, int age);

  @Delete("DELETE FROM flag WHERE name = #{name}")
  void deleteStudent(String name);

  //@Select("SELECT * FROM flag")//リストを表示
  //List<Student> findAllStudents();

}