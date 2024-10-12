package raisetech.StudentManagement;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentRepository {

  @Select("SELECT * FROM flag WHERE name = #{name}")
  Student searchByName(String name);
}
