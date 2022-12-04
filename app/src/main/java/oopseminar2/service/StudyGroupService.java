package oopseminar2.service;

import java.util.List;
import java.util.ArrayList;
import oopseminar2.data.StudyGroup;
import oopseminar2.data.Teacher;
import oopseminar2.data.Student;

public class StudyGroupService {

    private final List<StudyGroup> studyGroups;

    public StudyGroupService(){
        this.studyGroups = new ArrayList<StudyGroup>();
    }

    public void createStudyGroup(Teacher teacher, List<Student> students) {
        Long id = 0L;
        for (StudyGroup group: studyGroups) {
            if (group instanceof StudyGroup){
                if (id < group.getStudyGroupId()) {
                    id = group.getStudyGroupId();
                }
            }
        }
        StudyGroup studyGroup = new StudyGroup(teacher, students, id);
        studyGroups.add(studyGroup);
    }

    public List<StudyGroup> getAll() {
        return this.studyGroups;
    }


    
}
