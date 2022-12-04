package oopseminar2.view;

import java.util.logging.Logger;
import java.util.List;
import oopseminar2.data.Student;
import oopseminar2.data.Teacher;

public class StudyGroupView {
    public void sendOnConsole(Teacher teacher , List<Student> students){
        Logger logger = Logger.getAnonymousLogger();

        logger.info(teacher.toString());
        for(Student student: students){
            logger.info(student.toString());
        }
    }
}
