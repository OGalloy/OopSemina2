package oopseminar2.controller;

import java.util.List;

import oopseminar2.data.User;
import oopseminar2.service.StudyGroupService;
import oopseminar2.service.UserService;
import oopseminar2.view.StudentView;
import oopseminar2.view.StudyGroupView;
import oopseminar2.data.Student;
import oopseminar2.data.Teacher;

public class Controller {
    
    private final UserService userService = new UserService(null);
    private final StudentView studentView = new StudentView();
    private final StudyGroupView studyGroupView = new StudyGroupView();

    public void createUser(String firstName, String lastName, String patronymic) {
        userService.createUser(firstName, lastName, patronymic);
        List<User> users = userService.getAll();
        studentView.sendOnConsole(users);
    }
    //Создаём учебную группу, выводим всех студентов группы и учителя группы
    public void createStudyGroup(Teacher teacher, List<Student> students) {
        StudyGroupService studyGroupService = new StudyGroupService();
        studyGroupService.createStudyGroup(teacher, students);
        studyGroupView.sendOnConsole(teacher, students);
    }
}
