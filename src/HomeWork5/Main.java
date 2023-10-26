package HomeWork5;

import HomeWork5.Model.StudentModel;
import HomeWork5.Model.TeacherModel;
import HomeWork5.View.UserView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherModel teacher = new TeacherModel("Petr Ivanch", 50, "001");
        StudentModel student1 = new StudentModel("Petr Ivanov", 22, "k003");
        StudentModel student2 = new StudentModel("Sveta Shivaeva", 20, "k005");
        UserView userView = new UserView();
        userView.saveGroup(new TeacherModel(teacher.getTeacherId()),
                (List.of(new StudentModel(student1.getStudentId()), new StudentModel(student2.getStudentId()))), "group1");
        userView.getGroup("group1");
//        userView.getGroup("group2");
    }
}
