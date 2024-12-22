package raisetech.StudentManagement;

import java.time.LocalDateTime;
import lombok.Getter;
import  lombok.Setter;

@Getter
@Setter

public class studentsCourses {
  private String CourseID;
  private String ID;
  private String course;
  private LocalDateTime Startday;
  private LocalDateTime Endday;
}
